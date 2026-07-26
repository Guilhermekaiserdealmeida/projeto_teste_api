package br.com.teste.projeto_teste.service;

import br.com.teste.projeto_teste.entity.Entrada;
import br.com.teste.projeto_teste.entity.Soma;
import org.springframework.stereotype.Service;

@Service
public class SomaService {

    public Soma soma(Entrada entrada){

        Integer somaFinal = 0;
        float mediaFinal = 0;


        for (Integer numeroAtual : entrada.getLista()) {
            somaFinal += numeroAtual;
        }

        mediaFinal = somaFinal/ entrada.getLista().size();

        Soma soma1 = new Soma();
        soma1.setResultado(somaFinal);


        return  soma1;
    }


}
