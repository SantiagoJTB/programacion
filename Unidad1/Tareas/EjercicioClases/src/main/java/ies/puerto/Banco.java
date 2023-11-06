package ies.puerto;

import java.util.Scanner;

public class Banco {
    static int numeroCuenta;
    static String nombreTitular;
    static int saldo;

    public Banco(){}

    public Banco(int numeroCuenta, String nombreTitular, int saldo){
        this.numeroCuenta=numeroCuenta;
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
    }

    public static int getNumeroCuenta() {return numeroCuenta;}
    public void setNumeroCuenta(int numeroCuenta) {this.numeroCuenta = numeroCuenta;}
    public static String getNombreTitular() {return nombreTitular;}
    public void setNombreTitular(String nombreTitular) {this.nombreTitular = nombreTitular;}
    public static int getSaldo() {return saldo;}
    public void setSaldo(int saldo) {this.saldo = saldo;}

    static Scanner sc =new Scanner(System.in);

    public static void imprimir(){
        System.out.println("Número de cuenta: "+getNumeroCuenta()+" | Nombre titular: "+getNombreTitular()+" | Saldo: "+getSaldo());
    }
    public static void ingresar(){
        double saldoAnterior=getSaldo();
        System.out.println("¿Cuanto quieres ingresar?");
        double ingreso=sc.nextInt();
        double saldoActual = saldoAnterior+ingreso;
        System.out.println("Tu saldo acutal es: "+saldoActual);
    }
    public static void retirar(){
        double saldoAnterior=getSaldo();
        System.out.println("¿Cuanto quieres retirar?");
        double retiro=sc.nextInt();
        double saldoActual = saldoAnterior+retiro;
        System.out.println("Tu saldo acutal es: "+saldoActual);
    }

    public static void elegirCuenta(){

    }
    /**
     * Método que implementa los 2 métodos: retirar, ingresar e imprimir.
     * @param banco (cuentaX)
     */
    public static void operacion(Banco banco){

            System.out.println("¿Qué operación quieres realizar? 1.Ingresar dinero |  2.Retirar dinero | 3.Mostrar datos");
            int opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    ingresar();
                    break;
                case 2:
                    retirar();
                    break;
                case 3:
                    imprimir();
                    break;
            }

    }
    public static void main(String[] args) {

        Banco cuenta1=new Banco(0001,"Santiago",1000);
        Banco cuenta2=new Banco(0002,"Oliver",2000);
        Banco cuenta3=new Banco(0003,"Eliot",3000);

        System.out.println("Elige una cuenta: 1, 2, 3");
        int opcion=sc.nextInt();

        switch(opcion){
            case 1: operacion(cuenta1);
            break;
            case 2: operacion(cuenta2);
            break;
            case 3: operacion(cuenta3);
            break;
        }

    }

}
