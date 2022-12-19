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

/**
 *
 * @author Javier Marrero
 */
public interface ConfigurationKeys
{
    // UI
    public static final String LOOK_AND_FEEL = "ui.laf";
    public static final String SHOW_EXIT_CONFIRMATION = "ui.show_exit_confirmation";
    
    // LOGIC
    public static final String HIDDEN_LAYER_NEURON_COUNT = "nn.hidden_layer_count";
    public static final String ETA_FACTOR = "nn.eta_learning_factor";
    
    // DATABASES
    public static final String TRAINING_DATA_BASE = "io.training_database";
    public static final String LOG_FOLDER_PATH = "io.log_folder";
}
