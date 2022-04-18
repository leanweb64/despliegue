package com.example.despliegue.controllers;

import com.example.despliegue.entities.Mensaje;
import com.example.despliegue.repositories.MensajeRepository;
import com.example.despliegue.entities.Mensaje;
import com.example.despliegue.repositories.MensajeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MensajeController {



    private final Logger log = LoggerFactory.getLogger(MensajeController.class);

    MensajeRepository mr;

    public MensajeController(MensajeRepository mr) {
        this.mr = mr;
    }

    @GetMapping("/msg")
    public List<Mensaje> getAll(){

        return mr.findAll();
    }

    @PostMapping("/msg")
    public Mensaje create(@RequestBody Mensaje mensaje){
        return mr.save(mensaje);
    }
}
