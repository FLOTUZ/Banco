package Banco.Cuentas;

import java.util.Scanner;

public class Cuenta {
    private String tipo;
    private int nCuenta;
    private String nombre;
    private double saldo;

    public Cuenta(Scanner leer) {
        this.tipo = leer.next();
        this.nCuenta = leer.nextInt();
        this.nombre = leer.next();
        this.saldo = leer.nextInt();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getnCuenta() {
        return nCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }
}
