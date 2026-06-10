package domain;

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private double capacidadeTanqueLT;
    private double qtdCombustivelAtual;

    public Veiculo(String placa, String marca, String modelo, double capacidadeTanque, double qtdCombustivelAtual) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeTanqueLT = capacidadeTanque;
        this.qtdCombustivelAtual = qtdCombustivelAtual;
        if (qtdCombustivelAtual > capacidadeTanque) {
            this.qtdCombustivelAtual = capacidadeTanque;
        }
    }

    public String abastecer(double litros) {
        if (litros <= 0) {
            return  "Quantidade de litros inválida para abastecimento.";
        }
            double resultado = (litros + this.qtdCombustivelAtual) - this.capacidadeTanqueLT;
        if (litros + this.qtdCombustivelAtual > this.capacidadeTanqueLT) {
            this.qtdCombustivelAtual = this.capacidadeTanqueLT;
            return "A capacidade do tanque é de " + this.capacidadeTanqueLT + " litros." + "\n" +
                    "Tanque abastecido até a capacidade máxima." + "\n" +
                    "Abastecido uma quantidade de " + resultado + " litros.";
        }
        this.qtdCombustivelAtual += litros;
        return "Tanque abastecido em " + litros + " litros." + "\n" +
                "Saldo atual do tanque: " + this.qtdCombustivelAtual;
    }

    public boolean viajar(double distanciaKm, double consumoMedioKmPorLitro) {
        double litrosNecessarios = distanciaKm / consumoMedioKmPorLitro; // litros necessários para viagem
        double litrosArredondados = Math.ceil(litrosNecessarios);
        if (litrosArredondados <= this.qtdCombustivelAtual) {
            this.qtdCombustivelAtual -= litrosArredondados;
            return true; // viagem realizada com sucesso
        }
        return false; // combustível insuficiente
    }

    public String exibirInfo() {
        return "-----------------------" + "\n" +
                "Placa: " + getPlaca() + "\n" +
                "Marca: " + getMarca() + "\n" +
                "Modelo: " + getModelo() + "\n" +
                "Capacidade do Tanque: " + getCapacidadeTanqueLT() + " litros." + "\n" +
                "Quantidade de combustível atual: " + getQtdCombustivelAtual() + " litros." + "\n" +
                "-----------------------";
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getCapacidadeTanqueLT() {
        return capacidadeTanqueLT;
    }

    public double getQtdCombustivelAtual() {
        return qtdCombustivelAtual;
    }

}
