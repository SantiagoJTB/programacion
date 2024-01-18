package ies.puerto;

public class Motor extends Vehiculo{

    private String matricula;
    public Motor() {}

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Motor(String color) {
        super();
    }
    public Motor(String color, String matricula){
        super(color);
        this.matricula = matricula;
    }

}
