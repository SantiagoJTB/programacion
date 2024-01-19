package ies.puerto.appReproductor;

import ies.puerto.appReproductor.impl.LecturaDatosBaseDatos;
import ies.puerto.appReproductor.abstracto.LecturaDatosAbstracto;

public class AppLecturaDatos {
    static LecturaDatosAbstracto lecturaDatos;

    public static void main(String[] args) {
        lecturaDatos = new LecturaDatosBaseDatos();
        System.out.println(lecturaDatos.apertura());
        System.out.println(lecturaDatos.lectura());
        System.out.println(lecturaDatos.cierre());
        tipo(lecturaDatos);
    }

    public static void tipo(LecturaDatosAbstracto iLecturaDatos){
        System.out.println(lecturaDatos.getClass().getName());
    }
}
