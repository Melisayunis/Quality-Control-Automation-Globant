/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
Las operaciones asociadas a dicha clase son:

c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
public class ServicioCuenta {
    Scanner leer = new Scanner(System.in);
    
    public Cuenta crearCuenta() {
        System.out.println("Ingrese su DNI: ");
        long DNI = leer.nextLong();
        
        System.out.println("Ingrese su numero de cuenta: ");
        int numCuenta = leer.nextInt();
        
        System.out.println("Ingrese su saldo actual: ");
        int saldoActual = leer.nextInt();
        
        System.out.println("Ingrese el interes: ");
        float interes = leer.nextFloat();
        
        Cuenta acount = new Cuenta(numCuenta, DNI, saldoActual, interes);
        return acount;
    }
    
    public void ingreso(Cuenta acount) {
        /* d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
        y se la sumara a saldo actual.
        */
        System.out.println("Ingrese el monto a ingresar: ");
        double ingreso = leer.nextDouble();
        
        double saldo =  acount.getSaldoActual() + ingreso;
        acount.setSaldoActual((int) saldo);
    }
    
    public void retirar(Cuenta acount) {
        /* e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
        la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
        pondrá el saldo actual en 0.
        */
        System.out.println("Ingrese el monto a retirar: ");
        double retiro = leer.nextDouble();
        
        if ((acount.getSaldoActual()-retiro) > 0) {
            acount.setSaldoActual((int) (acount.getSaldoActual() - retiro));
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("El retiro supera el monto disponible.");
            acount.setSaldoActual(0);
        }
    }
    
    public void retiroRapido(Cuenta acount) {
        /* f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
            usuario no saque más del 20%.
        */
        System.out.println("Ingrese el monto a retirar: ");
        double retiro = leer.nextDouble();
        
        if (retiro <= ((20*acount.getSaldoActual())/100)) {
            // si se puede hacer el retiro
            acount.setSaldoActual((int) (acount.getSaldoActual() - retiro));
            System.out.println("Retiro exitoso.");
        } else {
            // no se puede hacer el retiro
            System.out.println("El monto ingresado supera el 20% de su saldo, no puede realizar el retiro.");
        }
    }
    
    public void consultarSaldo(Cuenta acount) {
        // Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
        
        System.out.println("El saldo disponible es: " + acount.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta acount) {
        // Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
        acount.toString();
    }
    
}
