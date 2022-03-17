package Exercicio6;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[]args){
        double salarioMin;
        double salarioFun;

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o Salario minimo: ");
        salarioMin = ler.nextDouble();
        Funcionario.setSalarioMin(salarioMin);

        System.out.println("Informe o Salario do Funcionario: ");
        salarioFun = ler.nextDouble();
        Funcionario.setSalarioFun(salarioFun);

        System.out.print("O funcionario recebe: " + Funcionario.getSalarioFun() / Funcionario.getSalarioMin() + " Salarios minimos.");
    }
}
