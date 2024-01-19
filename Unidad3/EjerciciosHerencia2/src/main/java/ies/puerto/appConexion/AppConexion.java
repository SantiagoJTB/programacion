package ies.puerto.appConexion;

import ies.puerto.appConexion.impl.ConcexionEthernet;
import ies.puerto.appConexion.impl.ConexionWifi;

public class AppConexion {
    static ConexionWifi conexionWifi;
    static ConcexionEthernet concexionEthernet;

    public static void main(String[] args) {
        conexionWifi = new ConexionWifi();
        concexionEthernet = new ConcexionEthernet();
        System.out.println(conexionWifi.conectar());
        System.out.println(conexionWifi.verificacion());
        System.out.println(concexionEthernet.conectar());
        System.out.println(concexionEthernet.verificacion());
    }
}
