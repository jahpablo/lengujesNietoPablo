/**
 * @author Jah Pablo
 */
public class Respuesta {
    private int id;
    private String texto;
    private boolean valor;
    
    public Respuesta(int id, String texto, boolean valor){
        this.id=id;
        this.texto=texto;
        this.valor=valor;
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

    public boolean isValor() {
        return valor;
    }

    public void setValor(boolean valor) {
        this.valor = valor;
    }
            
}
