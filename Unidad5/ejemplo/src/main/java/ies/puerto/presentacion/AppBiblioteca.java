package ies.puerto.presentacion;

import java.io.BufferedReader;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AppBiblioteca {
    public static void main(String[] args) {
        List<Articulo> alimentos = lectura("src/main/resources/alimentos.csv","alimento");
        System.out.println(alimentos);
    }
    public static boolean existeFichero(String path) {
        if (path == null || path.isEmpty()) {
            return false;
        }
        File fichero = new File(path);
        return fichero.exists() && fichero.isFile();
    }
    public static List<Articulo> lectura(String path, String articulo) {
        List<Articulo> articulos = new ArrayList<>();

        // Verificar si el fichero existe antes de intentar leerlo
        if (existeFichero(path)) {
            try (BufferedReader br = new BufferedReader(new FileReader(path))) {
                String linea;
                int i = 0;
                // Leer cada línea del fichero
                while ((linea = br.readLine()) != null) {
                    if(i>0){
                        switch (articulo){
                            case"alimento":
                                String[] alimentosArray = linea.split(",");
                                Alimento alimento = new Alimento(alimentosArray[3],alimentosArray[0],Float.parseFloat(alimentosArray[1]),alimentosArray[4], alimentosArray[2]);
                                articulos.add(alimento);
                                System.out.println(linea);
                                break;
                            case"aparato":
                                break;
                            default:break;
                        }
                    }
                    i++;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("El fichero no existe o no es un fichero válido.");
        }
        return articulos;
    }
}
