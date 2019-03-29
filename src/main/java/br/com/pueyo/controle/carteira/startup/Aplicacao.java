package br.com.pueyo.controle.carteira.startup;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication("sacudo")
public class Aplicacao{
    
    public static void main(String[] args) {
        SpringApplication.run(Aplicacao.class, args);
    }

}
