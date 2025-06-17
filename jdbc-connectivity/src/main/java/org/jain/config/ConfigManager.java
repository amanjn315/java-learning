/*
 * Copyright (c) 2025.
 * This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package org.jain.config;

/**
 * @author amanjain
 **/
public class ConfigManager {
    //volatile ensures visibility across threads
    private static volatile ConfigManager instance;

    private ConfigManager() {
        System.out.println("Loading configuration...");
    }

    public static ConfigManager getInstance() {
        if(instance == null){
            synchronized (ConfigManager.class) {
                if(instance == null){
                    instance = new ConfigManager();
                }
            }
        }
        return instance;
    }

    public void printConfig(){
        System.out.println("DB_URL = jdbc:postgresql://localhost:5432/mydb");
    }
}
