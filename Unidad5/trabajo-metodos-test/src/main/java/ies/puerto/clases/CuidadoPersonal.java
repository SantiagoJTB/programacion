package ies.puerto.clases;

import ies.puerto.abstractas.ProductoRecomendable;

public class CuidadoPersonal extends ProductoRecomendable {
    public CuidadoPersonal() {}

    public CuidadoPersonal(int valoracion) {
        super(valoracion);
    }

    public CuidadoPersonal(String nombre, String fechaEntrada, float precio, String id, int valoracion) {
        super(nombre, fechaEntrada, precio, id, valoracion);
    }

    public static boolean recomendarProducto(CuidadoPersonal cuidadoPersonal) {
        int producto = cuidadoPersonal.getValoracion();
        return producto >= 7;
    }

    @Override
    public boolean recomendarProducto() {
        return false;
    }
}
