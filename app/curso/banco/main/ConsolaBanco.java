package app.curso.banco.main;
import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;
import app.curso.banco.util.Utiles;

public class ConsolaBanco {
    public static void main(String[] args){

        HashMap <Integer, Cliente> clientes = new HashMap<>();
        HashMap<Integer,Gestor> gestores = new HashMap<>();
		Scanner keyboard = new Scanner(System.in);
		int numero;
		do {

        // Insertar gestor y cliente (Punto 1 & 7) de la actividad del modulo 03
        System.out.println("********Menu********");
        System.out.println("1: Crear Gestores");
        System.out.println("2: Crear Clientes");
        System.out.println("3: Obtener Gestor");
        System.out.println("4: Obtener Cliente");
        System.out.println("5: Insercion Masiva de gestores con datos aleatorios");
        System.out.println("6: Obtener todos los gestores");
        System.out.println("7: Actualizar un gestor");
        System.out.println("8: Eliminar un gestor");
        System.out.println("0: Salir");
		System.out.println("********************");

        System.out.print("Introduce un número: ");
		numero = keyboard.nextInt();
		
		switch (numero) {
		case 1:
			System.out.print("Ingrese ID Gestor: ");
			int idGestor = keyboard.nextInt();
			System.out.print("Ingrese NOMBRE Gestor: ");
			String nombreGestor = keyboard.next();
			System.out.print("Ingrese TELEFONO Gestor: ");
			String telefGestor = keyboard.next();
			System.out.print("Ingrese IDOFICINA Gestor: ");
			int ofiGestor = keyboard.nextInt();

			Gestor gestor = new Gestor(idGestor, nombreGestor, telefGestor, ofiGestor);
			gestores.put(idGestor, gestor);

			break;
		case 2:
			System.out.print("Ingrese ID Cliente: ");
			int idCliente = keyboard.nextInt();
			System.out.print("Ingrese NOMBRE Cliente: ");
			String nombreCliente = keyboard.next();
			System.out.print("Ingrese TELEFONO Cliente: ");
			String telefCliente = keyboard.next();

			Cliente cliente = new Cliente(idCliente, nombreCliente, telefCliente);
			clientes.put(idCliente, cliente);

			break;
		case 3:
			System.out.print("Ingrese ID Gestor para buscar: ");
			int idGestorSearch = keyboard.nextInt();
			Gestor gestorSearch = gestores.get(idGestorSearch);
			gestorSearch.mostrarInfo();

			break;
		case 4:
			System.out.print("Ingrese ID Cliente para buscar: ");
			int idClienteSearch = keyboard.nextInt();
			Gestor clienteSearch = gestores.get(idClienteSearch);
			clienteSearch.mostrarInfo();

			break;

		case 5:
		System.out.print("Cuantos gestores desea ingresar: ");
		int cantGestores = keyboard.nextInt();
		System.out.println("************Aleatorio***********");

			for (int i = 0; i < cantGestores; i++){
				String nombreAleatorio = Utiles.nombreAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS);
				System.out.println("Se ha insertado aleatoriamente: " + nombreAleatorio);
				System.out.println("----------------------------------------------");
				Gestor gestorAle = new Gestor(i, nombreAleatorio);
				gestores.put(i, gestorAle);
			}

			break;
		case 6:
			System.out.println("************Gestores***********");
			gestores.forEach((a, b) ->{
				b.mostrarInfo();
				System.out.println("----------------------------------------------");
			});

			break;
		
		case 7:



		
			break;
		case 0:
			System.out.println("+++Salir+++");
			break;
		default:
			System.out.println("+++No existe esta opción+++");
		}
	
		
		} while (numero != 0);
		keyboard.close();
		

    }
}
