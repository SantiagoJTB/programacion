package ies.puerto.clases;

import ies.puerto.abstractas.Producto;

public class Aparato extends Producto {
    public Aparato() {
    }

    public Aparato(String nombre, String fechaEntrada, float precio, String id) {
        super(nombre, fechaEntrada, precio, id);
    }

    @Override
    public float precioMaximo() {
        return 0;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
