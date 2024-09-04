package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;
import br.com.alura.minhasmusicas.modelos.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Mas altas que bajadas");
        musica.setArtista("Natanael cano");

        for (int i = 0; i < 1000 ; i++) {
            musica.repoducao();
        }
        for (int i = 0; i < 50 ; i++) {
            musica.curte();
        }

        Podcast podcast = new Podcast();
        podcast.setTitulo("Flow Podcast");
        podcast.setHost("Igor 3k");

        for (int i = 0; i < 1000 ; i++) {
            podcast.repoducao();
        }

        for (int i = 0; i < 100; i++) {
            podcast.curte();
        }

        Preferidas preferidas = new Preferidas();

        preferidas.inclui(podcast);
        preferidas.inclui(musica);


    }
}
