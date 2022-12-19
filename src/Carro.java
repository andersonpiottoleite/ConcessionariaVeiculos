class Carro {

    String motor;
    int numeroDeRodas;
    int anoDeFabricao;
    String cor;
    String marca;
    String modelo;
    String estiloDeCombustivel;
    double preco;
    int aroRoda;
    String dono;

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
                '}';
    }
}
