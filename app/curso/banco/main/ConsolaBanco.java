package app.curso.banco.main;
import java.util.HashMap;
import java.util.Scanner;

import app.curso.banco.entidad.Cliente;
import app.curso.banco.entidad.Gestor;
import app.curso.banco.util.Utiles;
import app.curso.banco.entidad.Mensaje;
import app.curso.banco.entidad.Transferencia;

public class ConsolaBanco {
    public static void main(String[] args){

        HashMap <Integer, Cliente> clientes = new HashMap<>();
        HashMap<Integer,Gestor> gestores = new HashMap<>();
		HashMap<Integer, Mensaje> mensajes = new HashMap<>();
		HashMap<Integer, Transferencia> transferencias = new HashMap<>();
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
			System.out.println("18:  Login Clienteo");
			System.out.println("19:  registro");
			System.out.println("0: Salir");
			System.out.println("********************");

			System.out.print("Introduce un número: ");
			numero = keyboard.nextInt();
			
			int idGestor = 0;
			int idCliente = 0;
			int idMensaje = 0;
			int idTransferencia = 0;

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
				// Actualizar un gestor 
				System.out.print("Ingrese el ID GESTOR a Actualizar: ");
				int idGestorUpdate = keyboard.nextInt();
				Gestor gestorUpdated = gestores.get(idGestorUpdate);

				if (gestorUpdated != null) {
					System.out.println("NOTA: SI NO QUIERE CAMBIAR EL VALOR, INGRESE '0'");
					System.out.print("Ingrese NOMBRE gestor: ");
					String nombreGestorUpdate = keyboard.next();
					System.out.print("Ingrese TELEFONO gestor: ");
					String telefonoGestorUpdate = keyboard.next();
					System.out.print("Ingrese ID OFICINA Gestor: ");
					int oficinaGestorUpdate = keyboard.nextInt();

					if(!nombreGestorUpdate.equals("0")){
						gestorUpdated.setNombre(nombreGestorUpdate);
					}
					if(!telefonoGestorUpdate.equals("0")){
						gestorUpdated.setTelefono(telefonoGestorUpdate);
					}
					if(oficinaGestorUpdate != 0){
						gestorUpdated.setIdOficina(oficinaGestorUpdate);
					}
					System.out.println("Se ha actualizado el gestor");
				}else{
					System.out.println("El ID GESTOR no existe");
				}

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
				System.out.print("Ingrese ID CLIENTE para buscar: ");
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

				System.out.print("Ingrese el ID CLIENTE a Actualizar: ");
				int idClienteUpdate = keyboard.nextInt();
				Gestor clienteUpdated = gestores.get(idClienteUpdate);

				if(clienteUpdated != null){
					System.out.println("NOTA: SI NO QUIERE CAMBIAR EL VALOR, INGRESE '0'");
					System.out.print("Ingrese NOMBRE cliente: ");
					String nombreClienteUpdate = keyboard.next();
					System.out.print("Ingrese TELEFONO cliente: ");
					String telefonoClienteUpdate = keyboard.next();

					if(!nombreClienteUpdate.equals("0")){
						clienteUpdated.setNombre(nombreClienteUpdate);
					}
					if(!telefonoClienteUpdate.equals("0")){
						clienteUpdated.setTelefono(telefonoClienteUpdate);
					}

					System.out.println("Se ha actualizado el cliente");

				}else{
					System.out.println("El ID CLIENTE no existe");
				}

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
				// Obtención (leer) de un mensaje
				System.out.print("Ingrese el ID MENSAJE solicitado: ");
				int idMensajeSearch = keyboard.nextInt();
				Mensaje selectedMensaje = mensajes.get(idMensajeSearch);
				if(selectedMensaje != null){
					System.out.println("----------------------------------------------");
					System.out.println("Mensaje id: " + selectedMensaje.getId());
					System.out.println("----------------------------------------------");
					System.out.println("Emisor: " + selectedMensaje.getTipoEmisor() + selectedMensaje.getIdEmisor());
					System.out.println("Receptor: " + selectedMensaje.getTipoReceptor() + selectedMensaje.getIdReceptor());
					System.out.println("Mensaje: " + selectedMensaje.getTextoMensaje());
				}else
				{
					System.out.println("El ID MENSAJE no existe");
				}
			break;
			case 13:
				// Obtención de todos los mensajes
				System.out.println("************Mensajes************");
				mensajes.forEach((clave, dato)->{
					System.out.println("Mensaje Id: " + dato.getId());
					System.out.println("Emisor: " + dato.getTipoEmisor() + dato.getIdEmisor());
					System.out.println("Receptor: " + dato.getTipoReceptor() + dato.getIdReceptor());
					System.out.println("Mensaje: " + dato.getTextoMensaje());
					System.out.println("----------------------------------------------");
				});
			break;
			case 14:
				// Envío de un mensaje
				Character emisor = null;
				Character receptor = null;
				System.out.println("Indique tipo de Emisor: ");
				System.out.println("1: Cliente");
				System.out.println("2: Gestor");
				int tipoEmisor = keyboard.nextInt();
				System.out.println("Indique el ID EMISOR");
				int idEmisor = keyboard.nextInt();

				System.out.println("Indique tipo de Receptor: ");
				System.out.println("1: Cliente");
				System.out.println("2: Gestor");
				int tipoReceptor = keyboard.nextInt();
				System.out.println("Indique el ID RECEPTOR");
				int idReceptor = keyboard.nextInt();

				System.out.println("Indique el MENSAJE: ");
				String textoMensaje = keyboard.next();

				if (tipoEmisor == 1) {
					emisor = Mensaje.TIPO_CLIENTE;
				}else if (tipoEmisor == 2) {
					emisor = Mensaje.TIPO_GESTOR;
				}else {
					System.out.println("El tipo de emisor es invalido");
				}
				
				if (tipoReceptor == 1) {
					receptor = Mensaje.TIPO_CLIENTE;
				}else if (tipoReceptor == 2) {
					receptor = Mensaje.TIPO_GESTOR;
				}else {
					System.out.println("El tipo de receptor es invalido");
				}
				
				idMensaje++;
				Mensaje nuevoMensaje = new Mensaje (idMensaje, emisor, idEmisor, receptor, idReceptor, textoMensaje);
				mensajes.put(idMensaje, nuevoMensaje);

			break;
			case 15:
				// Obtención (Mostrar) de una transferencia
				System.out.print("Ingrese el ID TRANSFERENCIA solicitado: ");
				int idTransferenciaSearch = keyboard.nextInt();
				Transferencia selectedTransferencia = transferencias.get(idTransferenciaSearch);
				if(selectedTransferencia != null){
					System.out.println("----------------------------------------------");
					System.out.println("Transferencia id: " + selectedTransferencia.getId());
					System.out.println("----------------------------------------------");
					System.out.println("Emisor: " + selectedTransferencia.getTipoEmisor() + selectedTransferencia.getIdEmisor());
					System.out.println("Receptor: " + selectedTransferencia.getTipoReceptor() + selectedTransferencia.getIdReceptor());
					System.out.println("Mensaje: " + selectedTransferencia.getTextoMensaje());
					System.out.println("Monto: " + selectedTransferencia.getDinero());
				}else{
					System.out.println("El ID TRANSFERENCIA no existe");
				}

			break;
			case 16:
				// Obtención de todas las trasferencias
				System.out.println("************Transferencias************");
				transferencias.forEach((clave, dato)->{
					System.out.println("Transferencia Id: " + dato.getId());
					System.out.println("Emisor: " + dato.getIdEmisor());
					System.out.println("Receptor: " + dato.getIdReceptor());
					System.out.println("Mensaje: " + dato.getTextoMensaje());
					System.out.println("Monto: " + dato.getDinero());
					System.out.println("----------------------------------------------");
				});
			break;
			case 17:
				// Envío de una transferencia
				System.out.print("Id del emisor: ");							
				int idEmisorTransfe = keyboard.nextInt();
				System.out.print("Id del receptor: ");							
				int idReceptorTransfe = keyboard.nextInt();
				System.out.print("Monto a transferir: ");							
				float monto = keyboard.nextFloat();
				System.out.print("Mensaje: ");							
				String concepto = keyboard.next();
				
				Cliente emisorT = clientes.get(idEmisorTransfe);
				Cliente receptorT = clientes.get(idReceptorTransfe);
				if (emisorT != null && receptorT != null){
					idTransferencia++;
					Transferencia transferencia = new Transferencia (idTransferencia, Mensaje.TIPO_CLIENTE , idEmisorTransfe, Mensaje.TIPO_CLIENTE, idReceptorTransfe, concepto, monto);
					transferencias.put(idTransferencia, transferencia);
					
				}else{
					System.out.println("El emisor o receptor no existe");
				}
			break;
			case 18:
				// Login y registro(Login cliente)
				System.out.println("Login de Clientes");
				System.out.println("ID del cliente: ");
				int idClienteLogin = keyboard.nextInt();
				Cliente clienteParaLogin  = clientes.get(idClienteLogin);

				System.out.println("Contraseña: ");
				String pass =keyboard.next();
				String passCliente = clienteParaLogin.getPassword();
				boolean tienePass = passCliente != null;

				boolean loginCorrecto = tienePass && clienteParaLogin.getPassword().equals(pass);
				if (loginCorrecto ){
					System.out.println("BIENVENIDO!");
				}else{
					System.out.println("INTENTELO DE NUEVO!");
				}

			break;
			case 19:
				// Registro
				System.out.println("Registro");
				System.out.println("ID del cliente a resgistrar: ");
				int idRegistar = keyboard.nextInt();
				Cliente clienteParaRegistrar = clientes.get(idRegistar);

				
				System.out.println("Contraseña: ");
				String nuevaPass =keyboard.next();
				clienteParaRegistrar.setPassword(nuevaPass);
				// Actualizar cliente en la lista
				clientes.put(clienteParaRegistrar.getId(), clienteParaRegistrar);

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
