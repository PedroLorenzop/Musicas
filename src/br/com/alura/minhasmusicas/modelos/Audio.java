package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalRepoducao;
    private int curtidas;
    private int classificacao;
    private double duracao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getTotalRepoducao() {
        return totalRepoducao;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curte(){
        this.curtidas++;
    }

    public void repoducao(){
        this.totalRepoducao++;
    }
}
