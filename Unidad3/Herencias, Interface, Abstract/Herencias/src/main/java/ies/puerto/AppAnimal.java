package ies.puerto;

public class AppAnimal {
    static Gato gato;
    static Perro perro;
    static Animal animal;
    static Loro loro;
    static Serpiente serpiente;

    public static void main(String[] args) {
        gato = new Gato(2,"Gatito","a","b");
        System.out.println("Nombre animal: "+ gato);
        System.out.println("Sonido animal: "+gato.suSonido());

        perro = new Perro(1,"Perrito","a","b");
        System.out.println("Nombre animal: "+perro);
        System.out.println("Sonido animal: "+perro.suSonido());

        loro = new Loro(1,"Lorito","a","b");
        System.out.println("Nombre animal: "+loro);
        System.out.println("Sonido animal: "+loro.suSonido());

        serpiente = new Serpiente();
        System.out.println(serpiente.suSonido());


    }

}
