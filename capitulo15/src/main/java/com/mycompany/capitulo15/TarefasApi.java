/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api/tarefas")
public class TarefasApi {
     private List<String> tarefas = new ArrayList<>();

    @GetMapping
    public List<String> listarTodasTarefas() {
        return tarefas;
    }

    @PostMapping
    public void criarTarefa(@RequestBody String tarefa) {
        tarefas.add(tarefa);
    }

    @DeleteMapping("/{index}")
    public void apagarTarefa(@PathVariable int index) {
        if (index >= 0 && index < tarefas.size()) {
            tarefas.remove(index);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(TarefasApi.class, args);
    }
}
