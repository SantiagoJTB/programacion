package org.example.file;

import org.example.Persona;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.awt.event.PaintEvent;
import java.util.ArrayList;
import java.util.List;

@Root(name = "personajes")
public class XmlFileList {
    @ElementList(inline = true)
    List<Persona> personas = new ArrayList<>();
    public XmlFileList() {
    }
    public XmlFileList(List<Persona> personas) {
        this.personas = personas;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
