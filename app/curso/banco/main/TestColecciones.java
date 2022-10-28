package app.curso.banco.main;
import java.util.ArrayList;

public class TestColecciones {
    public static void main (String[] args){

    // Array de enteros
    ArrayList<Integer> lista = new ArrayList<>();

        // Añadir un elemento
        for(int i=0; i<=20; i++) {
            lista.add(i);
        }

        // Tamaño de la lista
        for(int i=0; i<lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println(lista);

        // Iterar ArrayList sin tener en cuenta posiciones
        for(Integer numero: lista){
            System.out.println("Este es el numero"+numero);
        }

        // Eliminar elemento
        int listaSize = lista.size();
        for(int i=0; i<listaSize; i++) {
            lista.remove(0);
        }

        System.out.println(lista);

    }
}
