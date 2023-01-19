package br.com.localiza.concessionaria.testes;

import br.com.localiza.concessionaria.enumerador.EnumMarcaCarro;
import br.com.localiza.concessionaria.modelo.Carro;
import br.com.localiza.concessionaria.modelo.Veiculo;
import br.com.localiza.concessionaria.util.ValidadorRenavam;

import java.util.Calendar;

public class TesteCarro {

    public static void save(Carro carro){
        /* salvando o carro no banco, lá muita coisa aocntece
        são validadas muitas regras no banco (Constraints)*/
    }

    public static void main(String[] args) {
        Carro carro1 = new Carro();

        Carro carro2 = new Carro(EnumMarcaCarro.MERCEDES);

        Carro carro3 = new Carro(EnumMarcaCarro.MERCEDES);

        int qtde = carro1.getQuantidadeCarroCriados();

        System.out.println(qtde); // ?

        int qtde2 = Carro.getQuantidadeCarroCriados(); // quando costuma ser usado um metodo static?
        // quando temos:
        //  - static factory method  - metodo de fabrica de objetos
        // - metodos utilitarios

        Calendar instance = Calendar.getInstance();
        //CarroFactory.getInstance(EnumTipoCarro.TUNADO);
        //CarroFactory.getInstance(EnumTipoCarro.ESPORTIVO);

        System.out.println(qtde2);

        carro3.setRenavam("123456789-89");
        ValidadorRenavam.validaRenavam(carro3.getRenavam());
        // seguir o fluxo

        //carro1.numeroDeRodas = -50; // forte acoplamento, a classe br.com.localiza.concessionaria.testes.TesteCarro sabe alem do que deveria saber sobre o carro
//        carro1.setModelo("Sedan");
//        carro1.setCor("Prata");
//        carro1.setNumeroDeRodas(4); // baixo acoplamento
//        carro1.setAroRoda(18);
//        carro1.setAnoDeFabricao(2022);
//        carro1.setDono("Renato Anderson");
//        carro1.setEstiloDeCombustivel("Gasolina");
//        carro1.setMotor("16 Valvulas");
//        carro1.setPreco(370000.00);
//        carro1.setVelocidadeMaxima(220);
//
//        System.out.println(carro1.getNumeroDeRodas());
//
//        System.out.println(carro1.obterVelocidadeMaxima());
//        carro1.ligar();
//        carro1.acelerar(100);
//        System.out.println(carro1);
//
//        carro1.acelerar(20);
//        System.out.println(carro1);
//
//        carro1.desacelerar(50);
//        System.out.println(carro1);
//
//        carro1.morrer();
//        System.out.println(carro1);
//
//        System.out.println("---------------------------------------------------------");
//        for (EnumMarca marca: EnumMarca.values()) {
//            System.out.println(marca);
//        }
//
//        List<EnumMarca> enunsList = new ArrayList<>();
//        enunsList.add(EnumMarca.MERCEDES);
//        enunsList.add(EnumMarca.FIAT);
//
//        for (EnumMarca marca: enunsList) {
//            if (EnumMarca.MERCEDES.equals(marca)){
//                System.out.println("Opa, tenho a marca mercedes que o Renato Anderson vai comprar");
//            }
//        }


        /*br.com.localiza.concessionaria.modelo.Carro carro2 = new br.com.localiza.concessionaria.modelo.Carro();
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

        System.out.println(carro3.getTipoCambio());
        System.out.println(carro3.getMotor());
        // scanner dkpdfgkpod
        Carro carroVerde = new Carro("Verde");
        System.out.println(carroVerde);
    }
}
