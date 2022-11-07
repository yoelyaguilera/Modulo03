package app.curso.banco.entidad;

public class Persona {
//Atributos
    protected int id;
    protected String nombre;
    protected String telefono;
    // protected String userName;
    protected String password;

    //Constructores por defecto
    public Persona(){

    }

    //Constructor Parametrizado
    public Persona(int id, String nombre , String telefono){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //Metodos
    public int getId(){
        return id;
    }

    public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
    // public String getUserName() {
    //     return userName;
    // }

    // public void setUserName(String userName) {
    //     this.userName = userName;
    // }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void mostrarInfo (){
        System.out.println("Id: " + this.id);
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Telefono: " + this.telefono);
    }


}
