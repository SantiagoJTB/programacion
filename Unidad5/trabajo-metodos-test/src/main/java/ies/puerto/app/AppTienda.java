package ies.puerto.app;

import ies.puerto.abstractas.Producto;
import ies.puerto.clases.*;

import java.util.Scanner;

public class AppTienda {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Alimento alimento1 = new Alimento("Manzanas","2024-01-09",2.50f,"ALM001","2024-01-15");
        Alimento alimento2 = new Alimento("Leche","2024-02-09",1.99f,"ALM002","2024-02-14");
        Alimento alimento3 = new Alimento("Arroz","2024-01-15",3.75f,"ALM003","2024-01-27");

        Aparato aparato1 = new Aparato("Televisor LED","2024-02-09",499.99f,"APA001");
        Aparato aparato2 = new Aparato("Smartphone","2024-02-09",799.99f,"APA002");
        Aparato aparato3 = new Aparato("Cafetera","2024-02-09",39.99f,"APA003");

        Soubenir soubenir1 = new Soubenir("Imán de nevera","2024-02-09",1.99f,"SOU001");
        Soubenir soubenir2 = new Soubenir("Llavero","2024-02-09",0.99f,"SOU002");
        Soubenir soubenir3 = new Soubenir("Taza de café","2024-02-09",3.49f,"SOU003");

        CuidadoPersonal cuidadoPersonal1 = new CuidadoPersonal("Champú","2024-02-09",3.99f,"CUI001",7);
        CuidadoPersonal cuidadoPersonal2 = new CuidadoPersonal("Crema hidratante","2024-02-09",5.49f,"CUI002",8);
        CuidadoPersonal cuidadoPersonal3 = new CuidadoPersonal("Cepillo de dientes","2024-02-09",2.29f,"CUI003",6);

        Tienda.alimentos.add(alimento1);
        Tienda.alimentos.add(alimento2);
        Tienda.alimentos.add(alimento3);
        Tienda.aparatos.add(aparato1);
        Tienda.aparatos.add(aparato2);
        Tienda.aparatos.add(aparato3);
        Tienda.soubenirs.put(soubenir1.getId(), soubenir1);
        Tienda.soubenirs.put(soubenir2.getId(), soubenir2);
        Tienda.soubenirs.put(soubenir3.getId(), soubenir3);
        Tienda.cuidados.add(cuidadoPersonal1);
        Tienda.cuidados.add(cuidadoPersonal2);
        Tienda.cuidados.add(cuidadoPersonal3);
        Tienda.productosDisponibles();
        Tienda.productosPopulares();
        menu();
    }
    public static void menu(){
        System.out.println("Elige el Producto que deseas utilizar: Alimento, Aparato, Soubenir, CuidadoPersonal");
        String opcion =sc.nextLine();
        switch (opcion){
            case "Alimento": menuOpciones(opcion, new Alimento());
            case "Aparato": menuOpciones(opcion, new Aparato());
            case "Soubenir": menuOpciones(opcion, new Soubenir());
            case "CuidadoPersonal": menuOpciones(opcion, new CuidadoPersonal());
            default:
                System.out.println("Introduce un producto valido");
                menu();
        }

    }

    public static void menuOpciones(String opcion, Producto producto){
        System.out.println("Elige una accion a realizar: Aniadir, Eliminar, Mostrar, Modificar");
        switch (sc.nextLine()){
            case "Aniadir":
                Producto producto1 = crearProducto(opcion);
                System.out.println(producto1);
                System.out.println(Tienda.aniadirProducto(producto));
                break;
            case "Eliminar":
                System.out.println(Tienda.eliminarProducto(producto,introducirID()));
                break;
            case "Mostrar":
                System.out.println(Tienda.mostrarProducto(producto, introducirID()));
                break;
            case "Modificar":
                Producto producto2 = Tienda.mostrarProducto(producto, introducirID());
                System.out.println(producto);
                System.out.println(Tienda.modificarProducto(producto2));
                System.out.println(producto2);
            default:
                System.out.println("Introduce una accion valida");
                menuOpciones(opcion, producto);
        }
    }
    public static Producto crearProducto(String opcion){
        System.out.println("Introduce el id:");
        String id = sc.nextLine();
        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();
        System.out.println("Introduce el fecha:");
        String fecha = sc.nextLine();
        System.out.println("Introduce el precio:");
        float precio = sc.nextFloat();
        sc.nextLine();

        switch (opcion){
            case "Aparato": return new Aparato(nombre, fecha, precio, id);
            case "Soubenir": return new Soubenir(nombre, fecha, precio, id);
            case "CuidadoPersonal":
                System.out.println("Introduce la valoracion:");
                int valoracion = sc.nextInt();
                return new CuidadoPersonal(nombre, fecha, precio, id, valoracion);
            case "Alimento":
                System.out.println("Introduce la fecha de caducidad:");
                String fechaCaducidad = sc.nextLine();
                return new Alimento(nombre, fecha, precio, id, fechaCaducidad);
            default:
                System.out.println("Opcion incorrecta");
        }
        return null;
    }
    public static String introducirID(){
        System.out.println("Introduce el ID:");
        return sc.nextLine();
    }
}
