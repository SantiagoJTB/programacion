package ies.puerto;

public class App {
    static Coche miCoche;
    static Coche miCocheColor;
    static Bicicleta miBici;
    static Coche miCocheMatricula;

    public static void main(String[] args) {
       miCoche = new Coche();
       miCoche.mover();
       miCoche.miColor();
       System.out.println(miCoche.toString());

       miCocheColor = new Coche("rojo");
       miCocheColor.mover();
       miCocheColor.miColor();

       miBici = new Bicicleta("L","azul");
       miBici.mover();
       miBici.miColor();
       System.out.println(miBici.toString());

       miCocheMatricula = new Coche("rojo", "abc");
       miCocheMatricula.mover();
       miCocheMatricula.miColor();
        System.out.println(miCocheMatricula.toString());
    }

}
