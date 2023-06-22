/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class Desafio09 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/test.txt"));
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Erro de leitura do arquivo.");
        }
    }

    // Método para ler um arquivo e retornar seu conteúdo como uma string
    public static String lerArquivo(String nomeArquivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(nomeArquivo));
        StringBuilder sb = new StringBuilder();
        String linha;
        while ((linha = br.readLine()) != null) {
            sb.append(linha);
            sb.append("\n");
        }
        br.close();
        return sb.toString();
    }

    // Método para verificar se um arquivo existe
    public static boolean arquivoExiste(String nomeArquivo) {
        try {
            FileReader fileReader = new FileReader(nomeArquivo);
            fileReader.close();
            return true;
        } catch (FileNotFoundException e) {
            return false;
        } catch (IOException e) {
            return false;
        }
    }
}
