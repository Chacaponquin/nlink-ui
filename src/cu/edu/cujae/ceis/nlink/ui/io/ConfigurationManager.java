/*
 * Copyright (C) 2022 Javier Marrero
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package cu.edu.cujae.ceis.nlink.ui.io;

import com.formdev.flatlaf.intellijthemes.FlatArcDarkOrangeIJTheme;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Javier Marrero
 */
public final class ConfigurationManager implements ConfigurationKeys
{

    private static ConfigurationManager configurationManager = null;

    public static ConfigurationManager getConfigurationManager() throws IOException
    {
        if (configurationManager == null)
        {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

    private FileManager fileManager;
    private Properties properties;

    public ConfigurationManager() throws IOException
    {
        fileManager = FileManager.getFileManager();
        properties = new Properties();

        if (FileManager.CONFIGURATION_FILE.exists())
        {
            loadConfiguration();
        }
        else
        {
            loadDefaults();
            saveConfiguration();
        }
    }

    public void loadDefaults()
    {
        properties.setProperty(ConfigurationKeys.LOOK_AND_FEEL, FlatArcDarkOrangeIJTheme.class.getName());
    }

    public void loadConfiguration() throws FileNotFoundException, IOException
    {
        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(FileManager.CONFIGURATION_FILE)))
        {
            properties.load(bufferedReader);
        }
    }

    public void saveConfiguration() throws IOException
    {
        if (FileManager.CONFIGURATION_FILE.exists() == false)
            FileManager.CONFIGURATION_FILE.createNewFile();
        
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FileManager.CONFIGURATION_FILE)))
        {
            properties.store(bufferedWriter, "NLink configuration file");
        }
    }
}
