class Moto {

    String cor;

    String modelo;

    int cilindrada;
    String placa ;
    String marca;
    String escapamento;
    Double preco;
    int velocidadeMaxima;

    @Override
    public String toString() {
        return "Moto{" +
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
