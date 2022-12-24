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

    void acelerar(int aumentoDeVelocidade){
        int i = velocidadeAtual + aumentoDeVelocidade;
    }

    // metodos, é o que toda classe FAZ
    int obterVelocidadeMaxima(){
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
