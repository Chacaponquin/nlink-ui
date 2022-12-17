package cu.edu.cujae.ceis.nlink.ui.launch;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme;
import cu.edu.cujae.ceis.nlink.ui.io.ConfigurationManager;
import cu.edu.cujae.ceis.nlink.ui.io.FileManager;
import cu.edu.cujae.ceis.nlink.ui.utilities.Messages;
import cu.edu.cujae.ceis.nlink.ui.views.MainWindow;
import java.io.IOException;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
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
        try
        {
            UIManager.setLookAndFeel(new FlatArcDarkContrastIJTheme());
        }
        catch (UnsupportedLookAndFeelException ex)
        {
            LOGGER.error("unsupported look and feel {}", ex);
            Messages.showExceptionMessage(ex);
        }

        SwingUtilities.invokeLater(() -> 
        {
            FileManager fileManager = FileManager.getFileManager();
            ConfigurationManager configurationManager;
            try
            {
                configurationManager = ConfigurationManager.getConfigurationManager();
            }
            catch (IOException ex)
            {
                LOGGER.error("Imposible iniciar la aplicación, error {}", ex);
                Messages.showExceptionMessage(ex);
                
                System.exit(1);
                return;
            }
            
            new MainWindow(fileManager, configurationManager).setVisible(true);
        });
    }
   
}
