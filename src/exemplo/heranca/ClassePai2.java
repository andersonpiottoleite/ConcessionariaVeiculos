package exemplo.heranca;

public class ClassePai2 extends ClasseVovo{

    protected String atributoPai;

    public ClassePai2(String atributoPai, String atributoVovo){
        super(atributoVovo);
        this.atributoPai = atributoPai;
    }

    public ClassePai2(){
    }

}
