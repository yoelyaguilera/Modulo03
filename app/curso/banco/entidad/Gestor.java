package app.curso.banco.entidad;

public class Gestor extends Persona{
    private int idOficina;

    public Gestor(){
        
    }
    public Gestor(int id, String nombre, String telefono, int idOficina) {
        super(id, nombre, telefono);
        this.idOficina = idOficina;
    }

    
    public float getIdOficina(){
        return this.idOficina;
    }

    public void setIdOficina(int idOficina){
        this.idOficina = idOficina;
    }
    public void mostrarInfo (){
        super.mostrarInfo();
        System.out.println("El id oficina es: " + this.idOficina);
    } 
}
