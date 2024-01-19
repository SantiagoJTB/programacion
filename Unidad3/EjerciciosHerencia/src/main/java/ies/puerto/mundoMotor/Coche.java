package ies.puerto.mundoMotor;

public class Coche extends Vehiculo {
    int numPuertas;
    public Coche(){}
    public Coche(String marca, String modelo, int precio, int numPuertas){
        super(marca, modelo, precio);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    @Override
    public String toString(){
        return "La marca es:"+getMarca()+", el modelo es:"+getModelo()+", el precio es:"+getPrecio()+", el numero de puertas es:"+getNumPuertas();
    }
}
