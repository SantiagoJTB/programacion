package org.example.file;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import org.example.Persona;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JsonCrud {
    List<Persona> personas;
    String path = "src/main/resources/json.json";
    public List<Persona> obtenerPersonas(){
        String json = null;
        try{
            json = new String(Files.readAllBytes(Paths.get(path)));
            Type listType = new TypeToken<ArrayList<Persona>>(){}.getType();
            personas = new Gson().fromJson(json, listType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            return personas;
    }
    public Persona obtenerPersona(Persona persona){
        if(!personas.contains(persona)){
            return null;
        }
        int posicion = personas.indexOf(persona);
        return personas.get(posicion);
    }
    public boolean addPersona(Persona persona){
        if(!personas.contains(persona)){
            personas.add(persona);
            guardar(personas);
            return true;
        }
        return false;
    }
    public boolean deletePersona(Persona persona){
        personas.remove(persona);
        guardar(personas);
        return true;
    }
    public boolean updatePersona(Persona persona){
        if(!personas.contains(persona)){
            return false;
        }
        int posicion = personas.indexOf(persona);
        personas.set(posicion, persona);
        guardar(personas);
        return true;
    }
    public void guardar(List<Persona> personas) {
        try (FileWriter writer = new FileWriter(path)) {
            new GsonBuilder().setPrettyPrinting().create().toJson(personas, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
