package ies.puerto.mundoMotor;

public class Conductor extends Vehiculo{
    String nombre;
    String dni;
    String vehiculo;
    public Conductor(){}

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor(String nombre, String dni, String vehiculo){
        this.nombre = nombre;
        this.dni = dni;
        this.vehiculo = vehiculo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    @Override
    public String toString(){
        return "El nombre es:"+getNombre()+", el dni es:"+getDni()+", el vehiculo es:"+getVehiculo();
    }
}
