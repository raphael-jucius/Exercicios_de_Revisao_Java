package Exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[]args){
       Scanner ler = new Scanner(System.in);
       String frase, palavra, troca;

       System.out.println("Digite a frase: ");
       frase = ler.nextLine();

       System.out.println("Digite a palavra que deseja trocar: ");
       palavra = ler.nextLine();

       System.out.println("Digite a palavra que ira substituir: ");
       troca = ler.nextLine();

       String novaFrase = frase.replaceAll(palavra, troca);

       System.out.println("Frase original: " + frase);
       System.out.println("Frase alterada: " + novaFrase);
    }
}
