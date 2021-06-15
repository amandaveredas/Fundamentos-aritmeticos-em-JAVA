package one.innovation.digital;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseNum {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int i = 0;
        int[] numeros = new int[5];
        int cont = 0;
        int par = 0;
        int impar = 0;
        int pos = 0;
        int neg = 0;

        //construindo o array de números
        while (i<5){
            numeros[i] = leitor.nextInt();
            i++;
        }

        //verificando se são pares/impares e se são positivos/negativos
        for (cont = 0; cont<numeros.length; cont++) {
            if (numeros[cont]%2 == 0) //se for par:
            {par++;}
            else impar++;

            if (numeros[cont]>0) pos++;
            else if(numeros[cont]==0);
            else neg++;

        }

        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }
}
