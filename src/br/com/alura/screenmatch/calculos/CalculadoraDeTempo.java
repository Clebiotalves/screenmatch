package br.com.alura.screenmatch.calculos;
import br.com.alura.screenmath.modelos.Filme;
import br.com.alura.screenmath.modelos.Serie;
import br.com.alura.screenmath.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//    public void inclui(Filme f){
//        tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
