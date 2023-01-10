public class TesteMoto {

    public static void main(String[] args) {

        // usando o set, se torna verboso
        Moto moto1 = new Moto();
        moto1.setMarca("HONDA"); // baixo acoplamento
        moto1.setModelo("CB1000");
        moto1.setCor("Verde");
        moto1.setEscapamento("Esportivo");
        moto1.setPlaca("TYH-2545");
        moto1.setVelocidadeMaxima(200);
        moto1.setPreco(40_000.00);

        System.out.println(moto1);
        System.out.println(moto1.getPlaca());
        System.out.println(moto1.getCor());

        // usando o construtor
        // 1 - dificuldade no preenchimento
        // 2 - respeitar a ordem dos tipos
        // 3 - temos memoria curta, acabamos esqucendo a que se refere cada valor informado
        Moto moto2 = new Moto("Verde", "Yamawha", 500, "BBB-0878", "CRB500", "Tunado", 20_000.00, 500);

        // Design Pattern -> Builder (faz parte do grupo dos padrões Criacionais)
        // 1 - dificuldade no preenchimento -> X
        // 2 - respeitar a ordem dos tipos -> X
        // 3 - temos memoria curta, acabamos esqucendo a que se refere cada valor informado -> X
        // 4 - usando o set, se torna verboso -> X
        Moto moto3 = new MotoBuilder()
                .escapamento("Tunado")
                .preco(20_000.00)
                .marca("CBR500")
                .velocidadeMaxima(500)
                .cor("Verde")
                .cilindrada(500)
                .placa("RRR-8575")
                .modelo("Yamawha")
                .build();

        System.out.println(moto3);
    }

}
