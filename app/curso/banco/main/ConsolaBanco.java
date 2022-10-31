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
			System.out.println("********Menu********");
			System.out.println("1: Crear Gestor");
			System.out.println("2: Insercion Masiva de gestores con datos aleatorios");
			System.out.println("3: Obtener un Gestor");
			System.out.println("4: Obtener todos los gestores");
			System.out.println("5: Actualizar un gestor");
			System.out.println("6: Eliminar un gestor");
			System.out.println("7: Crear Clientes");
			System.out.println("8: Obtener Cliente");
			System.out.println("9: Obtener todos los clientes");
			System.out.println("10: Actualización de un cliente");
			System.out.println("11: Eliminación de un cliente");
			System.out.println("12: Obtención de un mensaje");
			System.out.println("13: Obtención de todos los mensajes");
			System.out.println("14: Envío de un mensaje");
			System.out.println("15: Obtención de una transferencia");
			System.out.println("16: Obtención de todas las trasferencias");
			System.out.println("17: Envío de una transferencia");
			System.out.println("18:  Login y registro");
			System.out.println("0: Salir");
			System.out.println("********************");

			System.out.print("Introduce un número: ");
			numero = keyboard.nextInt();
			
			int idGestor = 0;
			int idCliente = 0;

			switch (numero) {
			case 1:
				// Crear Gestor
				idGestor ++;
				System.out.print("Ingrese NOMBRE Gestor: ");
				String nombreGestor = keyboard.next();
				System.out.print("Ingrese TELEFONO Gestor: ");
				String telefGestor = keyboard.next();
				System.out.print("Ingrese ID OFICINA Gestor: ");
				int ofiGestor = keyboard.nextInt();

				Gestor gestor = new Gestor(idGestor, nombreGestor, telefGestor, ofiGestor);
				gestores.put(idGestor, gestor);
			break;
			case 2:
				// Insercion Masiva de gestores con datos aleatorios
				System.out.print("Cuantos gestores desea ingresar: ");
				int cantGestores = keyboard.nextInt();
				System.out.println("************Aleatorio***********");
		
					for (int i = 0; i < cantGestores; i++){
						idGestor ++;
						String nombreAleatorio = Utiles.nombreAleatorio(Utiles.NOMBRES, Utiles.APELLIDOS);
						System.out.println("Se ha insertado aleatoriamente: " + nombreAleatorio);
						System.out.println("----------------------------------------------");
						Gestor gestorAle = new Gestor(idGestor, nombreAleatorio);
						gestores.put(idGestor, gestorAle);
					}
			break;
			case 3:
				// Obtener un Gestor
				System.out.print("Ingrese ID Gestor para buscar: ");
				int idGestorSearch = keyboard.nextInt();
				Gestor gestorSearch = gestores.get(idGestorSearch);

				if(gestorSearch != null){
					System.out.println("----------------------------------------------");
					gestorSearch.mostrarInfo();
					System.out.println("----------------------------------------------");
				}else{
					System.out.println("El ID GESTOR no existe");
                }
			break;
			case 4:
				// Obtener todos los gestores
				System.out.println("************Gestores************");
				gestores.forEach((a, b) ->{
					b.mostrarInfo();
					System.out.println("----------------------------------------------");
				});
			break;
			case 5:
				// Actualizar un gestor :(
				System.out.print("Ingrese el ID gestor a Actualizar: ");
				int idGestorUpdate = keyboard.nextInt();
				Gestor gestorUpdated = gestores.get(idGestorUpdate);
			
				System.out.print("Ingrese NOMBRE gestor: ");
				String nombreGestorUpdate = keyboard.next();
				System.out.print("Ingrese TELEFONO gestor: ");
				String telefonoGestorUpdate = keyboard.next();
				System.out.print("Ingrese ID OFICINA Gestor: ");
				int oficinaGestorUpdate = keyboard.nextInt();

				gestorUpdated.setNombre(nombreGestorUpdate);
				gestorUpdated.setTelefono(telefonoGestorUpdate);
				gestorUpdated.setIdOficina(oficinaGestorUpdate);

			break;
			case 6:
				// Eliminar un gestor
				System.out.print("Ingrese el ID GESTOR a eliminar: ");
				int idGestorDelete = keyboard.nextInt();
				Gestor gestorDeleted = gestores.get(idGestorDelete);

				if(gestorDeleted != null) {
					gestores.remove(idGestorDelete);
					System.out.println("Se ha eliminado el gestor");
				}else{
					System.out.println("El ID GESTOR no existe");
				}
			break;
			case 7:
				// Crear Clientes
				idCliente ++;
				System.out.print("Ingrese NOMBRE Cliente: ");
				String nombreCliente = keyboard.next();
				System.out.print("Ingrese TELEFONO Cliente: ");
				String telefCliente = keyboard.next();

				Cliente cliente = new Cliente(idCliente, nombreCliente, telefCliente);
				clientes.put(idCliente, cliente);
			break;
			case 8:
				// Obtener un Cliente
				System.out.print("Ingrese ID Cliente para buscar: ");
				int idClienteSearch = keyboard.nextInt();
				Gestor clienteSearch = gestores.get(idClienteSearch);

				if(clienteSearch != null){
					System.out.println("----------------------------------------------");
					clienteSearch.mostrarInfo();
					System.out.println("----------------------------------------------");
				}else{
					System.out.println("El ID CLIENTE no existe");
				}
			break;
			case 9:
				// Obtener todos los clientes
				System.out.println("************Clientes************");
				clientes.forEach((a, b) ->{
					b.mostrarInfo();
					System.out.println("----------------------------------------------");
				});
			break;
			case 10:
				// Actualización de un cliente
			break;
			case 11:
				//Eliminar un cliente
				System.out.print("Ingrese ID CLIENTE a eliminar: ");
				int idClienteDelete = keyboard.nextInt();
				Cliente clienteDeleted = clientes.get(idClienteDelete);
				if(clienteDeleted != null) {
					clientes.remove(idClienteDelete);
					System.out.println("Se ha eliminado el cliente");
				}else{
					System.out.println("El ID GESTOR no existe");
				}
			break;
			case 12:
				// Obtención de un mensaje
			break;
			case 13:
				// Obtención de todos los mensajes
			break;
			case 14:
				// Envío de un mensaje
			break;
			case 15:
				// Obtención de una transferencia
			break;
			case 16:
				// Obtención de todas las trasferencias
			break;
			case 17:
				// Envío de una transferencia
			break;
			case 18:
				// Login y registro
			break;
			case 0:
				System.out.println("************Saliendo************");
				break;
			default:
				System.out.println("+++No existe esta opción+++");
			}
		} while (numero != 0);
		keyboard.close();
		
    }
}
