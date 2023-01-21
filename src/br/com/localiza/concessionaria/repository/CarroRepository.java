package br.com.localiza.concessionaria.repository;

import br.com.localiza.concessionaria.modelo.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRepository {

    List<Carro> carros = new ArrayList<>();

    public void save(Carro carro){
        carros.add(carro);
    }

    public List<Carro> findAll(){
        return carros;
    }
}
