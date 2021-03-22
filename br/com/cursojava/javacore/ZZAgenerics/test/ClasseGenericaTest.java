package br.com.cursojava.javacore.ZZAgenerics.test;

import br.com.cursojava.javacore.ZZAgenerics.classe.Bicicleta;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest {
    public static void main(String[] args) {
        List<Bicicleta> bicicletasDisponiveis = new ArrayList<>();
        bicicletasDisponiveis.add(new Bicicleta("mtb"));
        bicicletasDisponiveis.add(new Bicicleta("spd"));
        ObjetoAlugaveis<Bicicleta> bicicletaAlugavel = new ObjetoAlugaveis<>(bicicletasDisponiveis);
        Bicicleta b = bicicletaAlugavel.getObjetoDisponivel();
        bicicletaAlugavel.devolverObjeto(b);

    }

    static class ObjetoAlugaveis<T> {
        private List<T> objetoDisponiveis;

        public ObjetoAlugaveis(List<T> objetoDisponiveis){

            this.objetoDisponiveis = objetoDisponiveis;
        }

        //Alugar
        public T getObjetoDisponivel() {
            System.out.println("Bicicleta disponível: " + objetoDisponiveis);
            System.out.println("-------------Locando----------------");
            T t = objetoDisponiveis.remove(0);
            System.out.println("Alugando a bicicleta: " + t);
            System.out.println("-----------Estoque atual-----------------");
            System.out.println("Bicicleta disponível: " + objetoDisponiveis);
            System.out.println("---------------finalizado!---------------------");
            return t;
        }

        public void devolverObjeto(T t) {
            System.out.println("|-------------------------------------------------|");
            System.out.println("-----------------devolução-----------------------");
            System.out.println("Devolver bicicleta: " + t);
            objetoDisponiveis.add(t);
            System.out.println("------------Estoque atual-----------------");
            System.out.println("Bicicleta disponível: " + objetoDisponiveis);
        }
    }
}

