package Banco.Cuentas;

import java.util.Scanner;

public class Ahorro extends Cuenta {
private int noRetiros;
private double cargos;
    public Ahorro(Scanner leer) {
        super(leer);
        this.noRetiros = leer.nextInt();
        this.cargos = leer.nextDouble();
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + noRetiros;
    }
}
