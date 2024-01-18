package ies.puerto;

public class Perro extends Especie {
    String nombreRaza;
    public Perro(){}
    public Perro(int chip, String nombre, String nombreEspecie, String nombreRaza){
        super(chip,nombre,nombreEspecie);
        this.nombreRaza = nombreRaza;
    }
    @Override
    public String suSonido(){
        return "GUAU";
    }

}
