package ies.puerto.appGeometria;

import ies.puerto.appGeometria.impl.Circulo;
import ies.puerto.appGeometria.impl.Cuadrado;
import ies.puerto.appGeometria.impl.Rectangulo;
import ies.puerto.appGeometria.interfaz.IFormaGeometrica;

public class AppGeometria {
    static IFormaGeometrica circulo;
    static IFormaGeometrica cuadrado;
    static IFormaGeometrica rectangulo;

    public static void main(String[] args) {
        circulo = new Circulo(5f);
        cuadrado = new Cuadrado(5f,5f);
        rectangulo = new Rectangulo(5f,6f);
        System.out.println(circulo.calcularArea());
        System.out.println(cuadrado.calcularArea());
        System.out.println(rectangulo.calcularArea());

    }
}
