package br.com.alura.screenmatch.calculo;

public class FiltroRecomendacao {

    public void filrar (Classificavel classificavel){
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Está muito bem avaliado");
        }else {
            System.out.println("Assistir depois");
        }
    }
}
