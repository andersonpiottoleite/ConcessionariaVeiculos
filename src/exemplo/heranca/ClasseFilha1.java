package exemplo.heranca;

import exemplo.heranca.ClassePai;

// filha
// ou
// subclasse
// só devemos fazer herança quando É UM

// é uma classe concreta!

public class ClasseFilha1 extends ClassePai /*herança simples*/{

    public void teste(){
        this.getAtributo1();
        this.getAtributo2();
    }

    @Override // sobrescrita de metodo
    protected void metodo(String atributo2) {

    }
}
