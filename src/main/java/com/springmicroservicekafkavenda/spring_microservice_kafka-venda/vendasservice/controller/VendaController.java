package com.springmicroservicekafka.spring_microservice_kafka.vendasservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/venda")
public class VendaController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/venda")
    public String registrarVenda(@RequestBody String venda) {
        kafkaTemplate.send("SEU_TOPICO_AQUI", venda);
        return "Venda registrada com sucesso!";
    }
}
