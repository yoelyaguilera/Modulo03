package app.curso.banco.entidad;

public class Transferencia extends Mensaje {
    private float dinero;
    
    public Transferencia(){

    }
    
    public Transferencia(int id, char tipoEmisor, int idEmisor, char tipoReceptor, int idReceptor, String textoMensaje, float dinero){
        super(id,tipoEmisor, idEmisor, tipoReceptor, idReceptor, textoMensaje);
        this.dinero = dinero;

    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public float getDinero() {
        return dinero;
    }

    public String toString(){
        String texto = super.toString();
        texto += " Dinero: " + this.dinero + "euro";
        return texto;
    }
    
}
