package exemplo.heranca;

import exemplo.heranca.ClassePai;

// filha
// ou
// subclasse
// s� devemos fazer heran�a quando � UM

// � uma classe concreta!

public class ClasseFilha1 extends ClassePai /*heran�a simples*/{

    public void teste(){
        this.getAtributo1();
        this.getAtributo2();
    }

    @Override // sobrescrita de metodo
    protected void metodo(String atributo2) {

    }
}
