package ies.puerto.appPersona;

import ies.puerto.appPersona.impl.Alumno;
import ies.puerto.appPersona.impl.Empleado;

public class AppPersona {

    static Empleado empleado1;
    static Alumno alumno1;

    public static void main(String[] args) throws Exception {
        System.out.println(empleado1 = new Empleado("Paco"));
        System.out.println(alumno1 = new Alumno("Paquito"));
        System.out.println(alumno1.estudiar());
    }
}
