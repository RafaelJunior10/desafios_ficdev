/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.capitulo15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIWeb {
     public static void main(String[] args) {
        try {
            URL url = new URL("https://api.example.com/endpoint");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String linha;
            StringBuilder resposta = new StringBuilder();
            while ((linha = reader.readLine()) != null) {
                resposta.append(linha);
            }
            reader.close();

            System.out.println(resposta.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
