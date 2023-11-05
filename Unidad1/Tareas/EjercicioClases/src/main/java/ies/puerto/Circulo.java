package ies.puerto;

import static java.lang.Math.PI;

public class Circulo {
    double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return PI * radio * radio;
    }

    public double calcularCircunferencia() {
        return 2 * PI * radio;
    }

    public void imprimir() {
        double area = calcularArea();
        double circunferencia = calcularCircunferencia();
        System.out.println("Radio: " + radio + ", Area: " + area + ", Circunferencia: " + circunferencia);
    }

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10);
        Circulo circulo2 = new Circulo(500);
        Circulo circulo3 = new Circulo(50.6);

        circulo1.imprimir();
        circulo2.imprimir();
        circulo3.imprimir();
    }
}
