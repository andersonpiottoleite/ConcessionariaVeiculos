package exemplo.composicao;

public class DadosBasicosPessoa {

    private String email;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "DadosBasicosPessoa{" +
                "email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
