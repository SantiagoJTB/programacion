package ies.puerto.appMusica.impl;

import ies.puerto.appMusica.abstracto.MusicaAbstract;
import ies.puerto.appMusica.interfaz.IInstrumentoMusical;

public class Guitarra extends MusicaAbstract implements IInstrumentoMusical{
    @Override
    public String tocarInstrumento() {
        return "*Sonido de guitarra*";
    }

    @Override
    public String afinar() {
        return "Has roto una cuerda intentando afinar la guitarra";
    }

    @Override
    public String cambiarCuerdas(){
        return super.cambiarCuerdas();
    }
}
