package ies.puerto;

public class Loro extends Especie implements IAnimal{
    String nombreRaza;
    public Loro(){}
    public Loro(int chip, String nombre, String nombreEspecie, String nombreRaza){
        super(chip,nombre,nombreEspecie);
        this.nombreRaza = nombreRaza;
    }
    @Override
    public String suSonido(){
        return "Soy un loro";
    }
}
