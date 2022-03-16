package Exercicio2;

public class Terreno {
    private static int Altura;
    private static int Lado;

    public Terreno( int altura, int lado){
        Altura = altura;
        Lado = lado;
    }
    public static int getAltura() {
        return Altura;
    }

    public static int getLado() {
        return Lado;
    }

    public static void setAltura(int altura) {
        Altura = altura;
    }

    public static void setLado(int lado) {
        Lado = lado;
    }
}

