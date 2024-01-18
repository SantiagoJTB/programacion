package ies.puerto.Reproductor.App.impl;

import ies.puerto.Reproductor.App.interfaz.ILecturaDatos;

public class LecturaDatosFichero implements ILecturaDatos {

    @Override
    public String lectura() {
        return "Realizada la lectura datos desde fichero";
    }

    @Override
    public String apertura() {
        return "Cerrando el sistema de fichero";    }

    @Override
    public String cierre() {
        return "Abriendo el sistema de fichero";    }
}
