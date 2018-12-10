package Banco.Cuentas;

import java.util.Scanner;

public class Cheques extends Cuenta {
    private int chequesEmitidos;
    private  double cargos;
    public Cheques(Scanner leer) {
        super(leer);
        this.chequesEmitidos = leer.nextInt();
        this.cargos = leer.nextDouble();
    }
    @Override
    public String toString() {
        return getTipo() + getnCuenta() +
                getNombre() + getSaldo();
    }
    public double emitirCheque(){
        if (chequesEmitidos < 11) {
            this.cargos += 5;
        }
        return setSaldo(cargos);
    }
}
