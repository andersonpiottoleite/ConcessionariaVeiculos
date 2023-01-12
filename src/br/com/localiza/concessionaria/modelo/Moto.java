package br.com.localiza.concessionaria.modelo;

// nomenclatura padrão para pacotes:
// 1 - br
// 2 - com
// 3 - nome da empresa - localiza
// 4 - nome do projeto - concessionaria
// 5 - nome da subdivisao - modelo

/**
 * Essa classe representa uma moto
 *
 * @author Anderson Piotto
 * @since 11/01/2023
 * @version 1.0.0
 */

class Moto {

    /** Esse construtor privado ajudará na construção do objeto em outro construtores publicos ou default
     *
     * @param cilindrada
     */
    private Moto(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public Moto(){
        this(200);
    }
    public Moto(String cor){
        setCor(cor);
    }
    public Moto(String modelo, String marca){ // sobrecarga de construtores
        setModelo(modelo);
        setMarca(marca);
    }

    public Moto(String cor, String modelo, int cilindrada, String placa, String marca, String escapamento, Double preco, int velocidadeMaxima) {
        this.cor = cor;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.placa = placa;
        this.marca = marca;
        this.escapamento = escapamento;
        this.preco = preco;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    private String cor;

    private String modelo;

    private int cilindrada;
    private String placa ;
    private String marca;
    private String escapamento;
    private Double preco;
    private int velocidadeMaxima;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setEscapamento(String escapamento) {
        this.escapamento = escapamento;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    /** Metodo para obter a placa da moto
     *
     * @return String placa - uma placa do tipo String
     */
    public String getPlaca() {
        return this.placa;
    }

    public String getCor() {
        return this.cor;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public String getEscapamento() {
        return escapamento;
    }

    public Double getPreco() {
        return preco;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    @Override
    public String toString() {
        return "br.com.localiza.concessionaria.modelo.Moto{" +
                "cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada=" + cilindrada +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", escapamento='" + escapamento + '\'' +
                ", preco=" + preco +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }


}
