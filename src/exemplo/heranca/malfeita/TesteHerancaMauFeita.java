package exemplo.heranca.malfeita;

public class TesteHerancaMauFeita {

    public static void main(String[] args) {
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Jos�");

        // pessoa late ou balan�a Rabo? N�o! Isso � resultado de heran�a mau feita
        pj.latir();
        pj.balancarRabo();
    }
}
