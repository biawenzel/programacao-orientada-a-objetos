package exEstruturaBasica;

/* Exercicio da aula 3 de Orientação a Objetos:
 crie a classe Carro, defina 3 atributos (cor, modelo e capacidade
 do tanque, crie construtor, set, get, objetos e mensagens */

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;

    Carro() {
        //construtor vazio
    }

    Carro(String cor, String modelo, int capacidadeTanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getCor() {
        return cor;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    Double totalValorTanque(Double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }
}
