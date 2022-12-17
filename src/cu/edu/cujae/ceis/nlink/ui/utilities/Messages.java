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
package cu.edu.cujae.ceis.nlink.ui.utilities;

import javax.swing.JOptionPane;

/**
 *
 * @author Javier Marrero
 */
public class Messages
{
    public static void showExceptionMessage(Throwable throwable)
    {
        JOptionPane.showMessageDialog(null, throwable, throwable.getClass().getSimpleName(), JOptionPane.ERROR_MESSAGE);
    }
}
