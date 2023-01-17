package exemplo.heranca.bemfeita;

// É UMA
public class PessoaFisica extends Pessoa{

    // atributos especificos da classe filha
    private String cpf;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getEmail() {
        System.out.println("Pré processamento");
        String email  = super.getEmail();
        System.out.println("Pós processamento");
        return email;
    }
}
