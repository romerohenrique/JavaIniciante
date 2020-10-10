package br.com.cursojava.introducao.controledefluxo;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

/**
 * Condicionais if e else
 * imposto sobre salário
 * salario < 1000 5%
 * salario >= 1000 && salario <2000 10%
 * salario >= 2000 && salario <4000 15%
 * salario >= 4000 20%
 */
public class ControleFluxo1 {
    public static void main(String[] args) {
        double salario = 4000;
        double imposto;

        if (salario < 1000) {
            imposto = salario * 0.05;
            LOGGER.info("Seu imposto é de 5 % sobre o salario");
        } else if (salario >= 100 && salario < 2000) {
            imposto = salario * 0.1;
            LOGGER.info("Seu imposto é de 10 % sobre o salario");
        } else if (salario > 2000 && salario < 4000) {
            imposto = salario * 0.15;
            LOGGER.info("Seu imposto é de 15 % sobre o salario");
        } else {
            imposto = salario * 0.2;
            LOGGER.info("Seu imposto é de 20 % sobre o salario");
        }
        LOGGER.info("Salário: R$" + salario + "; Imposto: R$" + imposto);
    }
}
