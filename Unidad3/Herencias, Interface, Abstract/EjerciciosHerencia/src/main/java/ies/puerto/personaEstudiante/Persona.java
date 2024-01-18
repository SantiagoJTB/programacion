package ies.puerto.personaEstudiante;

/**
 * Crea una clase Estudiante que herede de la clase Persona. La clase Estudiante debe tener
 * atributos adicionales como curso y notas, y métodos para obtener y establecer estos valores.
 * Añade un método saludar en la clase Persona que imprima un mensaje genérico.
 * Sobrescribe este método en la clase Estudiante para imprimir un mensaje personalizado.
 * Crea un paquete acceso con una clase Autenticacion que contenga métodos para validar credenciales de usuarios.
 * Utiliza esta clase en el paquete modelo para añadir funcionalidades de autenticación a las clases Persona y Estudiante.
 */
public abstract class Persona{
    String nombre;
    String dni;

    public Persona(){}
    public Persona(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String toString(){
        return "EL nombre es:"+getNombre()+", el dni:"+getDni();
    }
    public String saludar(){
        return "Saludos desde la clase Persona";
    }
}
