/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cu.edu.cujae.ceis.nlink.ui.io;

import java.io.File;

/**
 *
 * @author Javier Marrero
 */
public class FileManager
{

    public static final File APPLICATION_DIRECTORY = new File("nlink/data");
    public static final File REPORT_DIRECTORY = new File(APPLICATION_DIRECTORY.getParentFile(), "logs");
    public static final File CONFIGURATION_FILE = new File(APPLICATION_DIRECTORY, "configuration.properties");
    public static final File NEURAL_NETWORK_WEIGHTS = new File(APPLICATION_DIRECTORY, "nlink-weights.db");
    public static final File NEURAL_NETWORK_DATABASE = new File(APPLICATION_DIRECTORY, "database.db");

    private static FileManager fileManager = null;

    public static FileManager getFileManager()
    {
        if (fileManager == null)
        {
            fileManager = new FileManager();
        }
        return fileManager;
    }

    public FileManager()
    {
        // Check if the start folder exists or not
        if (APPLICATION_DIRECTORY.exists() == false)
        {
            APPLICATION_DIRECTORY.mkdirs();
        }
        if (REPORT_DIRECTORY.exists() == false)
        {
            REPORT_DIRECTORY.mkdirs();
        }
    }

}
