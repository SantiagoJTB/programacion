package ies.puerto;

public class Gato extends Especie implements IAnimal{
    String nombreRaza;
    public Gato(){}
    public Gato(int chip, String nombre, String nombreEspecie, String nombreRaza){
        super(chip,nombre,nombreEspecie);
        this.nombreRaza = nombreRaza;
    }
    @Override
    public String suSonido(){
        return "MIAU";
    }
}
