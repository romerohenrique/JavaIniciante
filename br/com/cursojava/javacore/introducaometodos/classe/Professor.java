package br.com.cursojava.javacore.introducaometodos.classe;

/**
 * metodo imprimir utilizando uma variável 'aux' do tipo Professor, pra referÊnciar o objeto professor da
 * classe ProfessorTest
 */
public class Professor {
    public String matricula;
    public String nome;
    public String rg;
    public String cpf;

    public void imprimir(Professor aux) {
        System.out.println("MATRICULA: "+aux.matricula);
        System.out.println("NOME: "+aux.nome);
        System.out.println("RG: "+aux.rg);
        System.out.println("CPF: "+aux.cpf);
    }
}
