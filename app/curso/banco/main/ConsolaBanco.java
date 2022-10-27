package app.curso.banco.main;
import java.util.HashMap;
import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;
import java.util.Scanner;

public class ConsolaBanco {
    public static void main(String[] args){

        HashMap <Integer, Cliente> clientes = new HashMap<>();
        HashMap<Integer,Gestor> gestores = new HashMap<>();

        // Insertar gestor y cliente (Punto 1 & 7) de la actividad del modulo 03
        System.out.println("********Menu********");
        System.out.println("1: Crear Gestores");
        System.out.println("2: Crear Clientes");
        System.out.println("3: Obtener Gestor");
        System.out.println("4: Obtener Cliente");
        System.out.println("5: Salir");

        System.out.print("Introduce un número: ");
		Scanner keyboard = new Scanner(System.in);
		int numero = keyboard.nextInt();
		keyboard.close();
		
		switch (numero) {
		case 1:
			System.out.println("+++Gestores+++");
			break;
		case 2:
			System.out.println("+++Clientes+++");
			break;
		case 3:
			System.out.println("+++Transferencias+++");
			break;
		case 4:
			System.out.println("+++Mensajes+++");
			break;
		case 5:
			System.out.println("+++Prestamos+++");
			break;
		default:
			System.out.println("+++No existe esta opción+++");
		}

        





    }
}
