public class TesteCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro(EnumMarca.MERCEDES);
        carro1.modelo = "Sedan";
        carro1.cor = "Prata";
        carro1.numeroDeRodas = 5;
        carro1.aroRoda = 18;
        carro1.anoDeFabricao = 2022;
        carro1.dono = "Renato Anderson";
        carro1.estiloDeCombustivel = "Gasolina";
        carro1.motor = "Mercedes Bens 204 Cavalos";
        carro1.preco = 370000.00;
        carro1.velocidadeMaxima = 220;

        System.out.println(carro1.obterVelocidadeMaxima());
        carro1.ligar();
        carro1.acelerar(100);
        System.out.println(carro1);

        carro1.acelerar(20);
        System.out.println(carro1);

        carro1.desacelerar(50);
        System.out.println(carro1);

        carro1.morrer();
        System.out.println(carro1);

        /*Carro carro2 = new Carro();
        carro2.marca = "FIAT";
        carro2.modelo = "UNO";
        carro2.cor = "AZUL";
        carro2.numeroDeRodas = 5;
        carro2.aroRoda = 18;
        carro2.anoDeFabricao = 1995;
        carro2.dono = "Anderson";
        carro2.estiloDeCombustivel = "Gasolina";
        carro2.motor = "8 valvulas";
        carro2.preco = 5000.00;

        System.out.println(carro2);*/
    }
}
