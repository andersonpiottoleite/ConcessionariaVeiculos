package br.com.localiza.concessionaria.util;

import java.util.Objects;
import java.util.Scanner;

public class ValidadorRenavam {
    public static boolean validaRenavam(String renavam){
        if (Objects.isNull(renavam) || renavam.isEmpty()){
            return false;
        }
        return true;
    }
}
