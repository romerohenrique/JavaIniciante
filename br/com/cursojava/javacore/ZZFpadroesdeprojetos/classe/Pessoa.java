package br.com.cursojava.javacore.ZZFpadroesdeprojetos.classe;

/*
padrao de projeto builder
 */
public class Pessoa {
    private String nome;
    private String sobreNome;
    private String apelido;
    private String nomeDaMae;

    private Pessoa(String nome, String sobrenome, String apelido, String nomeDamae) {
        this.nome = nome;
        this.sobreNome = sobrenome;
        this.apelido = apelido;
        this.nomeDaMae = nomeDamae;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobreNome + '\'' +
                ", apelido='" + apelido + '\'' +
                ", nomeDamae='" + nomeDaMae + '\'' +
                '}';
    }

    //padrão builder
    public static class PessoaBuilder {
        private String nome;
        private String sobrenome;
        private String apelido;
        private String nomeDamae;

        public PessoaBuilder(String nome) {
            this.nome = nome;
        }

        public PessoaBuilder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public PessoaBuilder sobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
            return this;
        }

        public PessoaBuilder apelido(String apelido) {
            this.apelido = apelido;
            return this;
        }

        public PessoaBuilder nomeDamae(String nomeDaMae) {
            this.nomeDamae = nomeDaMae;
            return this;
        }

        public Pessoa build() {
            return new Pessoa(nome, sobrenome, apelido, nomeDamae);
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomeDaMae() {
        return nomeDaMae;
    }

    public void setNomeDaMae(String nomeDaMae) {
        this.nomeDaMae = nomeDaMae;
    }
}
