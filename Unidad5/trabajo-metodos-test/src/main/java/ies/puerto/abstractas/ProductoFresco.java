package ies.puerto.abstractas;

import ies.puerto.interfaces.ISaludable;

public abstract class ProductoFresco extends Producto implements ISaludable {
    private String fechaCaducidad;

    public ProductoFresco(){}
    public ProductoFresco(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public ProductoFresco(String nombre, String fechaEntrada, float precio, String id, String fechaCaducidad) {
        super(nombre, fechaEntrada, precio, id);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
        public String toString() {
            return "Producto:" +
                    "nombre='" + getNombre() + '\'' +
                    ", fechaEntrada='" + getFechaEntrada() + '\'' +
                    ", precio=" + getPrecio() +
                    ", id='" + getId() + '\''+
                    ", fechaCaducidad='" + fechaCaducidad + '\'' +
                    '}';
        }
    }

