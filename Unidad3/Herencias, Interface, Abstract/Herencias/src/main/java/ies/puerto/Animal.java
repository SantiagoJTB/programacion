package ies.puerto;

public abstract class Animal{
    private int chip;
    private String nombre;
    public Animal(){}
    public Animal(String nombre){
        this.nombre = nombre;
    }
    public Animal(int chip){
        this.chip = chip;
    }

    public int getChip() {
        return chip;
    }

    public void setChip(int chip) {
        this.chip = chip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal(int chip, String nombre){
        this.chip = chip;
        this.nombre = nombre;
    }

    public String suSonido(){
        return "*sonido*";
    }

    public String toString() {
        return "Nombre:"+getNombre()+", Chip:"+getChip();
    }
}
