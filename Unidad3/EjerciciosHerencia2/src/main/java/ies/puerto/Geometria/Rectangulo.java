package ies.puerto.Geometria;

import ies.puerto.Geometria.Figura;

public class Rectangulo extends Figura {

    public Rectangulo(){

    }

    public Rectangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    @Deprecated(since = "4,5",forRemoval = true)
    public float calcularArea(){
        return area();
    }

    public float area(){
        return getBase()*getAltura();
    }


    @Override
    public String toString(){
        return "La Base del rectangulo es: "+getBase()+",y la Altura: "+getAltura();
    }

}