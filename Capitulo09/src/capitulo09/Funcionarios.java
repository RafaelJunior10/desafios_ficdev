/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
public class Funcionarios {
    private String matricula;
    private Double salario;
    
    /**
     * Método para retorno da matrícula do funcionário.
     * 
     * @return String - Nr da Matrícula
     */
    public String getMatricula() {
        return matricula;
    }
    
    /**
     * Método para retorno do salário do funcionário.
     * 
     * @return Double - Valor do Salário
     */
    public Double getSalario() {
        return salario;
    }
    
    /**
     * Método para cálculo da diária com base no salário do funcionário
     * dividido pelo mês comercial de 30 dias.
     * 
     * @param diasViagem int - Valor total das vendas do mês.
     * @param valorDeslocamento Double - Valor pago em cada diária.
     * @return Double - Valor da diária.
     */
    public Double calculaAjudaCusto(int diasViagem, Double valorDeslocamento) {
        try {
            return salario / 30 * diasViagem + valorDeslocamento;
        } catch (ArithmeticException ae) {
            return 0.0;
        }
    }
    
    /**
     * Método para cálculo do valor da bonificação baseada na seguinte faixa de valores:
     * Para vendas menores de 25.000,00, o percentual de comissão aplicado será de 5%, 
     * e será de 10% para vendas maiores ou iguais a 25.000,00.
     * 
     * @param valorVendas - Valor total das vendas do mês.
     * @return Double - Valor do resultado do cálculo conforme a faixa.
     */
    public Double calculaBonificacao(Double valorVendas) {
        if (valorVendas < 25000.00) {
            return salario * 0.05;
        } else {
            return salario * 0.10;
        }
    }
}