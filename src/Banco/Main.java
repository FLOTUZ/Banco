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
