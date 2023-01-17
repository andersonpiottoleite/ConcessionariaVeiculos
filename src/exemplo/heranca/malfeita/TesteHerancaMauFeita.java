package exemplo.heranca.malfeita;

public class TesteHerancaMauFeita {

    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("José");

        // pessoa late ou balança Rabo? Não! Isso é resultado de herança mau feita
        pj.latir();
        pj.balancarRabo();
    }
}
