package exemplo.composicao;

//Herança -> "É UM"
//Composição -> "TEM UM"
//by Igor Ferreia

public class PessoaFisica {

    private String nome;
    private String cpf;
    private DadosBasicosPessoa dadosBasicos;

    private Endereco endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public DadosBasicosPessoa getDadosBasicos() {
        return dadosBasicos;
    }

    public void setDadosBasicos(DadosBasicosPessoa dadosBasicos) {
        this.dadosBasicos = dadosBasicos;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dadosBasicos=" + dadosBasicos +
                '}';
    }
}
