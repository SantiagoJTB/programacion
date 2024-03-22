package org.example.file;

import org.example.Persona;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvCrud {

    String path = "src/main/resources/csv.csv";
    public List<Persona> obtenerPersonas() {

        List<Persona> superheroes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            br.readLine();
            String linea;

            while ((linea = br.readLine())!=null && !linea.isEmpty()) {

                String[] valores = linea.split(",");
                int num = 0;

                String nombre = valores[num++];
                String alias = valores[num++];
                String genero = valores[num++];

                List<String> poderes = new ArrayList<>();
                while(num < valores.length){
                    poderes.add(valores[num++]);
                }

                Persona superheroe = new Persona(nombre, alias, genero, poderes);
                superheroes.add(superheroe);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return superheroes;
    }
    public Persona obtenerPersona(Persona persona){

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            String linea;

            while((linea = br.readLine()) != null && !linea.isEmpty()){

                String[] valores = linea.split(",");

                String nombre = valores[0].trim();
                if (nombre.equals(persona.getNombre())){

                    String alias = valores[1].trim();
                    String genero = valores[2].trim();
                    List<String> poderes = new ArrayList<>(Arrays.asList(Arrays.copyOfRange(valores, 3, valores.length)));

                    persona.setNombre(nombre);
                    persona.setAlias(alias);
                    persona.setGenero(genero);
                    persona.setPoderes(poderes);

                    return persona;
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }
    public boolean addPersona(Persona persona){

        Persona personaBuscar = new Persona(persona.getNombre());
        List<Persona> personas = obtenerPersonas();

        if (personas.contains(personaBuscar)) {
        return false;
        }
            try(FileWriter writer = new FileWriter(path, true)){
                writer.write(persona.toCsv() + '\n');

            }catch (IOException e){
                e.printStackTrace();

        }
        return true;
    }
    public boolean deletePersona(Persona persona){

        List<Persona> personas = obtenerPersonas();
        personas.remove(persona);

        try(FileWriter writer = new FileWriter(path)){
            for (Persona personaFile : personas) {
                writer.write(personaFile.toCsv() + '\n');
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return true;
    }
    public boolean updatePersona(Persona persona){

        List<Persona> personas = obtenerPersonas();

        try(FileWriter writer = new FileWriter(path)){
            for (Persona personaFile : personas)
                if(personaFile.equals(persona)) {
                    writer.write(persona.toCsv() + '\n');
                }else {
                    writer.write(personaFile.toCsv() + '\n');
                }
            return true;
        }catch (IOException e){
            e.printStackTrace();

        }
        return false;
    }
}
