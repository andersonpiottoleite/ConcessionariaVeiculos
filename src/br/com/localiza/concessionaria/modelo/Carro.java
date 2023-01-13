package br.com.localiza.concessionaria.modelo;


import br.com.localiza.concessionaria.enumerador.EnumMarca;

// private - só permite que construtores, ou metodos, e atributos sejam acessados na mesma classe
// default (sem modificador declarado) - só permite que classes, construtores, ou metodos e atributos, sejam acessados no mesmo pacote
// public - permite que classes, construtores, ou metodos e atributos, sejam acessados em qualquer pacote
// classes no pacote default (mesmo se as classes foram publicas), não podem ser acessadas fora do pacote default
public class Carro {

    // atributos é o que uma classe TEM:

    private static int quantidadeCarroCriados;
    private String motor;
    private int numeroDeRodas;
    private int anoDeFabricao;
    private String cor;

    private EnumMarca marca;

    private String modelo;
    private String estiloDeCombustivel;
    private double preco;
    private int aroRoda;
    private String dono;
    private int velocidadeMaxima;

    private int velocidadeAtual;

    public Carro(){
        atualizarQuantidadeCarroCriados();
    }
    public Carro(EnumMarca marca){ // construtor de classe]
        atualizarQuantidadeCarroCriados();
        this.marca = marca; // sombreamento
    }

    private void atualizarQuantidadeCarroCriados(){
        quantidadeCarroCriados ++;
    }

    public int getQuantidadeCarroCriados() {
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

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAnoDeFabricao() {
        return anoDeFabricao;
    }

    public void setAnoDeFabricao(int anoDeFabricao) {
        this.anoDeFabricao = anoDeFabricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public EnumMarca getMarca() {
        return marca;
    }

    public void setMarca(EnumMarca marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getEstiloDeCombustivel() {
        return estiloDeCombustivel;
    }

    public void setEstiloDeCombustivel(String estiloDeCombustivel) {
        this.estiloDeCombustivel = estiloDeCombustivel;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAroRoda() {
        return aroRoda;
    }

    public void setAroRoda(int aroRoda) {
        this.aroRoda = aroRoda;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
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
}
