package ies.puerto.clases;

import ies.puerto.abstractas.Producto;
import ies.puerto.abstractas.ProductoRecomendable;

import java.util.*;

public class Tienda {
    public static List<Alimento> alimentos = new ArrayList<>();
    public static List<Aparato> aparatos = new ArrayList<>();
    public static Map<String, Soubenir> soubenirs = new HashMap<>();
    public static HashSet<CuidadoPersonal> cuidados = new HashSet<>();

    public static void productosDisponibles(){
        System.out.println("Productos disponibles:");
        System.out.println("Alimentos disponibles:"+ alimentos.size());
        System.out.println("Caducados:"+alimentosDisponibles());
        System.out.println("Aparatos disponibles:"+ aparatos.size());
        System.out.println("Soubenirs disponibles:"+ soubenirs.size());
        System.out.println("Cuidado personal disponible:"+ cuidados.size());
    }

    public static void productosPopulares(){
        System.out.println("Productos populares:");
        for(CuidadoPersonal cuidadoPersonal : cuidados){
            if(ProductoRecomendable.recomendarProducto(cuidadoPersonal)){
                System.out.println(cuidadoPersonal);
        }
    }
    }
    public static int alimentosDisponibles(){
        int alimentosNum = alimentos.size() - 1;
        int alimentosCaducados = 0;
        for(Alimento alimento : alimentos){
            if(alimento.caducado()){
            alimentosCaducados ++;
            }
        }
        return alimentosNum - alimentosCaducados;
    }
    public static boolean aniadirProducto(Producto producto) {
        if (producto instanceof Alimento) {
            alimentos.add((Alimento) producto);
            return true;
        } else if (producto instanceof Aparato) {
            aparatos.add((Aparato) producto);
            return true;
        } else if (producto instanceof Soubenir) {
            soubenirs.put(producto.getId(), (Soubenir) producto);
            return true;
        } else if (producto instanceof CuidadoPersonal) {
            cuidados.add((CuidadoPersonal) producto);
            return true;
        }
        return false;
    }

    public static boolean eliminarProducto(Producto producto, String ID) {
        if (producto instanceof Alimento) {
                alimentos.removeIf(v -> v.getId().equals(ID));
            return true;

        } else if (producto instanceof Aparato) {
                aparatos.removeIf(v -> v.getId().equals(ID));
            return true;

        } else if (producto instanceof Soubenir) {
            soubenirs.remove(ID);
            return true;

        } else if (producto instanceof CuidadoPersonal) {
                cuidados.removeIf(v -> v.getId().equals(ID));
            return true;
        }
        return false;
    }
    public static Producto mostrarProducto(Producto producto, String ID) {
        if (producto instanceof Alimento) {
            for (Alimento alimento : alimentos) {
                if(alimento.getId().equals(ID)){
                    return alimento;
                }
            }

        } else if (producto instanceof Aparato) {
            for (Aparato aparato : aparatos) {
                if(aparato.getId().equals(ID)){
                    return aparato;
                }
            }

        } else if (producto instanceof Soubenir) {
            return soubenirs.get(ID);

        } else if (producto instanceof CuidadoPersonal) {
            for (CuidadoPersonal cuidadoPersonal : cuidados) {
                if(cuidadoPersonal.getId().equals(ID)){
                    return cuidadoPersonal;
                }
            }

        }
        return null;
    }
    public static boolean modificarProducto(Producto producto){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige que atributo quieres actualizar: Nombre, FechaEntrada, Precio, Id, FechaCaducidad, Valoracion");
        switch (sc.nextLine()){
            case "Nombre":
                System.out.println("Elige nuevo nombre:");
                String nuevoNombre = sc.nextLine();
                producto.setNombre(nuevoNombre);
                return true;
            case "FechaEntrada":
                System.out.println("Elige nueva fecha de Entrada:");
                String nuevaFechaDeEntrada = sc.nextLine();
                producto.setFechaEntrada(nuevaFechaDeEntrada);
                return true;

            case "Precio":
                System.out.println("Elige nuevo precio:");
                float nuevoPrecio = sc.nextFloat();
                producto.setPrecio(nuevoPrecio);
                return true;

            case "Id":
                System.out.println("Elige nuevo id:");
                String nuevoId = sc.nextLine();
                producto.setId(nuevoId);
                return true;

            case "FechaCaducidad":
                System.out.println("Elige nueva caducidad:");
                String nuevaCaducidad = sc.nextLine();
                for(Alimento alimento : alimentos){
                    if (alimento.getId().equals(producto.getId())){
                        alimento.setId(nuevaCaducidad);
                    }
                }
                return true;
            case "Valoracion":
                System.out.println("Elige nueva valoracion:");
                String nuevaValoracion = sc.nextLine();
                for(CuidadoPersonal cuidadoPersonal : cuidados){
                    if (cuidadoPersonal.getId().equals(producto.getId())){
                        cuidadoPersonal.setId(nuevaValoracion);
                    }
                }
                return true;
            default:
                System.out.println("Elige una opcion válida");
                modificarProducto(producto);
        }
        return false;
    }

}


