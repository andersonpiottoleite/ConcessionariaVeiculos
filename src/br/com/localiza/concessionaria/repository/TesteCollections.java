package br.com.localiza.concessionaria.repository;

import java.util.*;

public class TesteCollections {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("palavra1");
        palavras.add("palavra1");
        palavras.add("palavra1");

        palavras.forEach(System.out::println);

        System.out.println("-----------------------------------");

        Set<String> palavrasSet = new HashSet<>();
        palavrasSet.add("palavra1");
        palavrasSet.add("palavra2");
        palavrasSet.add("palavra1");

        palavrasSet.forEach(System.out::println);

        // criar uma lista (sendo um List) aqui add muitas string
        long inicio = System.currentTimeMillis();
        // percorreria essa lista (sendo um List)
        long fim = System.currentTimeMillis();
        System.out.println(fim - inicio);

        // criar uma lista (sendo um Set) aqui add muitas string
        long inicio2 = System.currentTimeMillis();
        // percorreria essa lista (sendo um Set)
        long fim2 = System.currentTimeMillis();
        System.out.println(fim2 - inicio2);

        Map<Integer, String> mapDeString = new HashMap<>();
        mapDeString.put(1, "Texto 1");
        mapDeString.put(2, "Texto 2");
        mapDeString.put(3, "Texto 3");
        System.out.println(mapDeString.get(1));
        System.out.println(mapDeString.get(3));

        System.out.println(mapDeString.size());
        mapDeString.remove(2);
        System.out.println(mapDeString.size());

        System.out.println(mapDeString.get(1));
        mapDeString.replace(1, "Novo Texto 1");
        System.out.println(mapDeString.get(1));

        mapDeString.forEach((k,v) -> System.out.println(k + v)); // Lambda do java 8

        for (Map.Entry<Integer, String> integerStringEntry : mapDeString.entrySet()) {
            System.out.println(integerStringEntry.getKey());
            System.out.println(integerStringEntry.getValue());
        }
    }
}
