package exemplo.heranca;

// Classe Pai
// Classe Mãe
// Super Classe
public class ClassePai {

    private String atributo1;

    private String atributo2;

    protected String getAtributo1() {
        return atributo1;
    }

    protected void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    protected String getAtributo2() {
        return atributo2;
    }

    protected void setAtributo2(String atributo2) {
        this.atributo2 = atributo2;
    }

    public static class TesteFamilia {

        public static void main(String[] args) {
            ClasseFilha1 objetoFilha1 = new ClasseFilha1();
            objetoFilha1.setAtributo1("");

            ClasseFilha2 objetoFilha2 = new ClasseFilha2();
            objetoFilha2.setAtributo2("");

            objetoFilha2.getAtributo2();
        }
    }
}
