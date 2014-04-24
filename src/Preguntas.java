/*
 * @author Jah Pablo
 */
import java.util.ArrayList;

public class Preguntas {
    private int id;
    private String texto;
    private ArrayList<Respuesta> Respuestas;
    
    public Preguntas(int id,String texto, ArrayList<Respuesta> Respuestas){
        this.id = id;
        this.texto = texto;
        this.Respuestas = Respuestas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<Respuesta> getRespuestas() {
        return Respuestas;
    }

    public void setRespuestas(ArrayList<Respuesta> Respuestas) {
        this.Respuestas = Respuestas;
    }
    
}
