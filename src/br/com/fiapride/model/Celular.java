package br.com.fiapride.model;

public class Celular {
    private String marca;
    private int bateria;
    private boolean ligado;

    public Celular(String marca, int bateria) {
        this.setMarca(marca);
        this.setBateria(bateria);
        this.setLigado(false);
    }

    public void statusCelular() {
        if (ligado && bateria > 0) {
            System.out.println("----- STATUS -----");
            System.out.println("Marca: " + this.marca);
            System.out.println("Bateria atual: " + this.bateria + "%");
            System.out.println("------------------");
        } else {
            System.out.println("Celular desligado ou sem bateria");
        }
    }

    public void ligar() {

        if (ligado) {
            System.out.println("Celular já está ligado");
            return;
        }

        if (bateria > 0) {
            this.ligado = true;
            this.bateria -= 20;
            System.out.println("Celular ligado");
        } else {
            System.out.println("Celular sem bateria");
        }
    }

    public void desligar() {

        if (!ligado) {
            System.out.println("Celular já está desligado");
            return;
        }

        this.ligado = false;
        System.out.println("Celular desligado");
    }

    public void carregarCelular(int valor) {

        if (valor > 0 && bateria + valor <= 100) {
            this.bateria += valor;
            System.out.println("Você carregou seu celular!");
        } else {
            System.out.println("Valor inválido");
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {

        if (marca != null && !marca.isEmpty()) {
            this.marca = marca;
        } else {
            System.out.println("Marca inválida");
        }
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {

        if (bateria >= 0 && bateria <= 100) {
            this.bateria = bateria;
        } else {
            System.out.println("Bateria inválida");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
}
