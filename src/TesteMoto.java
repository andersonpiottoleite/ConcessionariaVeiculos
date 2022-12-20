public class TesteMoto {

    public static void main(String[] args) {

        Moto moto1 = new Moto();

        moto1.marca="HONDA";
        moto1.modelo="CB1000";
        moto1.cor="Verde";
        moto1.escapamento="Esportivo";
        moto1.placa="TYH-2545";
        moto1.cilindrada=1000;
        moto1.velocidadeMaxima = 200;
        moto1.preco = 40_000.00;

        System.out.println(moto1);

    }

}
