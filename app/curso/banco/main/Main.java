package app.curso.banco.main;
import app.curso.banco.entidad.*;

public class Main {
    public static void main (String[] args){

        Cliente c1 = new Cliente(1, "Paco", "(+34) 123 456 789",10.0f);
        Gestor g1 = new Gestor(1, "Jose", "(+34) 123 456 789",10);
        // c1.mostrarInfo();
        c1.ingresarDinero(150);
        c1.retirarDinero("",250f);
        // c1.mostrarInfo();
        // g1.mostrarInfo();


        // Mensaje m1 = new Mensaje();
        Mensaje m2 = new Mensaje(1, Mensaje.TIPO_CLIENTE, c1.getId(), Mensaje.TIPO_GESTOR, g1.getId(), "Mensaje de prueba");
        System.out.println("Mensaje como texto: " + m2);

        // Persona usuario1 = new Persona(userName, password);
        // Gestor gestor1 = new Gestor(idUsuario);
    }
}
