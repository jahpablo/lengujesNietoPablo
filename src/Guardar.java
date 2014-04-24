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

public class Guardar {
    
    public static void guardar(String path, Preguntas p){
        File f = new File(path);
        try(PrintWriter bw = new PrintWriter(new FileWriter(f, true))){
            bw.println(p.getId());
            bw.println(p.getTexto());
            ArrayList<Respuesta> rList = p.getRespuestas();
            for(Respuesta r : rList){
                bw.println(r.getTexto());
                bw.println(r.isValor());
            }
            bw.println();
        }catch(IOException ex){
                ex.printStackTrace();
        }
    }
    
}
