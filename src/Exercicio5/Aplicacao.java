package Exercicio5;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[]args){
        double catetoA;
        double catetoB;
        double hipotenusa;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o primeiro cateto: ");
        catetoA = ler.nextDouble();
        Hipotenusa.setCatetoA(catetoA);

        System.out.println("Informe o segundo cateto: ");
        catetoB = ler.nextDouble();
        Hipotenusa.setCatetoB(catetoB);
        hipotenusa = Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2));

        System.out.println("O valor da Hipotenusa é: " + hipotenusa);
    }
}
