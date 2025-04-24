
import java.util.ArrayList;
import java.util.Scanner;

public class Detran {

    public static void main(String[] args) {
        String resp = "s";
        int veiculosMultado = 0;
        ArrayList<Double> veiculos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // Loop para registrar as velocidades
        while (resp.equalsIgnoreCase("s")) {
            System.out.print("Digite a velocidade do veículo: ");
            double velocidade = scanner.nextDouble();
            veiculos.add(velocidade); // Adiciona a velocidade à lista

            if (velocidade > 120) {
                veiculosMultado++;
            }

            System.out.println("A velocidade do veículo é: " + velocidade);
            System.out.print("Deseja colocar a velocidade de mais um veículo? [s/n]: ");
            resp = scanner.next();
        }

        // Exibe o resumo das velocidades
        System.out.println("\nResumo:");
        for (double velocidade : veiculos) {
            if (velocidade > 120) {
                System.out.println("O veículo que passou a " + velocidade + " km/h foi multado.");
            } else {
                System.out.println("O veículo que passou a " + velocidade + " km/h não foi multado.");
            }
        }

        // Exibe o total de veículos e multas
        System.out.println("\nA quantidade de veículos que passaram foi: " + veiculos.size());
        System.out.println("A quantidade de veículos multados foi: " + veiculosMultado);

        scanner.close();
    }
}
