package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private double duracao;
    private int totalReproducoes;
    private int totalCurtidas;
    private int classificao;

    public void curtir(){
        this.totalCurtidas++;
    }
    public void reproduzir(){
        this.totalReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificao() {
        return classificao;
    }
}
