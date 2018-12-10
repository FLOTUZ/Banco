package Banco.Cuentas;

import java.util.Scanner;

public class Ahorro extends Cuenta {

    public Ahorro(Scanner leer) {
        super(leer);
    }

    @Override
    public String toString() {
        return getTipo() + getnCuenta() +
                getNombre() + getSaldo();
    }
}
