package br.com.teste.projeto_teste.service;

import br.com.teste.projeto_teste.entity.Entrada;
import br.com.teste.projeto_teste.entity.Media;
import br.com.teste.projeto_teste.entity.Soma;

public class MediaService {

    Soma soma = new Soma();

    public Media media(Entrada entrada, Soma soma){
        float mediaFinal = 0;
        Integer somaLista = soma.getResultado();

        mediaFinal = (float) somaLista / entrada.getLista().size();


        Media media1 = new Media();
        media1.setResultadoMedia(mediaFinal);

        return media1;


    }
}
