import br.com.alura.screenmatch.calculo.Calculadora;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme novoFilme = new Filme();

        novoFilme.setNome("O Poderoso chefão");
        novoFilme.setAnoDeLancamento(1970);
        novoFilme.setDuracaoEmMinutos(180);

        novoFilme.exibeFichaTecninca();
        novoFilme.avalia(5);
        novoFilme.avalia(8);
        novoFilme.avalia(10);


        System.out.println("Média do filme: " + novoFilme.pegaMedia());
        System.out.println("Total de avaliação: " + novoFilme.getTotalDeAvalicao());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
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
        novoEpisodio.setTotalVisualizacao(103z);

        FiltroRecomendacao novoFilto = new FiltroRecomendacao();
        novoFilto.filrar(novoEpisodio);
        novoFilto.filrar(novoFilme);
    }
}
