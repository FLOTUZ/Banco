package Banco.Cuentas;

import java.util.Scanner;

public class Cheques extends Cuenta implements Operaciones{
    private int chequesEmitidos;
    private  double cargos;
    public Cheques(Scanner leer) {
        super(leer);
        this.chequesEmitidos = leer.nextInt();
        this.cargos = leer.nextDouble();
    }

    public double emitirCheque(){
        if (chequesEmitidos < 11) cargos += 5;
        if(chequesEmitidos >= 11) cargos = 0;
        return setSaldo(cargos);
    }

    public double getCargos() {
        return cargos;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + chequesEmitidos + cargos;
    }
}
