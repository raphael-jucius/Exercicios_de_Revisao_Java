package Exercicio4;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[]args){
        String nome;
        int idade;
        int dias;

        Scanner ler = new Scanner(System.in);

        System.out.println("Escreva seu nome: ");
        nome = ler.nextLine();
        Pessoa.setNome(nome);

        System.out.println("Informe sua idade: ");
        idade = ler.nextInt();
        Pessoa.setIdade(idade);
        dias = idade * 365;

        System.out.println("Seu nome é " + Pessoa.getNome() + " você já viveu " + dias + " dias");
    }
}
