package ies.puerto.Geometria2;

import ies.puerto.Geometria2.IFormaGeometrica;

public class Circulo implements IFormaGeometrica {
    private float radio;
    public Circulo(){}
    public Circulo(float radio){
        this.radio = radio;
    }
    @Override
    public float calcularArea() {
        return 3.14f * (radio*radio);
    }
}
