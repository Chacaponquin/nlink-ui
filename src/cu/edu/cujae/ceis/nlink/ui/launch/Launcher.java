package cu.edu.cujae.ceis.nlink.ui.launch;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatGitHubDarkContrastIJTheme;
import cu.edu.cujae.ceis.nlink.mvc.ApplicationController;
import cu.edu.cujae.ceis.nlink.ui.io.ConfigurationManager;
import cu.edu.cujae.ceis.nlink.ui.io.FileManager;
import cu.edu.cujae.ceis.nlink.ui.utilities.Messages;
import cu.edu.cujae.ceis.nlink.ui.views.MainWindow;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.flexdock.docking.DockingManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Hector Angel Gomez
 */
public class Launcher
{

    private static final Logger LOGGER = LoggerFactory.getLogger(Launcher.class);

    public static void main(String[] args)
    {
        // Look and feels
        UIManager.installLookAndFeel(FlatGitHubDarkContrastIJTheme.NAME, FlatGitHubDarkContrastIJTheme.class.getName());
        // -------------

        FileManager fileManager = FileManager.getFileManager();
        ConfigurationManager configurationManager;
        try
        {
            configurationManager = ConfigurationManager.getConfigurationManager();
        }
        catch (IOException | ConfigurationException ex)
        {
            LOGGER.error("Imposible iniciar la aplicación, error {}", ex);
            Messages.showExceptionMessage(ex);

            System.exit(1);
            return;
        }

        try
        {
            String currentLookAndFeel = configurationManager.getConfigurationObject().getString(
                    ConfigurationManager.LOOK_AND_FEEL);
            boolean set = false;

            LookAndFeelInfo[] available = UIManager.getInstalledLookAndFeels();
            for (LookAndFeelInfo info : available)
            {
                if (info.getClassName() == null ? currentLookAndFeel == null
                            : info.getClassName().equals(currentLookAndFeel))
                {
                    UIManager.setLookAndFeel(info.getClassName());
                    set = true;
                    break;
                }
            }

            if (!set)
            {
                UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            }
        }
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException
                       | IllegalAccessException ex)
        {
            LOGGER.error("unsupported look and feel {}", ex);
            Messages.showExceptionMessage(ex);
        }

        SwingUtilities.invokeLater(() -> 
        {
            SplashScreen splashScreen = new SplashScreen();
            try
            {
                SplashScreenWorker task = new SplashScreenWorker(splashScreen, configurationManager, fileManager);
                task.execute();
                splashScreen.setVisible(true);

                new MainWindow(task.get()).setVisible(true);

                try
                {
                    task.get().loadDefaultDataBase();
                }
                catch (IOException ex)
                {
                    LOGGER.error("error al cargar la BD inicial", ex);
                    Messages.showExceptionMessage(ex);
                }
            }
            catch (InterruptedException | ExecutionException ex)
            {
                Messages.showExceptionMessage(ex);
                LOGGER.error("unhandled exception.", ex);

                splashScreen.dispose();
            }
        });
    }

    private static class SplashScreenWorker extends SwingWorker<ApplicationController, Object>
    {

        private final SplashScreen splashScreen;
        private final ConfigurationManager configurationManager;
        private final FileManager fileManager;

        public SplashScreenWorker(SplashScreen splashScreen, ConfigurationManager configurationManager,
                                  FileManager fileManager)
        {
            this.splashScreen = splashScreen;
            this.configurationManager = configurationManager;
            this.fileManager = fileManager;
        }

        @Override
        protected ApplicationController doInBackground() throws Exception
        {
            DockingManager.setAutoPersist(true);
            
            ApplicationController controller = new ApplicationController(configurationManager, fileManager);
            controller.reloadNeuralNetwork();

            return controller;
        }

        @Override
        protected void done()
        {
            splashScreen.dispose();
        }
    }
}
