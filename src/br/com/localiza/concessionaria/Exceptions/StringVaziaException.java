package br.com.localiza.concessionaria.Exceptions;

// n�o checada, � filha de RuntimeException, unchecked
// checada, dever ser filha de Exception, checked
public class StringVaziaException extends RuntimeException{

    public StringVaziaException(String msg){
        super(msg);
    }
}
