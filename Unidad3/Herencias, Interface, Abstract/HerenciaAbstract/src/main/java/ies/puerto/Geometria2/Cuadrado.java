package ies.puerto.Geometria2;

public class Cuadrado extends RegularesAbstracto implements IFormaGeometrica{
    public Cuadrado(float lado){
        super(lado,lado);
    }
    public Cuadrado(float base, float altura) {
        super(base, altura);
    }
    @Override
    public float calcularArea() {
        return getBase() * getAltura();
    }
}
