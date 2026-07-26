package br.com.teste.projeto_teste.service;

import br.com.teste.projeto_teste.entity.Entrada;
import br.com.teste.projeto_teste.entity.Media;
import br.com.teste.projeto_teste.entity.Soma;
import org.springframework.stereotype.Service;

@Service
public class MediaService {


    public Media media(Entrada entrada){
        float mediaFinal = 0;
        Integer somaLista = 0;

        for (Integer numeroAtual : entrada.getLista()) {
            somaLista += numeroAtual;
        }
        mediaFinal = (float) somaLista / entrada.getLista().size();


        Media media1 = new Media();
        media1.setResultadoMedia(mediaFinal);

        return media1;


    }
}
