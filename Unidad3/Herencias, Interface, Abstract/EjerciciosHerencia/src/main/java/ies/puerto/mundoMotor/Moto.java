package ies.puerto.mundoMotor;

public class Moto extends Vehiculo {
    int numRuedas;

    public Moto(){}

    public int getNumRuedas() {
        return numRuedas;
    }

    public void setNumRuedas(int numRuedas) {
        this.numRuedas = numRuedas;
    }

    public Moto(String marca, String modelo, int precio, int numRuedas){
        super(marca,modelo,precio);
        this.numRuedas = numRuedas;
    }
    @Override
    public String toString(){
        return "La marca es:"+getMarca()+", el modelo es:"+getModelo()+", el precio es:"+getPrecio()+", el numero de ruedas es:"+getNumRuedas();
    }
}
