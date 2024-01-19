package ies.puerto.appPersona.abstracto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class PersonaAbstract {
    String nombre;
    String fechaNacimiento = fechaNacimiento();
    int edad = calcularEdad(fechaNacimiento);
    private static String IllegalArgumentException;

    public PersonaAbstract() throws Exception {
    }
    public PersonaAbstract(String nombre, String fechaNacimiento, int edad) throws Exception {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public PersonaAbstract(String nombre) throws Exception {
        this.nombre =nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    public String fechaNacimiento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento: dd/MM/yyyy");
        return sc.nextLine();
    }
    public int calcularEdad(String fechaNacimiento) throws Exception {

        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechaActualStr = formato.format(fechaActual);

        String[] obtenerNumerosHoy = fechaActualStr.split("/");
        int diaHoy = Integer.parseInt(obtenerNumerosHoy[0]);
        int mesHoy = Integer.parseInt(obtenerNumerosHoy[1]);
        int anioHoy = Integer.parseInt(obtenerNumerosHoy[2]);

        String[] obtenerNumeros = fechaNacimiento.split("/");
        int diaFN = Integer.parseInt(obtenerNumeros[0]);
        int mesFN = Integer.parseInt(obtenerNumeros[1]);
        int anioFN = Integer.parseInt(obtenerNumeros[2]);

        int anio = anioHoy - anioFN;
        if(anio < 1){throw new Exception(IllegalArgumentException);}
        else {
            int edad = anio;
            if (mesHoy < mesFN || (mesHoy == mesFN && diaHoy < diaFN)) {
                edad--;
            }
            return edad;
        }
    }
}

