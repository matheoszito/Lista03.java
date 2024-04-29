package Modelos;


public class Vendedor {
    private String nome;
    private double salarioFixo;
    private double totalVendas;

    // Construtor
    public Vendedor(String nome, double salarioFixo, double totalVendas) {
        this.nome = nome;
        this.salarioFixo = salarioFixo;
        this.totalVendas = totalVendas;
    }

    // Método para calcular o salário final do vendedor
    public double calcularSalarioFinal() {
        double comissao = 0.15 * totalVendas; // 15% de comissão sobre as vendas
        double salarioFinal = salarioFixo + comissao;
        return salarioFinal;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

}
