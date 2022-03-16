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
        if (altura > 0);
        else System.out.println("A altura tem que ser maior que 0!");
    }

    public static void setLado(int lado) {
        Lado = lado;
        if (lado > 0);
        else System.out.println("O lado tem que ser maior que 0!");
    }
}

