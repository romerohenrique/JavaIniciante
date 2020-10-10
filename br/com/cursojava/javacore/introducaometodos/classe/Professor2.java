package br.com.cursojava.javacore.introducaometodos.classe;

public class Professor2 {
    /**
     * Utilizando o referência '.this' no metodo imprimir,
     * para posicionar qual variavel dentro do Objeto estou querendo imprimir.
     */
        public String matricula;
        public String nome;
        public String rg;
        public String cpf;

        public void imprimir(){
            System.out.println("MATRICULA: "+this.matricula);
            System.out.println("NOME: "+this.nome);
            System.out.println("RG: "+this.rg);
            System.out.println("CPF: "+this.cpf);
        }


}
