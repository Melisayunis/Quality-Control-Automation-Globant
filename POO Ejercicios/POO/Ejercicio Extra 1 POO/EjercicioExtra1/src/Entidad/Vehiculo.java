/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Crear una clase "Vehículo" con atributos como "marca", "modelo", "año" y "tipo" 
* (En tipo, vamos a indicar si es un automóvil, una motocicleta, o una bicicleta). 
* El vehículo debe tener los métodos de moverse y frenar:
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String tipo; // automovil, motocicleta, bicicleta
    private int año;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, String tipo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", tipo=" + tipo + ", a\u00f1o=" + año + '}';
    }
    
}
