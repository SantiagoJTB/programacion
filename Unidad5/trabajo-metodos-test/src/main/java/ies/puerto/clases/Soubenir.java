package ies.puerto.clases;

import ies.puerto.abstractas.Producto;

public class Soubenir extends Producto {
    public Soubenir() {
    }

    public Soubenir(String nombre, String fechaEntrada, float precio, String id) {
        super(nombre, fechaEntrada, precio, id);
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.3f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
