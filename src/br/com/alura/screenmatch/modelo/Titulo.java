package br.com.alura.screenmatch.modelo;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPLano;
    private double somaDeAvalicao;
    private int totalDeAvalicao;
    private int duracaoEmMinutos;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPLano(boolean incluidoNoPLano) {
        this.incluidoNoPLano = incluidoNoPLano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }



    public int getTotalDeAvalicao (){
        return totalDeAvalicao;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibeFichaTecninca (){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em min: " + duracaoEmMinutos);
    }

    public void avalia(double nota){
        somaDeAvalicao += nota;
        totalDeAvalicao++;
    }

    public double pegaMedia (){
        return somaDeAvalicao / totalDeAvalicao;
    }
}
