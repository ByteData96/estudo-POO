package br.com.principal;

import br.com.alura.screenmacth.modelos.Filme;
import br.com.alura.screenmacth.modelos.Serie;
import br.com.alura.screenmacth.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville",2003);
        filmeDoPaulo.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item);
            if (item instanceof Filme filme) {
                System.out.println("Classificaçao: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscarPorArtista = new ArrayList<>();
        buscarPorArtista.add("Adam sendler");
        buscarPorArtista.add("Paulo");
        buscarPorArtista.add("Marcos");

        System.out.println(buscarPorArtista);
        Collections.sort(buscarPorArtista);
        System.out.println(buscarPorArtista);
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordedando por ano: \n" + lista);


    }
}
