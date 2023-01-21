package exemplo.composicao;

public class TesteComposicao {

    public static void main(String[] args) {
        PessoaFisica pf = new PessoaFisica();
        pf.setNome("a");
        pf.setCpf("123456789");

        DadosBasicosPessoa dadosBasicos = new DadosBasicosPessoa();
        dadosBasicos.setEmail("a@gmail.com");
        dadosBasicos.setTelefone("12345798");

        pf.setDadosBasicos(dadosBasicos);

        Endereco endereco = new Endereco();
        endereco.setRua("Rua da alegria");
        endereco.setNumero("007");

        pf.setEndereco(endereco);

        System.out.println(pf);

       // DadosBasicosPessoa pf2 = new PessoaFisica(); // Não temos polimorfismo com composição
    }
}
