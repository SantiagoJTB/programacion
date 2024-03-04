package ies.puerto.clases;

import ies.puerto.abstractas.ProductoFresco;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Alimento extends ProductoFresco {
    public Alimento() {
    }

    public Alimento(String nombre, String fechaEntrada, float precio, String id, String fechaCaducidad) {
        super(nombre, fechaEntrada, precio, id, fechaCaducidad);
    }

    @Override
    public int fechaCaducidad() {
        LocalDate fechaCaducidad = LocalDate.parse(getFechaCaducidad());
        LocalDate fechaActual = LocalDate.now();
        long diferencia = ChronoUnit.DAYS.between(fechaCaducidad,fechaActual);
        return (int) diferencia;
    }

    @Override
    public boolean caducado() {
        return fechaCaducidad() <= 0;
    }

    @Override
    public float precioMaximo() {
        return getPrecio()*1.42f;
    }

    @Override
    public int cantidadDisponible() {
        return 0;
    }
}
