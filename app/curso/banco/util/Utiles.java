package app.curso.banco.util;
import java.util.Random;

public class Utiles {

    public static final String [] NOMBRES = {"JUAN", "ANTONIA", "PACO", "IRENE"};
    public static final String [] APELLIDOS = {"LOPEZ", "GARCIA", "SOTILLO", "AGUILERA"};

    public static String nombreAleatorio(String [] nombres, String[] apellidos){
        Random random = new Random();

        int iNombre = random.nextInt(nombres.length);
        String nombreAleatorio = nombres[iNombre];

        int iApellido = random.nextInt(apellidos.length);
        String apellidoAleatorio = apellidos[iApellido];
        
        String nombreCompleto = nombreAleatorio + " " + apellidoAleatorio;
        System.out.println(nombreCompleto);

        return nombreCompleto;
   }

    public static String nombreAleatorio(){
        return nombreAleatorio(NOMBRES, APELLIDOS);
    }


}
