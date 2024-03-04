package ies.puerto.modelo.ficheros.csv.implementacion;

import ies.puerto.modelo.entity.BibliotecaEntity;
import ies.puerto.modelo.entity.LibroEntity;
import ies.puerto.modelo.interfaces.IBiblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class BibliotecaCSV implements IBiblioteca {
    @Override
    public BibliotecaEntity buscarBiblioteca(int id) {
        return null;
    }

    @Override
    public BibliotecaEntity buscarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity actualizarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public BibliotecaEntity eliminarBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }

    @Override
    public List<LibroEntity> buscarLibrosBiblioteca(BibliotecaEntity bibliotecaEntity) {
        return null;
    }
    public boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }
    public boolean existeDirectorio(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File directory = new File(path);
        return directory.exists() && directory.isDirectory();
    }
    public static void lectura(String path) {
        File fichero = new File(path);
        if (fichero.exists() && fichero.isFile()) {
            try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
                String linea;
                // Leer cada línea del fichero
                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
    }
}
