package Banco;
import Banco.Cuentas.Ahorro;
import Banco.Cuentas.Cheques;
import Banco.Cuentas.Cuenta;
import Banco.Cuentas.Maestra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static final ArrayList <Cuenta> baseCuentas = new ArrayList<>();//Base de cuentas

    public static void main(String[] args) throws FileNotFoundException {
        llenadoDeBase();
        imprimirCuentaCheques();
    }

    private static void imprimirCuentaCheques() {
        System.out.println("Cuentas de cheques");
        System.out.println("\tTipo\tn\tCliente\tSaldo\t");
        for (int i = 0; i < baseCuentas.size(); i++) {
            if (baseCuentas.get(i) instanceof Cheques) {
                System.out.println("\t" + baseCuentas.get(i));
            }
        }
        System.out.println("Cuenta de ahorros");
        System.out.println("\tTipo\tn\tCliente\tSaldo\tRetir");
        for (int i = 0; i <baseCuentas.size() ; i++) {
            if (baseCuentas.get(i) instanceof Ahorro) {
                System.out.println("\t" + baseCuentas.get(i));
            }
        }
        System.out.println("Cuentas Maestras de cheques");
        System.out.println("\tTipo\tn\tCliente\tSaldo\t");
        for (int i = 0; i <baseCuentas.size(); i++) {
            if (baseCuentas.get(i) instanceof Maestra){
                System.out.println("\t" + baseCuentas.get(i));}
        }
    }

    private static void llenadoDeBase() throws FileNotFoundException {
        File datosClientes = new File("cuentas.txt");
        Scanner leer = new Scanner(datosClientes);

        while (leer.hasNext()) {    //Lleno mi base de datos
            String tipo = leer.next();  //Obtengo primer dato de mi archivo cuentas
            if (tipo.equalsIgnoreCase("Cheques")) baseCuentas.add(new Cheques(leer));
            if (tipo.equalsIgnoreCase("Ahorro")) baseCuentas.add(new Ahorro(leer));
            if (tipo.equalsIgnoreCase("Maestra")) baseCuentas.add(new Maestra(leer));
        }
    }
}
