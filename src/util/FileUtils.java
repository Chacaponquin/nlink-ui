/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


/**
 *
 * @author Hector Angel Gomez
 */
public class FileUtils {
    public static ArrayList<TrainerData> allData = new ArrayList();
    
    public static void printAllData(){
        for(TrainerData d:FileUtils.allData){
            d.printData();
        }
    }
    
    public static void readDataBase(){   
        FileUtils.allData = new ArrayList();
        Path rootDir = Paths.get(".").normalize().toAbsolutePath();
        File file = new File(rootDir.toString() + "/src/data/" + "bezdekIris.data");
        
        if (file.exists()) {
        try {
            Reader input = new FileReader(file);
           
            BufferedReader br = new BufferedReader(input);
            String line = br.readLine();
            while (line != null && !line.equals("")) {       
                String[] values = line.split(",");
                
                float val1 = 0;
                float val2 = 0;
                float val3 = 0;
                float val4 = 0;
                String result = "";
                
                for(int i = 0; i < values.length; i++){
                    if(!values[i].equals("")){
                    switch(i){
                        case 0 -> val1 = Float.parseFloat(values[i]);
                        case 1 -> val2 = Float.parseFloat(values[i]);
                        case 2 -> val3 = Float.parseFloat(values[i]);
                        case 3 -> val4 = Float.parseFloat(values[i]);
                        default -> result = values[i];
                    }
                    }
                }
                
                TrainerData data = new TrainerData(val1, val2, val3, val4, result);
                FileUtils.allData.add(data);
                
                line = br.readLine();
            }
            // Closes the reader
            input.close();
        }  catch (IOException e) {
            System.out.println("Error leer archivo");
        }
    }
        
        FileUtils.printAllData();
    }
}
