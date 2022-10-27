package app.curso.banco.main;
import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;

public class Main {
    public static void main (String[] args){

        Cliente c1 = new Cliente(1, "Paco", "(+34) 123 456 789",10.0f);
        Gestor g1 = new Gestor(1, "Jose", "(+34) 123 456 789",10);
        c1.mostrarInfo();
        c1.ingresarDinero(150);
        c1.retirarDinero("",250f);
        c1.mostrarInfo();
        g1.mostrarInfo();
    }
}
