/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
    Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2.
 */
public class Rectangulo implements calculosFormas {
    
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        System.out.println(String.format("\n -> El area del rectangulo es: %s", (base * altura)) );
    }

    @Override
    public void calcularPerimetro() {
        System.out.println(String.format("\n -> El perimetro del rectangulo es: %s", ((base + altura) * 2)));
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
