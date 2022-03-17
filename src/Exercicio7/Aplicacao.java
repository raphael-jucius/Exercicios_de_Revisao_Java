package Exercicio7;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[]args){
        float diagonalMaior;
        float diagonalMenor;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a diagonal maior: ");
        diagonalMaior = ler.nextFloat();
        Losango.setDiagonalMaior(diagonalMaior);

        System.out.println("Informe a diagonal menor: ");
        diagonalMenor = ler.nextFloat();
        Losango.setDiagonalMenor(diagonalMenor);

        System.out.print("A área do Losango é: " + Losango.getDiagonalMaior() * Losango.getDiagonalMenor() / 2);
    }
}
