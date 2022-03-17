package Exercicio3;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[]args){
        int cavalos;
        int ferraduras;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o número de cavalos: ");
        cavalos = ler.nextInt();
        Haras.setCavalos(cavalos);
        ferraduras = 4 * cavalos;
        Haras.setFerraduras(ferraduras);

        System.out.println("As quantidade de ferraduras para os cavalos são: " + Haras.getFerraduras() + " Ferraduras");
    }
}
