package br.com.teste.projeto_teste.controller;

import br.com.teste.projeto_teste.entity.Entrada;
import br.com.teste.projeto_teste.entity.Media;
import br.com.teste.projeto_teste.entity.Soma;
import br.com.teste.projeto_teste.service.MediaService;
import br.com.teste.projeto_teste.service.SomaService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController()
@RequestMapping("api/soma")
public class somaController {


    @Autowired
    private SomaService somaService;

    @GetMapping()
    private ResponseEntity<Soma> soma(@RequestBody Entrada entrada) {

        try {
            Soma soma = this.somaService.soma(entrada);

            return new ResponseEntity<Soma>(soma, HttpStatus.OK);


        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }


    }


