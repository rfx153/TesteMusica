package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args){
        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Forever");
        minhamusica.setCantor("kiss");
        for (int i = 0; i < 1000; i++){
            minhamusica.reproduzir();
        }

        for (int i =0; i<50; i++){
            minhamusica.curtir();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcus Mendes");

        for (int i =0; i<5000; i++){
            meuPodcast.reproduzir();
        }
        for (int i = 0; i<1000; i++){
            meuPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(minhamusica);
        preferidas.inclui(meuPodcast);
    }

}
