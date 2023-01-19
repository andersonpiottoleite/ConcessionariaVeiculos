package br.com.localiza.concessionaria.modelo;

public abstract class Veiculo{

    public Veiculo(String cor){
        System.out.println("Chamando o  construtor da classe Veiculo");
        this.cor = cor;
    }

    public Veiculo(){
        System.out.println("Chamando o construtor sem param da classe Veiculo");
    }

    protected String cor;

    protected String modelo;

    protected String placa ;

    protected String motor;

    protected int anoDeFabricao;

    protected int velocidadeMaxima;

    protected double preco;

    protected String chassi;

    protected String renavam;

    protected String estiloDeCombustivel;

    protected int aroRoda;

    protected String dono;

    protected abstract String getTipoCambio();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMotor() {
        System.out.println("Chamando de veiculo");
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }


    /** Metodo para obter a placa da moto
     *
     * @return String placa - uma placa do tipo String
     */
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnoDeFabricao() {
        return anoDeFabricao;
    }

    public void setAnoDeFabricao(int anoDeFabricao) {
        this.anoDeFabricao = anoDeFabricao;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getEstiloDeCombustivel() {
        return estiloDeCombustivel;
    }

    public void setEstiloDeCombustivel(String estiloDeCombustivel) {
        this.estiloDeCombustivel = estiloDeCombustivel;
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
}
