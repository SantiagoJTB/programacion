package ies.puerto.Geometria2;

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
