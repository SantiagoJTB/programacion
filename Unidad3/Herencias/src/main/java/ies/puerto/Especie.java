package ies.puerto;

public class Especie extends Animal {
    private String nombreEspecie;
    public Especie(){}
    public Especie(String nombreEspecie){
        this.nombreEspecie = nombreEspecie;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public Especie(int chip, String nombre, String nombreEspecie){
        super(chip,nombre);
        this.nombreEspecie = nombreEspecie;
    }
}
