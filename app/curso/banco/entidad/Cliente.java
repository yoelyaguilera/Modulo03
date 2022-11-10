package app.curso.banco.entidad;
import java.util.HashMap;

public class Cliente extends Persona{
    private float totalDinero;
   
    private HashMap<String,Float> cuentas;

    public Cliente(){
    }
    public Cliente(int id, String nombre, String telefono) {
        super(id, nombre, telefono);
        this.totalDinero = 0;
        this.cuentas = new HashMap<>();
    }
    public Cliente(int id, String nombre, String telefono, float totalDinero) {
        super(id, nombre, telefono);
        this.totalDinero = totalDinero;
        this.cuentas = new HashMap<>();
    }
    public float getTotalDinero(){
        return this.totalDinero;
    }
    public void setTotalDinero(float totalDinero){
        this.totalDinero = totalDinero;
    }

    public HashMap<String,Float> getCuentas(){
        return this.cuentas;
    }
    public void setCuentas(HashMap<String,Float> cuentas){
        this.cuentas = cuentas;
    }

    public void mostrarInfo (){
        super.mostrarInfo();
        mostrarCuentas();
        System.out.println("Total Dinero: " + this.totalDinero + " euros");
    }
    public float ingresarDinero(float dinero){
        return this.totalDinero += dinero;
    }
    public float retirarDinero (float dinero){
        if (this.totalDinero - dinero >= 0) {
            this.totalDinero -= dinero;
        }else {
            System.out.println("No tienes dinero suficiente");
        }
        return this.totalDinero;
    }
    public void abrirCuenta(String idCuenta, Float dinero ){
        this.cuentas.put(idCuenta, dinero);
        ingresarDinero(dinero);
    }
    public float ingresarDinero(String idCuenta, Float dinero){
        Float dineroEnCuenta = this.cuentas.get(idCuenta);
        // comprobar si existe la cuenta
        if (dineroEnCuenta != null) {
            this.cuentas.put(idCuenta, dineroEnCuenta + dinero);
            System.out.println("Se ha Ingresado " +  dinero + " euros de la cuenta " + idCuenta);

            ingresarDinero(dinero);
        }else{
            System.out.println("La cuenta no existe");
        }
     return this.totalDinero;
    }
    public float retirarDinero(String idCuenta, Float dinero){
        Float dineroEnCuenta = this.cuentas.get(idCuenta);
        if (dineroEnCuenta!= null) {
            this.cuentas.put(idCuenta, dineroEnCuenta - dinero);
            System.out.println("Se ha retirado " +  dinero + " euros de la cuenta " + idCuenta);
            retirarDinero(dinero);
        }else{
            System.out.println("La cuenta no existe");
        }
        return this.totalDinero;
    }

    public void cerrarCuenta(String idCuenta){
        Float dineroEnCuenta = this.cuentas.get(idCuenta);
        retirarDinero(idCuenta, dineroEnCuenta);
        this.cuentas.remove(idCuenta);
        System.out.println("Se ha cerrado la cuenta "+ idCuenta);
    }

    public void mostrarCuentas(){
        this.cuentas.forEach((idCuenta, dinero) ->{
            System.out.println(">" + idCuenta + " -> " + dinero + " euros");
        });
    }

}