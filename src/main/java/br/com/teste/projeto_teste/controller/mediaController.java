package br.com.teste.projeto_teste.controller;

import br.com.teste.projeto_teste.entity.Entrada;
import br.com.teste.projeto_teste.entity.Media;
import br.com.teste.projeto_teste.entity.Soma;
import br.com.teste.projeto_teste.service.MediaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController()
@RequestMapping("api/media")
public class mediaController {

    @Autowired
    private MediaService mediaService;


    @GetMapping()
    private ResponseEntity<Media> media(@RequestBody Entrada entrada, Soma soma){

        try {
            Media media = this.mediaService.media(entrada, soma);

            return new ResponseEntity<Media>(media, HttpStatus.OK);

        } catch (Exception e) {
            throw new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}