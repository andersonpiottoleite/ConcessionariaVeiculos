package exemplo.heranca.bemfeita;

// � UMA
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
        System.out.println("Pr� processamento");
        String email  = super.getEmail();
        System.out.println("P�s processamento");
        return email;
    }
}
