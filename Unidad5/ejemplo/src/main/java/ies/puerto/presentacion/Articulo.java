package ies.puerto.presentacion;

import java.util.Objects;

public abstract class Articulo {
    private String id;
    private String nombre;
    private float precio;
    private String fcaducidad;
    private String fentrada;

    public Articulo(String id, String nombre, float precio, String fcaducidad, String fentrada) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.fcaducidad = fcaducidad;
        this.fentrada = fentrada;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", fcaducidad='" + fcaducidad + '\'' +
                ", fentrada='" + fentrada + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Articulo articulo = (Articulo) object;
        return Objects.equals(id, articulo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
