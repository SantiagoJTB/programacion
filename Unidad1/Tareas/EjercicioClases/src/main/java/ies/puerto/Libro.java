package ies.puerto;

import java.util.Scanner;

public class Libro {
    String titulo;
    String autor;
    int fechaPublicacion;

    public Libro() {
    }

    public Libro(String titulo, String autor, int fechaPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(int fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void imprimir() {
        System.out.println("Titulo:" + titulo + " | Autor:" + autor + " | Fecha de Publicación:" + fechaPublicacion);
    }

    public static void cambiarDato(Scanner sc, Libro libro) {
        System.out.println("¿Qué dato quieres cambiar? 1.Titulo 2.Autor 3.Fecha de publicación");
        int opcion=sc.nextInt();

        sc.nextLine();

        switch(opcion){
            case 1:
                System.out.println("Elige nuevo titulo:");
                String nuevoTitulo=sc.nextLine();
                libro.setTitulo(nuevoTitulo);
                break;
            case 2:
                System.out.println("Elige nuevo autor:");
                String nuevoAutor=sc.nextLine();
                libro.setAutor(nuevoAutor);
                break;
            case 3:
                System.out.println("Elige nueva fecha:");
                int nuevoFecha = sc.nextInt();
                libro.setFechaPublicacion(nuevoFecha);
                break;
            default:
                System.out.println("Opción inválida.");
                break;

        }
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("La nausea", "Jean Paul Sartre", 1980);
        Libro libro2 = new Libro("Ecce Homo", "Nietzche", 1900);
        Libro libro3 = new Libro("El banquete", "Platon", 2023);

        libro1.imprimir();
        libro2.imprimir();
        libro3.imprimir();

        Scanner sc = new Scanner(System.in);

        String yes;

            System.out.println("¿Quieres cambiar algún dato? yes/no");
            yes = sc.nextLine();

        if (yes.equals("yes"));{
            System.out.println("¿Qué libro quieres cambiar? 1 ,2 ,3 ");
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1: cambiarDato(sc,libro1);
                        libro1.imprimir();
                        break;
                case 2: cambiarDato(sc,libro2);
                        libro2.imprimir();
                        break;
                case 3: cambiarDato(sc,libro3);
                        libro3.imprimir();
                        break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        }
    }
}
