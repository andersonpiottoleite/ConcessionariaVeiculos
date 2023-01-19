package br.com.localiza.concessionaria.modelo;

// nomenclatura padrão para pacotes:
// 1 - br
// 2 - com
// 3 - nome da empresa - localiza
// 4 - nome do projeto - concessionaria
// 5 - nome da subdivisao - modelo

import br.com.localiza.concessionaria.builder.MotoBuilder;
import br.com.localiza.concessionaria.enumerador.EnumMarcaMoto;

/**
 * Essa classe representa uma moto
 *
 * @author Anderson Piotto
 * @since 11/01/2023
 * @version 1.0.0
 * 
 */

//Moto É UM veiculo? Sim -> herança adequada

public class Moto extends Veiculo{
    private int cilindrada;
    private EnumMarcaMoto marca;
    private String escapamento;

    /** Esse construtor privado ajudará na construção do objeto em outro construtores publicos ou default
     *
     * @param cilindrada
     */
    private Moto(int cilindrada){
        this.cilindrada = cilindrada;
    }

    public Moto(){
    }

    public Moto(String cor){
        setCor(cor);
    }
    public Moto(String modelo, EnumMarcaMoto marca){ // sobrecarga de construtores
        setModelo(modelo);
        setMarca(marca);
    }

    private Moto(String renavam, String cor, String modelo, int cilindrada, String placa, EnumMarcaMoto marca, String escapamento, Double preco, int velocidadeMaxima) {
        this.renavam = renavam;
        this.cor = cor;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.placa = placa;
        this.marca = marca;
        this.escapamento = escapamento;
        this.preco = preco;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }


    public void setMarca(EnumMarcaMoto marca) {
        this.marca = marca;
    }

    public void setEscapamento(String escapamento) {
        this.escapamento = escapamento;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public EnumMarcaMoto getMarca() {
        return marca;
    }

    public String getEscapamento() {
        return escapamento;
    }


    @Override
    public String toString() {
        return "br.com.localiza.concessionaria.modelo.Moto{" +
                "renavan='" + renavam + '\'' +
                ", cor='" + cor + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada=" + cilindrada +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", escapamento='" + escapamento + '\'' +
                ", preco=" + preco +
                ", velocidadeMaxima=" + velocidadeMaxima +
                '}';
    }

    @Override
    public String getTipoCambio() {
        return "automatico";
    }


    public static class MotoBuilder {

        private String renavam;
        private String chassi;
        private String cor;
        private String modelo;
        private int cilindrada;
        private String placa ;
        private EnumMarcaMoto marca;
        private String escapamento;
        private Double preco;
        private int velocidadeMaxima;

        public MotoBuilder renavam(String renavam) {
            this.renavam = renavam;
            return this;
        }

        public MotoBuilder chassi(String chassi) {
            this.chassi = chassi;
            return this;
        }

        public MotoBuilder cor(String cor) {
            this.cor = cor;
            return this;
        }

        public MotoBuilder modelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public MotoBuilder cilindrada(int cilindrada) {
            this.cilindrada = cilindrada;
            return this;
        }

        public MotoBuilder placa(String placa) {
            this.placa = placa;
            return this;
        }

        public MotoBuilder marca(EnumMarcaMoto marca) {
            this.marca = marca;
            return this;
        }

        public MotoBuilder escapamento(String escapamento) {
            this.escapamento = escapamento;
            return this;
        }

        public MotoBuilder preco(Double preco) {
            this.preco = preco;
            return this;
        }

        public MotoBuilder velocidadeMaxima(int velocidadeMaxima) {
            this.velocidadeMaxima = velocidadeMaxima;
            return this;
        }

        public Moto build(){
            return new Moto(renavam, cor, modelo, cilindrada, placa, marca, escapamento, preco, velocidadeMaxima);
        }
    }
}
