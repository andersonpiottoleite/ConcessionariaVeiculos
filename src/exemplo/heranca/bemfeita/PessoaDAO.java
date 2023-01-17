package exemplo.heranca.bemfeita;

public class PessoaDAO {

    public PessoaFisica findByEmail(PessoaFisica pessoaFisica){
        // metodo filtro que recebe: pessoaFisica.getEmail();
        return new PessoaFisica();
    }
}
