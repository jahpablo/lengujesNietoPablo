/**
 * @author Jah Pablo
 */
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class Cuestionario {

    public static Preguntas CrearCuestionario(ArrayList<JTextField> text,ArrayList<JRadioButton> radio){
       int id=Integer.parseInt(text.get(0).getText());
       ArrayList<Respuesta> cuestionario=new ArrayList<>();
       for(int i=0; i<4; i++){
           if(text.get(i+2).getText().length()!=0){
            Respuesta r=new Respuesta(id,text.get(i+2).getText(),radio.get(i).isSelected());
            cuestionario.add(r);
           }       
       }
       Preguntas p = new Preguntas(id,text.get(1).getText(),cuestionario);
       
       
           
       
       return p;
    }
   
}
