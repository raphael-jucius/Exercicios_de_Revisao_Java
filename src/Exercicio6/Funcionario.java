package Exercicio6;

public class Funcionario {
    private static double SalarioMin;
    private static double SalarioFun;

    public Funcionario(double salarioMin, double salarioFun){
        SalarioMin = salarioMin;
        SalarioFun = salarioFun;
    }


    public static double getSalarioMin() {
        return SalarioMin;
    }

    public static double getSalarioFun() {
        return SalarioFun;
    }

    public static void setSalarioMin(double salarioMin) {
        SalarioMin = salarioMin;
        if (salarioMin > 0);
        else System.out.println("Um salario tem que ser maior que zero!");
    }

    public static void setSalarioFun(double salarioFun) {
        SalarioFun = salarioFun;
        if (salarioFun > 0);
        else System.out.println("Um salario tem que ser maior que zero!");
    }
}
