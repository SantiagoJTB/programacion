package ies.puerto.appAutomovil.impl;

import ies.puerto.appAutomovil.abstracto.AutomovilesAbstract;
import ies.puerto.appAutomovil.interfaz.IConductor;

public class Automovil extends AutomovilesAbstract implements IConductor {
    @Override
    public String arrancar() {
        return "Arrancado";
    }

    @Override
    public String detener() {
        return "Detenido";
    }

    @Override
    public String conducir() {
        return super.conducir();
    }

}
