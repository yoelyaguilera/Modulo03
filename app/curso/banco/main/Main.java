package app.curso.banco.main;
import app.curso.banco.entidad.Cliente;

public class Main {
    public static void main (String[] args){

        Cliente c1 = new Cliente(1, "Paco", "(+34) 000 000 000");
        c1.mostrarInfo();
    }
}
