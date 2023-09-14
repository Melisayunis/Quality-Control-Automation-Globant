/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Perro, que tendrá como atributos: nombre, raza, edad y tamaño;
 */
public class Perro {
    private String name;
    private String raza;
    private int age;
    private String size;

    public Perro() {
    }

    public Perro(String name, String raza, int age, String size) {
        this.name = name;
        this.raza = raza;
        this.age = age;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Perro{" + "name=" + name + ", raza=" + raza + ", age=" + age + ", size=" + size + '}';
    }
    
    
}
