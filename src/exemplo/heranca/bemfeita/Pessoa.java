package exemplo.heranca.bemfeita;

public class Pessoa {

    public Pessoa(){
        System.out.println("Passando pelo Construtor de Pessoa");
    }
    public Pessoa(String nome){
        this.nome = nome;
        System.out.println("Passando pelo Construtor com parametros de Pessoa");
    }

    // atributos comuns a todas as classes filhas.
    private String nome;

    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
