package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.Calculadora;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme novoFilme = new Filme("O Poderoso chefão", 1970);
        novoFilme.setDuracaoEmMinutos(180);

        novoFilme.exibeFichaTecninca();
        novoFilme.avalia(5);
        novoFilme.avalia(8);
        novoFilme.avalia(10);


        System.out.println("Média do filme: " + novoFilme.pegaMedia());
        System.out.println("Total de avaliação: " + novoFilme.getTotalDeAvalicao());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecninca();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

        Calculadora calculadora = new Calculadora();
        calculadora.inclui(novoFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        Episodio novoEpisodio = new Episodio();
        novoEpisodio.setNumero(1);
        novoEpisodio.setSerie(lost);
        novoEpisodio.setTotalVisualizacao(103);

        FiltroRecomendacao novoFilto = new FiltroRecomendacao();
        novoFilto.filrar(novoEpisodio);
        novoFilto.filrar(novoFilme);

        var filmePaulo = new Filme("Dogville", 2003);
        filmePaulo.setDuracaoEmMinutos(200);
        filmePaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(novoFilme);
        listaDeFilmes.add(filmePaulo);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString: " + listaDeFilmes.get(0).toString());
    }
}
