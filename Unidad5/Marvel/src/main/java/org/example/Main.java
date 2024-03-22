package org.example;

import org.example.file.CsvCrud;
import org.example.file.JsonCrud;
import org.example.file.XmlCrud;

import java.util.Arrays;
import java.util.List;


public class Main {
    static CsvCrud csvCrud = new CsvCrud();
    static XmlCrud xmlCrud = new XmlCrud();
    static JsonCrud jsonCrud = new JsonCrud();
    public static void main(String[] args) {
/**
        System.out.println(csvCrud.obtenerPersonas());

        System.out.println(csvCrud.obtenerPersona(new Persona("Iron Man")));

        Persona persona = new Persona("Iron Man","Pacazo","No binario", Arrays.asList("Dormir", "despertar"));
        System.out.println(csvCrud.addPersona(persona));

        System.out.println(csvCrud.deletePersona(persona));

        System.out.println(csvCrud.updatePersona(persona));
 **/
/**
        Persona persona = new Persona("Paco","Pacazo","No binario", Arrays.asList("Dormir", "despertar"));
        System.out.println(xmlCrud.obtenerPersonas());
        System.out.println(xmlCrud.obtenerPersona (new Persona("Iron Man")));
        System.out.println(xmlCrud.addPersona(persona));
        System.out.println(xmlCrud.borrarPersona(persona));
        System.out.println(xmlCrud.actualizarPersona(new Persona("Iron Man","Nini","Astronauta",Arrays.asList("Estudiar", "Trabajar"))));
 **/
        Persona persona = new Persona("Paco","Pacazo","No binario", Arrays.asList("Dormir", "despertar"));
        System.out.println(jsonCrud.obtenerPersonas());
        System.out.println(jsonCrud.obtenerPersona(new Persona("Iron Man")));
        System.out.println(jsonCrud.addPersona(persona));
        System.out.println(jsonCrud.deletePersona(persona));
        System.out.println(jsonCrud.addPersona(persona));
        System.out.println(jsonCrud.updatePersona(new Persona("Paco","PACAZOOO","No binario", Arrays.asList("Dormir", "despertar"))));
 }
}
