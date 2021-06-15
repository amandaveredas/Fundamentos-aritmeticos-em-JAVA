package one.innovation.digital;

import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class QuantidadeNumerosPositivos {
    public static void main(String[] args) throws IOException {
        int i = 0;
        float numero = 0;
        Scanner scanner = new Scanner(System.in);
        int cont = 0;

        while (i<6){

            numero = scanner.nextFloat();

            if (numero>0){
                cont++;
            }
            i++;
        }

        System.out.println(cont + " valores positivos");
    }
}
