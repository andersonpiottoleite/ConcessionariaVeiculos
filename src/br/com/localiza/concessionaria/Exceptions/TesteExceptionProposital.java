package br.com.localiza.concessionaria.Exceptions;

import java.util.Scanner;

public class TesteExceptionProposital {

    public static void main(String[] args) {
       /* System.out.println("inicio da execu��o do programa");
        Scanner scanner = new Scanner(System.in);
        try {
            int valor = scanner.nextInt();
            int valor2 = scanner.nextInt();
            int vaiDaRuim = valor / valor2;

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Ocorreu um erro");
        } finally {
            System.out.println("Sempre caia aqui e fa�a algo indispensavel, " +
                    "independente se houve erro ou n�o");
            scanner.close();
        }
        System.out.println("fim da execu��o do programa");

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
            //throw  new IllegalArgumentException("String vazia, n�o � permitido");
            throw new StringVaziaException("String vazia, n�o � permitido");
        }
    }
}
