package ies.puerto.abstractas;

import ies.puerto.clases.CuidadoPersonal;
import ies.puerto.interfaces.IRecomendable;

public abstract class ProductoRecomendable extends Producto implements IRecomendable {
    private static int valoracion;

    public ProductoRecomendable() {}

    public ProductoRecomendable(int valoracion) {
        ProductoRecomendable.valoracion = valoracion;
    }

    public ProductoRecomendable(String nombre, String fechaEntrada, float precio, String id, int valoracion) {
        super(nombre, fechaEntrada, precio, id);
        ProductoRecomendable.valoracion = valoracion;
    }

    public static boolean recomendarProducto(CuidadoPersonal cuidadoPersonal) {
        return false;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        ProductoRecomendable.valoracion = valoracion;
    }


    @Override
    public int calcularPopularidad() {
        return getValoracion();
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.8f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }

    @Override
    public String toString() {
        return "Producto:" +
                "nombre='" + getNombre() + '\'' +
                ", fechaEntrada='" + getFechaEntrada() + '\'' +
                ", precio=" + getPrecio() +
                ", id='" + getId() + '\''+
                ", valoracion=" + valoracion +
                '}';
    }
}
