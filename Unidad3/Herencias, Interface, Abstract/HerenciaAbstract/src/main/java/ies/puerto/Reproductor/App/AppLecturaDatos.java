package ies.puerto.Reproductor.App;

import ies.puerto.Reproductor.App.abstracto.LecturaDatosAbstracto;
import ies.puerto.Reproductor.App.impl.LecturaDatosBaseDatos;

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
