package Exercicio4;

public class Pessoa {
    private static String Nome;
    private static int Idade;

    public Pessoa(String nome, int idade){
        Nome = nome;
        Idade = idade;
    }

    public static String getNome() {
        return Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public static void setNome(String nome) {
        Nome = nome;
        if (nome != null);
        else System.out.println("O nome não pode estar vazio!");
    }

    public static void setIdade(int idade) {
        Idade = idade;
        if (idade > 0);
        else System.out.println("A idade não pode ser menor que 0!");
    }
}
