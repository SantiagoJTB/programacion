package ies.puerto.mundoMotor;

/**
 *
 Crea una clase Vehiculo con atributos como marca, modelo y precio. Crea clases Coche y Motocicleta
 que hereden de Vehiculo y añadan atributos específicos y relaciones con otras clases como Conductor.
 */
public class Vehiculo {
    String marca;
    String modelo;
    int precio;

    public Vehiculo(){}
    public Vehiculo(String marca, String modelo, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String toString(){
        return "El nombre es:"+getMarca()+", el dni es:"+getModelo()+", la edad es:"+getPrecio();
    }
}
