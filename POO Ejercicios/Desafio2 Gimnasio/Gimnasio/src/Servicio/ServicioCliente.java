/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

/**
* registrarCliente: lo registra en el sistema.

* obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.

* actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.

* eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.
 */
public class ServicioCliente {
    private final ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void registrarCliente() {
        // registrarCliente: lo registra en el sistema.
        Cliente cliente = new Cliente();
        
        cliente.setId(listaClientes.size() + 1);
        System.out.println("Ingrese el nombre del cliente:");
        cliente.setNombre(read.next());
        System.out.println("Ingrese la edad: ");
        cliente.setEdad(read.nextInt());
        System.out.println("Ingrese la altura:");
        cliente.setAltura(read.nextDouble());
        System.out.println("Ingrese el peso:");
        cliente.setPeso(read.nextDouble());
        System.out.println("Ingrese el objetivo: ");
        cliente.setObjetivo(read.next());
        
        listaClientes.add(cliente);
    }
    
    public void obtenerClientes() {
        for (Cliente clientes : listaClientes) {
            System.out.println("ID: " + clientes.getId());
            System.out.println("Nombre: " + clientes.getNombre());
            System.out.println("Edad: " + clientes.getEdad());
            System.out.println("Altura: " + clientes.getAltura());
            System.out.println("Peso: " + clientes.getPeso());
            System.out.println("Objetivo: " + clientes.getObjetivo());
            System.out.println("");
        }
    }
    
    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo) {
        for (Cliente clientes : listaClientes) {
            if (id == clientes.getId()) {
                clientes.setNombre(nombre);
                clientes.setEdad(edad);
                clientes.setAltura(altura);
                clientes.setPeso(peso);
                clientes.setObjetivo(objetivo);
                break;
            }
        }
    }
    
    public void eliminarCliente(int id) {
        // eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.
        for (Cliente clientes : listaClientes) {
            if (id == clientes.getId()) {
                listaClientes.remove(clientes);
                break;
            }
        }
    }
    
}
