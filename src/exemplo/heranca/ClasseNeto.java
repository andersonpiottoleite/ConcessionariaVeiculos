package exemplo.heranca;

public class ClasseNeto extends ClassePai2{

    protected String atributoNeto;

    public ClasseNeto(String atributoNeto, String atributoPai, String atributoVovo){
        super(atributoPai, atributoVovo);
        this.atributoNeto = atributoNeto;
    }

    public ClasseNeto(){
    }



    public static class ClasseNetoBuilder{
        private String atributoNeto;
        private String atributoPai;
        private String atributoVovo;

        public ClasseNetoBuilder atributoNeto(String atributoNeto) {
            this.atributoNeto = atributoNeto;
            return this;
        }

        public ClasseNetoBuilder atributoPai(String atributoPai) {
            this.atributoPai = atributoPai;
            return this;
        }

        public ClasseNetoBuilder atributoVovo(String atributoVovo) {
            this.atributoVovo = atributoVovo;
            return this;
        }

        public ClasseNeto build() {
            return new ClasseNeto(atributoNeto, atributoPai, atributoVovo);
        }
    }
}
