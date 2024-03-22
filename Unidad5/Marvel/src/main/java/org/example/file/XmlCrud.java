package org.example.file;

import org.example.Persona;
import org.simpleframework.xml.core.Persister;

import java.io.File;
import java.util.List;

public class XmlCrud {
    String path = "src/main/resources/xml.xml";
    List<Persona> personas;
    public List<Persona> obtenerPersonas(){

        Persister serializer = new Persister();

        try{

            File file = new File(path);
            XmlFileList xmlFileList = serializer.read(XmlFileList.class, file);
            personas = xmlFileList.getPersonas();
            return personas;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public Persona obtenerPersona(Persona persona){
        int posicion = personas.indexOf(persona);
        if(posicion >= 0){
            return personas.get(posicion);
        }
        return null;
    }
    public boolean addPersona(Persona persona){
        if(!personas.contains(persona)){
            personas.add(persona);
            guardar();
            return true;
        }
        return false;
    }
    public boolean borrarPersona(Persona persona){
            personas.remove(persona);
            guardar();
        return true;
    }

        public boolean actualizarPersona(Persona persona) {
            int posicion = personas.indexOf(persona);
            if (posicion >= 0 && personas.contains(persona)) {
                personas.set(posicion, persona);
                guardar();
                return true;
            }
            return false;
        }
    public void guardar(){
        XmlFileList xmlFileList = new XmlFileList(personas);
        Persister serializer = new Persister();
        try {
            serializer.write(xmlFileList, new File(path));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}
