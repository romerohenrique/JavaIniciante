package br.com.cursojava.javacore.Passert;

/**
 * Assert: utiliaado para linha de produção, quando se sabe absolutamente que o valor não poderá ser diferente.
 * É preciso ablitar a opção  de validção Assert na JVM.
 */
public class AcertivaTest {
    public static void main(String[] args) {
        // exemplo 1: calcular salário não pode ser menor que zero:
        calacularSalario(0);

        //exemplo 2: dia da semana não pode ser menor que 1 ou maior que 7:
        diasDaSemana();
    }

    private static void calacularSalario(double salario) {
        assert salario > 0 : "Salario ter que ser maior que zero, salário informado: " + salario;
    }

    public static void diasDaSemana(){
        int dia=0;
        switch (dia){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false;
        }
    }
}
