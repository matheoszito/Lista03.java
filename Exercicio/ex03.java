import java.util.Scanner;

import Modelos.Vendedor;

public class ex03{

public static void executar() {
    Scanner scanner = new Scanner(System.in);

    // Obtenção dos dados do vendedor
    System.out.print("Digite o nome do vendedor: ");
    String nome = scanner.nextLine();

    System.out.print("Digite o salário fixo do vendedor: ");
    double salarioFixo = scanner.nextDouble();

    System.out.print("Digite o total de vendas efetuadas no mês (em dinheiro): ");
    double totalVendas = scanner.nextDouble();

    // Criando uma instância de Vendedor
    Vendedor vendedor = new Vendedor(nome, salarioFixo, totalVendas);

    // Calculando o salário final do vendedor
    double salarioFinal = vendedor.calcularSalarioFinal();

    // Exibindo os resultados
    System.out.println("\nInformações do Vendedor:");
    System.out.println("Nome: " + vendedor.getNome());
    System.out.println("Salário Fixo: R$" + vendedor.getSalarioFixo());
    System.out.println("Total de Vendas: R$" + vendedor.getTotalVendas());
    System.out.println("Salário Final: R$" + salarioFinal);

    scanner.close();
}

}