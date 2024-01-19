package ies.puerto;

public class Bicicleta extends Vehiculo{

    private String talla;
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    public Bicicleta(){}

    public Bicicleta(String talla, String color){
        super(color);
        this.talla = talla;
    }
    @Override
    public String toString(){
        return "Yo soy una bici con talla "+this.talla+" y color "+this.getColor();
    }

}
