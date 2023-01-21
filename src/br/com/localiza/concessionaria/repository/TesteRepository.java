package br.com.localiza.concessionaria.repository;

import br.com.localiza.concessionaria.modelo.Carro;

import java.util.List;

public class TesteRepository {

    private static List<Carro> carros = null;

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        CarroRepository carroRepository = new CarroRepository();

        carroRepository.save(carro1);
        carroRepository.save(carro2);
        carroRepository.save(carro3);

        List<Carro> carros = carroRepository.findAll();

        for (Carro carro :carros) {
            System.out.println(carro);
        }

        System.out.println(carros.size());

        for (int i = 0; i < 100; i++) {
            carroRepository.save(new Carro());
        }

        System.out.println(carros.size());

        Carro carro = carros.get(32);
        System.out.println("Carro 33" + carro);

        carros.remove(32);

        System.out.println(carros.size());

        System.out.println(carros.isEmpty());

        //carros.clear();
        Object[] objects = carros.toArray();

        System.out.println(objects.length);

        getBy("Verde", "Corsa");
    }

    private static Carro getBy(String cor, String modelo){
        for (Carro c :carros) {
            if (cor.equals(c.getCor()) && modelo.equals(c.getModelo()))
                return c;
        }
        return null;
    }
}
