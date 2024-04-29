
import java.util.Scanner;

import Modelos.Aluno;

public class ex01 {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        System.out.print("Digite a nota da primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira prova: ");
        double nota3 = scanner.nextDouble();

        Aluno aluno = new Aluno(nomeAluno, nota1, nota2, nota3);

        System.out.println("Nome do aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());

        scanner.close();
    }
}
