package br.com.localiza.concessionaria.modelo;


import br.com.localiza.concessionaria.enumerador.EnumMarcaCarro;

// private - só permite que construtores, ou metodos, e atributos sejam acessados na mesma classe
// default (sem modificador declarado) - só permite que classes, construtores, ou metodos e atributos, sejam acessados no mesmo pacote
// public - permite que classes, construtores, ou metodos e atributos, sejam acessados em qualquer pacote
// classes no pacote default (mesmo se as classes foram publicas), não podem ser acessadas fora do pacote default

//Carro É UM veiculo? Sim -> herança adequada
public class Carro extends Veiculo{

    // atributos é o que uma classe TEM:

    private static int quantidadeCarroCriados;
    private int numeroDeRodas;
    private EnumMarcaCarro marca;
    private int velocidadeAtual;

    public Carro(String cor){
        super(cor);
        System.out.println("Chamando o  construtor da classe filha");
    }

    public Carro(){
        System.out.println("Chamando o construtor sem param da classe filha");
        atualizarQuantidadeCarroCriados();
    }
    public Carro(EnumMarcaCarro marca){ // construtor de classe]
        atualizarQuantidadeCarroCriados();
        this.marca = marca; // sombreamento
    }

    private void atualizarQuantidadeCarroCriados(){
        quantidadeCarroCriados ++;
    }

    public static int getQuantidadeCarroCriados() {
        return quantidadeCarroCriados;
    }

    public void acelerar(int aumentoDeVelocidade){
        int i = velocidadeAtual + aumentoDeVelocidade;
    }

    // metodos, é o que toda classe FAZ
    public int obterVelocidadeMaxima(){
        // logica da minha tarefa/metodo
        return velocidadeMaxima;
    }

    String parseToString(int numero){
        String cpf = String.valueOf(numero);
        // classes wrappers
        validarCpf(cpf);
        return cpf;
    }

    private void validarCpf(String cpf){
        int i = Integer.parseInt(cpf);
        Integer i2 = Integer.valueOf(1);
    }

    public void ligar(){ // sobrecarga de metodos
        System.out.println("br.com.localiza.concessionaria.modelo.Carro ligado com chave...");
    }

    public void ligar(String comandoDeVoz){ // sobrecarga de metodos
        System.out.println("br.com.localiza.concessionaria.modelo.Carro ligado com comando de voz..." + comandoDeVoz);
    }

    public void desacelerar(int diminuicaoDeVelocidade){
        //60 = (80 - 20);
        velocidadeAtual -= diminuicaoDeVelocidade;
    }

    public void morrer(){
        System.out.println("Faltou gasolina...");
        desacelerar(velocidadeAtual);
        parar();
    }
    public void parar(){
        if(velocidadeAtual > 0){
            desacelerar(velocidadeAtual);
        }
        System.out.println("br.com.localiza.concessionaria.modelo.Carro parado!");
    }

    public void desengatar(){
        System.out.println("br.com.localiza.concessionaria.modelo.Carro desengatado");
    }

    // metodo configurador cujo nome padrão é setXXX
    public void setNumeroDeRodas(int numeroDeRodas) {
        if(numeroDeRodas < 4 || numeroDeRodas > 5){
            throw new IllegalArgumentException("Numero de rodas abaixo de 4");
        }
        this.numeroDeRodas = numeroDeRodas;
    }

    // metodo de busca, cujo padrão getXXXX
    public int getNumeroDeRodas() {
        return numeroDeRodas;
    }

    public EnumMarcaCarro getMarca() {
        return marca;
    }

    public void setMarca(EnumMarcaCarro marca) {
        this.marca = marca;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    @Override
    public String toString() {
        return "br.com.localiza.concessionaria.modelo.Carro{" +
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

    @Override // sobrescrito de metodo abstrato
    public String getTipoCambio() {
        return "Manual";
    }

    @Override // sobrescita de metodo
    public String getMotor() {
        System.out.println("Chamando de Carro");
        return super.getMotor();
    }
}
