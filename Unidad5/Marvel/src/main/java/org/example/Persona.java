package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;
@Root(name = "personaje")
public class Persona {

    @Element(name = "nombre")
    String nombre;
    @Element(name = "alias")
    String alias;
    @Element(name = "genero")
    String genero;
    @ElementList(name = "poderes")
    List<String> poderes = new ArrayList<>();
    public Persona(){
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getPoderes() {
        return poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Persona persona = (Persona) object;
        return Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return  "Persona{" +
                "nombre='" + nombre + '\'' +
                ", alias='" + alias + '\'' +
                ", genero='" + genero + '\'' +
                ", poderes=" + poderes + '\n'+
                '}';
    }
    public String toCsv() {
        return nombre + "," + alias + "," + genero + "," + poderes;
    }
}