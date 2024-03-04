package ies.puerto.modelo.interfaces;

import ies.puerto.modelo.entity.BibliotecaEntity;
import ies.puerto.modelo.entity.LibroEntity;

import java.util.List;

public interface IBiblioteca {
    public BibliotecaEntity buscarBiblioteca(int id);
    public BibliotecaEntity buscarBiblioteca(BibliotecaEntity bibliotecaEntity);
    public BibliotecaEntity actualizarBiblioteca(BibliotecaEntity bibliotecaEntity);
    public BibliotecaEntity eliminarBiblioteca(BibliotecaEntity bibliotecaEntity);
    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity);

}
