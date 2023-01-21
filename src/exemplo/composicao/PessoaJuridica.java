package exemplo.composicao;

//Herança -> "É UM"
//Composição -> "TEM UM"
//by Igor Ferreia

public class PessoaJuridica {

    private String razaoSocial;
    private String cnpj;
    private DadosBasicosPessoa dadosBasicos;

    private Endereco endereco;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
        return "PessoaJuridica{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", endereco='" + endereco + '\'' +
                ", dadosBasicos=" + dadosBasicos +
                '}';
    }
}
