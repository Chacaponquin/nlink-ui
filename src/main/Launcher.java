package main;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatArcDarkContrastIJTheme;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ui.UI;

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
            LOGGER.info("unsupported look and feel {}", ex);
            JOptionPane.showMessageDialog(null, ex, ex.getClass().getSimpleName(), JOptionPane.ERROR_MESSAGE);
        }

        SwingUtilities.invokeLater(() -> 
        {
            UI main = new UI();
            main.setVisible(true);
        });
    }
}
