package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

import java.util.ArrayList;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme novoFilme = new Filme("O Poderoso chefão", 1970);
        novoFilme.avalia(10);
        var filmePaulo = new Filme("Dogville", 2003);
        filmePaulo.avalia(5);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(novoFilme);
        listaDeAssistidos.add(filmePaulo);
        listaDeAssistidos.add(lost);

        for (Titulo item : listaDeAssistidos){
            System.out.println(item.getNome());
            if (item instanceof Filme filme ){
                System.out.println(filme.getClassificacao());
            }

        }

    }
}
