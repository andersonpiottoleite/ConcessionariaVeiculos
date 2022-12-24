import java.util.Calendar;
import java.util.Locale;

public class TesteCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro(EnumMarca.MERCEDES);

        carro1.setModelo("Sedan");
        carro1.setCor("Prata");
        carro1.setNumeroDeRodas(4);
        carro1.setAroRoda(18);
        carro1.setAnoDeFabricao(2022);
        carro1.setDono("Renato Anderson");
        carro1.setEstiloDeCombustivel("Gasolina");
        carro1.setMotor("16 Valvulas");
        carro1.setPreco(370000.00);
        carro1.setVelocidadeMaxima(220);

        System.out.println(carro1.getNumeroDeRodas());

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

        /*Locale local = new Locale("en-US");
        Calendar instance = Calendar.getInstance(local);
        System.out.println(instance);
        System.out.println(instance.getTime());*/
    }
}
