package ies.puerto.Reproductor.App;

import ies.puerto.Reproductor.App.impl.ReproductorMP3;
import ies.puerto.Reproductor.App.interfaz.IReproductor;

public class AppReproductor {
    static IReproductor reproductor;

    public static void main(String[] args) throws Exception {
        reproductor = new ReproductorMP3();
        System.out.println(reproductor.reproducir());
        System.out.println(reproductor.detener());
        tipo(reproductor);
    }
    public static void tipo(IReproductor reproductor){
        System.out.println(reproductor.getClass());
    }
}
