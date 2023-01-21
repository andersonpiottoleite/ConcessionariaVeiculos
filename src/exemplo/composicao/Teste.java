package exemplo.composicao;

public class Teste {

    public static void main(String[] args) {
        Impressora3D impressora1 = new Impressora3D();
        impressora1.imprime();

        Impressora2D impressora2 = new Impressora2D();
        impressora2.imprime();
    }
}
