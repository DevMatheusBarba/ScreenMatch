package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelo.Titulo;

public class Calculadora {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo t) {
        tempoTotal += t.getDuracaoEmMinutos();

    }
}
