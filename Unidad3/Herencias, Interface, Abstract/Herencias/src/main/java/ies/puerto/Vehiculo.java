package ies.puerto;

public class Vehiculo {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Vehiculo() {}
    public Vehiculo(String color){
        this.color = color;
    }
    public void miColor(){
        System.out.println("Mi color es "+color);
    }
    public void mover(){
        System.out.println("El vehiculo se esta moviendo");
    }
    private void apagar(){
        System.out.println("El vehiculo esta apagado");
    }

    public String toString(){

        return "Mi color es"+color;
    }
}