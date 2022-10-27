package app.curso.banco.main;

import app.curso.banco.entidad.Cliente;
// import java.util.HashMap;

public class TestCuentas {
    public static void main (String[] args){
        Cliente cliente = new Cliente(1,"Ana Martinez", "666666666");
        cliente.abrirCuenta("ES123", 100f);
        cliente.abrirCuenta("ES678", 30f);
        cliente.mostrarInfo();
        cliente.retirarDinero("ES123", 20f);
        cliente.mostrarInfo();
        cliente.ingresarDinero("ES678", 200f);
        cliente.mostrarInfo();
        cliente.cerrarCuenta("ES123");
        cliente.mostrarInfo();

        // Cliente cliente2 = new Cliente();
        // cliente2.setId(3);
        // HashMap<String,Float> cuentas = new HashMap<>();
        // cliente2.setCuentas(cuentas);


    }
}
