package exemplo.contexto.estatico;

public class Classe {

    public String atributo; // não estaticos - > de instancia

    public static String atributoEstatico; // pertence a classe -> significa que todos os objetos,
    // compartilhar/enxergam o mesmo valor

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    public String getAtributoEstatico() {
        return atributoEstatico;
    }

    public void setAtributoEstatico(String atributoEstatico) {
        Classe.atributoEstatico = atributoEstatico;
    }
}
