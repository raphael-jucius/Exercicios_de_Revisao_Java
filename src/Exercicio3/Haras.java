package Exercicio3;

public class Haras {
    private static int Cavalos;
    private static int Ferraduras;

    public Haras(int cavalos, int ferraduras){
        Cavalos = cavalos;
        Ferraduras = ferraduras;
    }


    public static int getCavalos() {
        return Cavalos;
    }

    public static int getFerraduras() {
        return Ferraduras;
    }

    public static void setCavalos(int cavalos) {
        Cavalos = cavalos;
        if (cavalos > 0);
        else System.out.println("O Haras precisa ter algum cavalo!");
    }

    public static void setFerraduras(int ferraduras) {
        Ferraduras = ferraduras;
        ferraduras = getCavalos() * 4;
    }
}
