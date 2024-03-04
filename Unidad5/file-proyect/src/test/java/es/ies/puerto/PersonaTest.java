package es.ies.puerto;

import es.ies.puerto.modelo.Persona;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PersonaTest {
    int id = 1;
    String nombre  = "nombre";
    int edad = 12;
    String email = "test@test.com";
    Persona persona;
    List<Persona> personas;
    @BeforeEach
    public void beforeEach(){
        persona = new Persona(id, nombre, edad, email);
        personas = new ArrayList<>();
        personas.add(persona);
    }
    @Test
    public void createPersonaTest(){
        Assertions.assertNotNull(persona, "El objeto no puede ser nulo");
    }
    @Test
    public void toStringPersonaTest(){
        Assertions.assertTrue(persona.toString().contains(String.valueOf(id)),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(nombre),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(String.valueOf(edad)),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toString().contains(email),"El resultado no es el esperado");
    }
    @Test
    public void equalsPersonaTest(){
        Persona personaBuscar = new Persona(id, nombre, edad, email);
        Assertions.assertEquals(personaBuscar,persona,"El resultado no es el esperado");
    }
    @Test
    public void toCsvPersonaTest(){
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(id)),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(nombre),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(String.valueOf(edad)),"El resultado no es el esperado");
        Assertions.assertTrue(persona.toCsv().contains(email),"El resultado no es el esperado");
    }
}
