package ies.puerto.personaEstudiante;

public class Estudiante extends Persona{
    int curso;
    int nota;

    public Estudiante(){}
    public Estudiante(String nombre, String dni, int curso, int notas){
        super(nombre, dni);
        this.curso = curso;
        this.nota = notas;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int notas) {
        this.nota = notas;
    }
    @Override
    public String toString(){
        return "EL nombre es:"+getNombre()+", el dni:"+getDni()+", el curso es:"+getCurso()+", la nota es:"+getNota();
    }
    @Override
    public String saludar(){
        return "Saludos desde la clase Estudiante";
    }
}
