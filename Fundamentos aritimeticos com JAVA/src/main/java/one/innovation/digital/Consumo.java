package one.innovation.digital;

import java.io.IOException;
import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int distancia = leitor.nextInt();
        double combustivel = leitor.nextDouble();

        double media;
        media = distancia/combustivel;
        System.out.println(String.format("%.3f km/l", media));
    }
}
