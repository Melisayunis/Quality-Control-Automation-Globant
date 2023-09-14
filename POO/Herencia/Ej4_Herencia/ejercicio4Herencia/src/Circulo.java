/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
    Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
 */
public class Circulo implements calculosFormas {

    private double radio;
    private double diametro;

    public Circulo() {
    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
    
    @Override
    public void calcularArea() {
        double area = Math.pow(PI * radio, 2);
        System.out.println(String.format("\n -> El area del circulo es: %s", area));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println(String.format("\n -> El perimetro del circulo es: %s", (diametro * PI)));
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
    
}
