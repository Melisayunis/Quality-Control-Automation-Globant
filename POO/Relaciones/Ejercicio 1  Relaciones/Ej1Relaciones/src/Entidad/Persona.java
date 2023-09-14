/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
Persona con
atributos: nombre, apellido, edad, documento y Perro
 */
public class Persona {
    private String name;
    private String lastName;
    private int age;
    private long dni;
    private Perro dog;

    public Persona() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public Perro getDog() {
        return dog;
    }

    public void setDog(Perro dog) {
        this.dog = dog;
    }

    public Persona(String name, String lastName, int age, long dni, Perro dog) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.dni = dni;
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", lastName=" + lastName + ", age=" + age + ", dni=" + dni + ", dog=" + dog + '}';
    }
    
    
    
}
