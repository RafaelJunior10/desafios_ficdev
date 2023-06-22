/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import capitulo09.Desafio09;
import org.junit.Test;
import static org.junit.Assert.*;

public class Desafio09Test {
    @Test
    public void testLerArquivo() {
        try {
            String conteudo = Desafio09.lerArquivo("test.txt");
            assertEquals("Conteúdo esperado do arquivo", conteudo.trim());
        } catch (Exception e) {
            fail("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    @Test
    public void testArquivoExiste() {
        boolean existe = Desafio09.arquivoExiste("test.txt");
        assertTrue("O arquivo deve existir", existe);

        boolean naoExiste = Desafio09.arquivoExiste("arquivo_inexistente.txt");
        assertFalse("O arquivo não deve existir", naoExiste);
    }
}
