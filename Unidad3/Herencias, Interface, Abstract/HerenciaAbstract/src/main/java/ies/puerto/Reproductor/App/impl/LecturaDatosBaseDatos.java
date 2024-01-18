package ies.puerto.Reproductor.App.impl;

import ies.puerto.Reproductor.App.abstracto.LecturaDatosAbstracto;

public class LecturaDatosBaseDatos extends LecturaDatosAbstracto {

    @Override
    public String lectura() {
        return "Leyendo datos desde BDD";
    }

    @Override
    public String apertura() {
        return "Abriendo datos desde BDD";
    }

    @Override
    public String cierre() {
        return "Cerrando datos desde BDD";
    }
}
