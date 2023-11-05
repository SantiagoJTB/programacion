package ies.puerto;

import java.util.Scanner;

public class Persona {
    String nombre;
    String email;
    int telefono;
    int edad;

    public Persona() {}

    public Persona(String nombre, String email, int telefono, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Función para imprimir los valores
     */
    public void imprimir() {
        System.out.println("nombre: " + nombre + "; email: " + email + "; telefono: " + telefono + "; edad: " + edad);
    }

    /**
     * Función de llamada en el main para cambiar datos
     * @param scanner se exporta el escáner para utilizarlo en la función
     * @param persona numero del objeto
     */
    public static void modificarPersona(Scanner scanner, Persona persona) {
        System.out.println("¿Qué dato quieres actualizar?");
        System.out.println("1. Nombre");
        System.out.println("2. Email");
        System.out.println("3. Teléfono");
        System.out.println("4. Edad");
        int opcion = scanner.nextInt();

        scanner.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("Ingresa el nuevo nombre: ");
                String nuevoNombre = scanner.nextLine();
                persona.setNombre(nuevoNombre);
                break;
            case 2:
                System.out.println("Ingresa el nuevo email: ");
                String nuevoEmail = scanner.nextLine();
                persona.setEmail(nuevoEmail);
                break;
            case 3:
                System.out.println("Ingresa el nuevo teléfono: ");
                int nuevoTelefono = scanner.nextInt();
                persona.setTelefono(nuevoTelefono);
                break;
            case 4:
                System.out.println("Ingresa la nueva edad: ");
                int nuevaEdad = scanner.nextInt();
                persona.setEdad(nuevaEdad);
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
        System.out.println("Datos actualizados:");
        persona.imprimir();
    }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Santi", "Santi@email.com", 123456, 25);
        Persona persona2 = new Persona("Paco", "Paco@email.com", 1223455, 23);

        persona1.imprimir();
        persona2.imprimir();

        Scanner sc = new Scanner(System.in);

        System.out.println("¿Quieres actualizar algún dato? y/n");
        String cambiarDato = sc.nextLine();

        if (cambiarDato.equals("y")) {
            System.out.println("¿A qué persona quieres actualizar? 1 = Persona1 - 2 = Persona2");
            int tipoPersona = sc.nextInt();
            switch (tipoPersona) {
                case 1:
                    modificarPersona(sc, persona1);
                    break;
                case 2:
                    modificarPersona(sc, persona2);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
