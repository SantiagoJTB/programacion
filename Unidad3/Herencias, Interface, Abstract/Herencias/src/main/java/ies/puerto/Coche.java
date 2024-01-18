package ies.puerto;

public class Coche extends Motor{

    public Coche() {
        super();
    }
    public Coche(String color) {
        super(color);
    }
    public Coche(String color, String matricula) {
        super(color,matricula);
    }
    @Override
    public String toString() {

        String mensaje = "Yo soy un coche y mi";

        if(getColor()!=null){
            mensaje = " color es: "+getColor();
        }

        if(getMatricula()!=null){
            mensaje = " matricula es: "+getMatricula();
        }

        return mensaje;
    }
}
