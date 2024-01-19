package ies.puerto.appAutomovil;

import ies.puerto.appAutomovil.impl.Automovil;

public class AppAutomovil {
    static Automovil opel;
    public static void main(String[] args) {

        opel = new Automovil();
        System.out.println(opel.arrancar());
        System.out.println(opel.conducir());
        System.out.println(opel.detener());
    }
}
