/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jah Pablo
 */

import java.io.*;
import java.util.ArrayList;

public class Leer {
    public static ArrayList<Preguntas> leer(String path){
        ArrayList<Preguntas> arr = new ArrayList<>();
        ArrayList<String> archivo = new ArrayList<>();
        File f = new File(path);
        String temp = "";
        
        // Leemos el achivo y las lineas se guardan en "archivo"
        try(BufferedReader br = new BufferedReader(new FileReader(f))){
            while((temp = br.readLine()) != null){
                archivo.add(temp);
            }
        }catch(IOException ex){
                ex.printStackTrace();
        }
        
        // Con el arhcivo cerrado, se leen las preguntas
        int i = 0;
        while(i < archivo.size()){
            String preg = "";
            
            int id = Integer.parseInt(archivo.get(i));
            i++;
            
            preg = archivo.get(i);
            i++;
            
            ArrayList<Respuesta> r = new ArrayList<>();
            while(!(temp = archivo.get(i)).equals("")){
                i++;
                
                boolean b = Boolean.parseBoolean(archivo.get(i));
                i++;
                
                r.add(new Respuesta(id,temp,b));
            }
            i++;
            arr.add(new Preguntas(id,preg,r));
            
        }
        return arr;
    }
}
