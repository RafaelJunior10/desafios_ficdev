/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.capitulo16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ola")
@SpringBootApplication
public class OlaResourse {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public String ola() {
        return "{\"message\": \"Olá, seja bem-vindo!\"}";
    }

    public static void main(String[] args) {
        SpringApplication.run(OlaResourse.class, args);
    }
}
