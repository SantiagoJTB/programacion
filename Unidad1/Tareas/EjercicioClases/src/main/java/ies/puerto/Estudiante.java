package ies.puerto;

public class Estudiante {
    String nombre;
    int edad;
    String carrera;
    int promedio;

    Estudiante(){}
    Estudiante(String nombre, int edad, String carrera, int promedio){
        this.nombre=nombre;
        this.edad=edad;
        this.carrera=carrera;
        this.promedio=promedio;
    }

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}
    public String getCarrera() {return carrera;}
    public void setCarrera(String carrera) {this.carrera = carrera;}
    public int getPromedio() {return promedio;}
    public void setPromedio(int promedio) {this.promedio = promedio;}

    public void imprimir(){
        System.out.println("Nombre: "+getNombre()+" | Edad: "+getEdad()+" | Carrera: "+getCarrera()+" | Promedio: "+getPromedio());
    }

    public void calificacion(){

        int aprobado = 5;
        int i = getPromedio();

        if (i >= aprobado){
            System.out.println("El alumno: "+getNombre()+" está aprobado con un promedio de "+getPromedio());
        }else{
            System.out.println("El alumno: "+getNombre()+" está reprobado con un promedio de "+getPromedio());
        }
    }

    public static void main(String[] args) {
        Estudiante estudiante1=new Estudiante("Paco",23,"Física",4);
        Estudiante estudiante2=new Estudiante("Pepe",23,"Filosofia",6);
        Estudiante estudiante3=new Estudiante("Maria",23,"Medicina",9);


        estudiante1.imprimir();
        estudiante1.calificacion();
        estudiante2.imprimir();
        estudiante2.calificacion();
        estudiante3.imprimir();
        estudiante3.calificacion();

    }

}
