package app.curso.banco.main;
// import java.lang.Math;
import java.util.Random;
import app.curso.banco.util.Utiles;

public class TestRandom {
    public static void main(String[] args){

        Random random = new Random();
        // Numero entero Aleatorio
        int enteroAleatorio = random.nextInt(100);
        System.out.println("Entero aleatorio: " + enteroAleatorio);
        // Numero decimal Aleatorio
        double decimalAleatorio = random.nextDouble(100);
        System.out.println("Decimal aleatorio: " + decimalAleatorio);
        // Booleano Aleatorio
        boolean booleanoAleatorio = random.nextBoolean();
        System.out.println("Booleano aleatorio: " + booleanoAleatorio);
        // Nombres Aleatorio
        String [] nombres = {"JUAN", "ANTONIA", "PACO", "IRENE"};
        String [] apellidos = {"LOPEZ", "GARCIA", "SOTILLO", "AGUILERA"};

        // int iNombre = random.nextInt(nombres.length);
        // int iApellido = random.nextInt(apellidos.length);

        // String nombreAleatorio = nombres[iNombre];
        // String apellidoAleatorio = apellidos[iApellido];

        // System.out.println("El indice es : " + iNombre + " y el nombre aleatorio es: " + nombreAleatorio);
        // System.out.println("El indice es : " + iApellido + " y el apellido aleatorio es: " + apellidoAleatorio);
        // System.out.println("Nombre Completo Aleatorio: " + nombreAleatorio + " " + apellidoAleatorio);

        for (int i = 0; i < 10; i++){

            String nombreAleatorio = Utiles.nombreAleatorio(Utiles.NOMBRES, apellidos);
            System.out.println(nombreAleatorio);
            // String [] apellidos2 = Utiles.APELLIDOS;

            // Sin el utiles
            // int iNombre = random.nextInt(nombres.length);
            // int iApellido = random.nextInt(apellidos.length);
    
            // String nombreAleatorio = nombres[iNombre];
            // String apellidoAleatorio = apellidos[iApellido];

            // System.out.println("Nombre Completo Aleatorio: " + nombreAleatorio + " " + apellidoAleatorio);

        }
    }
}
