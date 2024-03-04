package ies.puerto.modelo.entity;

public class LibroEntity {
 private String id;
 private String titulo;
 private String autor;
 private String publicacion;
 private String idBiblioteca;

    public LibroEntity(String id, String titulo, String autor, String publicacion, String idBiblioteca) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.idBiblioteca = idBiblioteca;
    }

    public String getId() {
        return id;
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

    public String getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

}