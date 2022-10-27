package app.curso.banco.main;
import java.util.HashMap;

public class TestHashMap {
    public static void main (String[] args){

        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(2, "PACO");
        String enPosicion2 = mapa.get(2);
        System.out.println("En la posicion 2 esta: " + enPosicion2);
        mapa.put(2, "ANA");
        enPosicion2 = mapa.get(2);
        System.out.println("En la posicion 2 esta: " + enPosicion2);
        String noExiste = mapa.get(47);
        System.out.println("En la posicion 47 esta: " + noExiste);


        mapa.clear();
        enPosicion2 = mapa.get(2);
        System.out.println("En la posicion 2 esta: "+enPosicion2);
        mapa.forEach((clave,valor) ->{
            System.out.println("En ls poicion " + clave+" - "+valor);
        });


    }
}
