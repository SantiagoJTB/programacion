package ies.puerto;

public class Rectangulo {
    double base;
    double altura;
    public Rectangulo(){}

    public Rectangulo(double base,double altura){
        this.base=base;
        this.altura=altura;
    }
    public double calcularArea(){
        return base*altura;
    }
    public double calcularPerimetro(){
        return base+base+altura+altura;
    }
    public  void imprimir(){
        double area=calcularArea();
        double perimetro=calcularPerimetro();
        System.out.println("Area: "+calcularArea()+" | Perímetro: "+calcularPerimetro());
    }

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(10,20);
        Rectangulo rectangulo2 = new Rectangulo(65.7,24);
        Rectangulo rectangulo3 = new Rectangulo(100,90);

        rectangulo1.imprimir();
        rectangulo2.imprimir();
        rectangulo3.imprimir();
    }
}
