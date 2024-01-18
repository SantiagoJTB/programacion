package ies.puerto.Reproductor.App.impl;

import ies.puerto.Reproductor.App.interfaz.IReproductor;

public class ReproductorMP3 implements IReproductor {

    @Override
    public String reproducir() throws Exception {
        return "Reproduciendo MP3";
    }

    @Override
    public String detener() {
        return "Deteniendo MP3";
    }
}

