package ies.puerto.abstractas;

import ies.puerto.interfaces.IVendible;

import java.util.Objects;

public abstract class Producto implements IVendible {
    private String nombre;
    private String fechaEntrada;
    private float precio;
    private String id;

    public Producto() {}

    public Producto(String nombre, String fechaEntrada, float precio, String id) {
        this.nombre = nombre;
        this.fechaEntrada = fechaEntrada;
        this.precio = precio;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Producto:" +
                "nombre='" + nombre + '\'' +
                ", fechaEntrada='" + fechaEntrada + '\'' +
                ", precio=" + precio +
                ", id='" + id + '\'';
    }
    public String toCsv() {
        return nombre + "," + fechaEntrada + "," + precio + "," + id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
