package br.com.alura.principal;

import br.com.alura.screenmath.modelos.Filme;
import br.com.alura.screenmath.modelos.Serie;
import br.com.alura.screenmath.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        Filme outroFilme = new Filme("Avatar", 2023);
        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        filmeDoPaulo.avalia(10);
        lista.add(outroFilme);
        outroFilme.avalia(8);
        lista.add(meuFilme);
        meuFilme.avalia(6);
        lista.add(lost);
        for (Titulo titulo : lista) {
            System.out.println(titulo.getNome());
            if(titulo instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
            Collections.sort(lista);
            System.out.println(lista);
            lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
            System.out.println("Ordenando por ano");
            System.out.println(lista);
        }
    }
}
