package br.com.localiza.concessionaria.Exceptions;

import java.util.Scanner;

public class TesteExceptionProposital {

    public static void main(String[] args) {
       /* System.out.println("inicio da execução do programa");
        Scanner scanner = new Scanner(System.in);
        try {
            int valor = scanner.nextInt();
            int valor2 = scanner.nextInt();
            int vaiDaRuim = valor / valor2;

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Sempre caia aqui e faça algo indispensavel, " +
                    "independente se houve erro ou não");
            scanner.close();
        }
        System.out.println("fim da execução do programa");

        try(Scanner scanner2 = new Scanner(System.in)){ //a partir do java 7
            int valor = scanner.nextInt();
            int valor2 = scanner.nextInt();
            int vaiDaRuim = valor / valor2;
        } catch (Exception e){
            e.printStackTrace();
        }*/

            metodo("");
    }

    private static void metodo (String s) {
        if (s.isEmpty()){
            //throw  new IllegalArgumentException("String vazia, não é permitido");
            throw new StringVaziaException("String vazia, não é permitido");
        }
    }
}
