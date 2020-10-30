package br.com.cursojava.javacore.assertiva16;

public class AcertivaTest {
    public static void main(String[] args) {
        calacularSalario(0);
    }

    private static void calacularSalario(double salario) {
        assert salario > 0 : "Salario ter que ser maior que zero, salário informado: " + salario;
    }
}
