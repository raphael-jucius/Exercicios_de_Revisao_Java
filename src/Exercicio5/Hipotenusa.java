package Exercicio5;

public class Hipotenusa {
    private static double CatetoA;
    private static double CatetoB;

    public Hipotenusa(double catetoA, double catetoB){
        CatetoA = catetoA;
        CatetoB = catetoB;
    }

    public double getCatetoA() {
        return CatetoA;
    }

    public double getCatetoB() {
        return CatetoB;
    }

    public static void setCatetoA(double catetoA) {
        CatetoA = catetoA;
        if (catetoA > 0);
        else System.out.println("O cateto não pode ser menor que zero!");
    }

    public static void setCatetoB(double catetoB) {
        CatetoB = catetoB;
        if (catetoB > 0);
        else System.out.println("O cateto não pode ser menor que zero!");
    }
}
