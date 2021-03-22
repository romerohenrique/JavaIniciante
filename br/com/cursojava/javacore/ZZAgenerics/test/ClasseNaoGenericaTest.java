package br.com.cursojava.javacore.ZZAgenerics.test;

import br.com.cursojava.javacore.ZZAgenerics.classe.Bicicleta;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTest {
    public static void main(String[] args) {
        BicicletaAlugavel bicicletaAlugavel = new BicicletaAlugavel();
        Bicicleta bicicletaAlugada = bicicletaAlugavel.getBicicletaDisponivel();
        System.out.println("Bicicleta alugada por 1 dia");
        bicicletaAlugavel.devolverBicicleta(bicicletaAlugada);


    }

    static class BicicletaAlugavel {
        private List<Bicicleta> bicicletaDisponivel = new ArrayList<>();

        {
            bicicletaDisponivel.add(new Bicicleta("mtb"));
            bicicletaDisponivel.add(new Bicicleta("spd"));
        }

        //Alugar
        public Bicicleta getBicicletaDisponivel() {
            Bicicleta b = bicicletaDisponivel.remove(0);
            System.out.println("Alugando a bicicleta: " + b);
            System.out.println("Bicicleta disponível: " + bicicletaDisponivel);
            return b;
        }

        public void devolverBicicleta(Bicicleta b) {
            System.out.println("Devolver bicicleta: " + b);
            bicicletaDisponivel.add(b);
            System.out.println("Bicicleta disponível: " + bicicletaDisponivel);

        }
    }

}
