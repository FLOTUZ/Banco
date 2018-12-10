package Banco;
import Banco.Cuentas.Ahorro;
import Banco.Cuentas.Cheques;
import Banco.Cuentas.Cuenta;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final ArrayList <Cuenta> baseCuentas = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        File datosClientes = new File("cuentas.txt");
        Scanner leer = new Scanner(datosClientes);

        while (leer.hasNext()) {
            String tipo = leer.next();
            if (tipo.equalsIgnoreCase("Cheques")) baseCuentas.add(new Cheques(leer));
            if (tipo.equalsIgnoreCase("Ahorro")) baseCuentas.add(new Ahorro(leer));
        }
    }
}
