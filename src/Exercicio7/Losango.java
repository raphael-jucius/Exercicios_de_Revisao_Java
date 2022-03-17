package Exercicio7;

public class Losango {
    static float DiagonalMaior;
    static float DiagonalMenor;

    public Losango(float diagonalMaior, float diagonalMenor){
        DiagonalMaior = diagonalMaior;
        DiagonalMenor = diagonalMenor;
    }

    public static float getDiagonalMaior() {
        return DiagonalMaior;
    }

    public static float getDiagonalMenor() {
        return DiagonalMenor;
    }

    public static void setDiagonalMaior(float diagonalMaior) {
        DiagonalMaior = diagonalMaior;
        if (diagonalMaior > getDiagonalMenor());
        else System.out.println("A diagonal maior tem que ser maior que a diagonal menor!");
    }

    public static void setDiagonalMenor(float diagonalMenor) {
        DiagonalMenor = diagonalMenor;
        if (diagonalMenor > 0);
        else System.out.println("A diagonal menor tem que ser maior que zero!");
    }
}
