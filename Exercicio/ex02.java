import java.util.Scanner;

import Modelos.Automovel;

public class ex02 {


    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância total percorrida (em km): ");
        double distanciaPercorrida = scanner.nextDouble();

        System.out.print("Digite o total de combustível gasto (em litros): ");
        double combustivelGasto = scanner.nextDouble();

        Automovel automovel = new Automovel(distanciaPercorrida, combustivelGasto);

       
        double consumoMedio = automovel.calcularConsumoMedio();

        System.out.println("O consumo médio do automóvel é: " + consumoMedio + " km/l");

        scanner.close();
    }
}


