/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package capitulo09;

/**
 * Projeto Javadoc - Descrição do projeto.
 *
 * Utilizamos cookies para fornecer uma melhor experiência para nossos usuários, consulte nossa política de privacidade.
 */
public class ProjetoJavadoc {
      private String matricula;
    private Double salario;

    /**
     * Obtém o número da matrícula.
     *
     * @return String - Número da Matrícula
     */
    public String getMatricula() {
        return this.matricula;
    }

    /**
     * Obtém o salário do funcionário.
     *
     * @return Double - Valor do Salário
     */
    public Double getSalario() {
        return this.salario;
    }

    /**
     * Calcula a ajuda de custo diária com base no salário do funcionário e no número de dias de viagem.
     *
     * @param diasViagem         int - Número total de dias de viagem.
     * @param valorDeslocamento  Double - Valor pago em cada diária.
     * @return Double - Valor da diária de ajuda de custo.
     */
    public Double calculaAjudaCusto(int diasViagem, Double valorDeslocamento) {
        try {
            return this.salario / 30 * diasViagem + valorDeslocamento;
        } catch (ArithmeticException ae) {
            return 0.0;
        }
    }

    /**
     * Calcula o valor da bonificação baseado no valor total das vendas do mês.
     * Se o valor das vendas for menor que 25.000,00, a comissão será de 5%, caso contrário será de 10%.
     *
     * @param valorVendas  Double - Valor total das vendas do mês.
     * @return Double - Valor do resultado do cálculo conforme a faixa de comissão.
     */
    public Double calculaBonificacao(Double valorVendas) {
        if (valorVendas < 25000.00) {
            return this.salario * 0.05;
        } else {
            return this.salario * 0.10;
        }
    }
}
