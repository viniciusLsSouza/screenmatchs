package br.com.estudos.screenmatch.calculos;

import br.com.estudos.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f) {
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }


    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();

    }
}
