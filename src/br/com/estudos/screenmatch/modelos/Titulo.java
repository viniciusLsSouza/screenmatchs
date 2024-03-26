package br.com.estudos.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicao;
    private int duracaoEmMinutos;

    public int getTotalDeAvalicao() {
        return totalDeAvalicao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void exibeFichaTecnica() {
        System.out.println(nome);
        System.out.println(anoDeLancamento);
        System.out.println(duracaoEmMinutos);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvalicao++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvalicao;
    }
}
