import java.util.Calendar;
import java.util.Objects;

class Carro {

    Carro(){ // default
        desengatar();
    }


    Carro(EnumMarca marca){ // construtor de classe
        desengatar();
        this.marca = marca; // sombreamento
    }

    // atributos é o que uma classe TEM:
    String motor;
    int numeroDeRodas;
    int anoDeFabricao;
    String cor;

    EnumMarca marca;

    String modelo;
    String estiloDeCombustivel;
    double preco;
    int aroRoda;
    String dono;
    int velocidadeMaxima;

    int velocidadeAtual;

    void acelerar(int aumentoDeVelocidade){
        int i = velocidadeAtual + aumentoDeVelocidade;
    }

    // metodos, é o que toda classe FAZ
    int obterVelocidadeMaxima(){
        // logica da minha tarefa/metodo
        return velocidadeMaxima;
    }

    String parseToString(int numero){
        String numeroParseado = String.valueOf(numero);
        // classes wrappers
        //int i = Integer.parseInt(numeroParseado);
        //Integer i2 = Integer.valueOf(1);
        return numeroParseado;
    }

    void ligar(){ // sobrecarga de metodos
        System.out.println("Carro ligado com chave...");
    }

    void ligar(String comandoDeVoz){ // sobrecarga de metodos
        System.out.println("Carro ligado com comando de voz..." + comandoDeVoz);
    }

    void desacelerar(int diminuicaoDeVelocidade){
        //60 = (80 - 20);
        velocidadeAtual -= diminuicaoDeVelocidade;
    }

    void morrer(){
        System.out.println("Faltou gasolina...");
        desacelerar(velocidadeAtual);
        parar();
    }
    void parar(){
        if(velocidadeAtual > 0){
            desacelerar(velocidadeAtual);
        }
        System.out.println("Carro parado!");
    }

    void desengatar(){
        System.out.println("Carro desengatado");
    }

    @Override
    public String toString() {
        return "Carro{" +
                "motor='" + motor + '\'' +
                ", numeroDeRodas=" + numeroDeRodas +
                ", anoDeFabricao=" + anoDeFabricao +
                ", cor='" + cor + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", estiloDeCombustivel='" + estiloDeCombustivel + '\'' +
                ", preco=" + preco +
                ", aroRoda=" + aroRoda +
                ", dono='" + dono + '\'' +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}
