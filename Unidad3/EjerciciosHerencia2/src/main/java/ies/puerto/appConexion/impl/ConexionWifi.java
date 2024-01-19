package ies.puerto.appConexion.impl;

import ies.puerto.appAutomovil.abstracto.AutomovilesAbstract;
import ies.puerto.appConexion.abstracto.ConexionAbstract;
import ies.puerto.appConexion.interfaz.IConexionRed;

public class ConexionWifi extends ConexionAbstract implements IConexionRed {
    @Override
    public String conectar() {
        return "Establecida conexión Wifi.";
    }
    @Override
    public String verificacion(){
        return super.verificacion();
    }
}
