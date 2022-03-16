package Exercicio2;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[]args){
        int altura;
        int lado;

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o valor da Altura: ");
        altura = ler.nextInt();
        Terreno.setAltura(altura);

        System.out.println("Insira o valor do lado: ");
        lado = ler.nextInt();
        Terreno.setLado(lado);

        System.out.println("A área do terreno é: " + Terreno.getAltura() * Terreno.getLado() + "m");

    }
}
