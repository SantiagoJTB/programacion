package ies.puerto.mundoMotor;

public class AppMundoMotor {
    static Conductor conductor1;
    static Coche coche1;
    static Moto moto1;

    public static void main(String[] args) {
        moto1 = new Moto("Yamaha", "001", 3000, 2);
        coche1 = new Coche("Opel", "Corsa", 2000, 5);
        conductor1 = new Conductor("Juan", "1234567A", coche1.getMarca());
        System.out.println(conductor1.toString());
        System.out.println(coche1.toString());
        System.out.println(moto1.toString());
    }
}
