package ies.puerto.appMusica;

import ies.puerto.appMusica.impl.Guitarra;

public class appMusica {
    static Guitarra guitarra;

    public static void main(String[] args) {
        guitarra = new Guitarra();
        System.out.println(guitarra.afinar());
        System.out.println(guitarra.cambiarCuerdas());
        System.out.println(guitarra.tocarInstrumento());
    }
}
