/*
    Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero), 
    dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
    Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
    Método para crear cuenta pidiéndole los datos al usuario.
    Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
    Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
    Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
    Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
*/
package service;

import entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaService {
    
    private Scanner entrada = new Scanner(System.in);
    
    public CuentaBancaria crearCuenta(){
        CuentaBancaria usuario = new CuentaBancaria();
        System.out.println("Ingresá el numero de cuenta");
        usuario.setNumeroCuenta(entrada.nextInt());
        System.out.println("Ingresá el numero de dni");
        usuario.setDniCliente(entrada.nextLong());
        System.out.println("Ingresá el saldo actual");
        usuario.setSaldoActual(entrada.nextDouble());
        return usuario;
    }
    
    public void ingresarDinero(CuentaBancaria cuenta){
        System.out.println("Ingresa el saldo");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + entrada.nextDouble());
    }
    
    public void retirarDinero(CuentaBancaria cuenta){
        double saldoRetirar;
        System.out.println("Ingresá el saldo a retirar");
        saldoRetirar = entrada.nextDouble();
        if(cuenta.getSaldoActual() > saldoRetirar){
            cuenta.setSaldoActual(cuenta.getSaldoActual() - saldoRetirar);
            System.out.println("Te sobran " + cuenta.getSaldoActual());
        }
    }
}
