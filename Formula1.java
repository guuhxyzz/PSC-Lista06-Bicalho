
import java.util.Scanner;

public class Formula1 {

    public static void main(String[] args) {
        String resposta = "sim";
        int numVoltas = 0;
        double velocidadeTotalVoltas = 0.0;
        double voltaMaisLenta = 0.0;
        double voltaMaisRapida = 0.0;
        String nomePilotoVoltaMaisLenta = "";
        String nomePilotoVoltaMaisRapida = "";

        try (Scanner scanner = new Scanner(System.in)) {
            while (resposta.equalsIgnoreCase("sim")) {
                System.out.print("Digite o nome do piloto: ");
                String nome = scanner.next();
                System.out.print("Digite a velocidade da volta do piloto " + nome + ": ");
                double velocidade = scanner.nextDouble();

                voltaMaisLenta = Math.max(voltaMaisLenta, velocidade);

                if (velocidade < voltaMaisLenta) {
                    voltaMaisLenta = velocidade;
                    nomePilotoVoltaMaisLenta = nome;
                }
                if (velocidade > voltaMaisRapida) {
                    voltaMaisRapida = velocidade;
                    nomePilotoVoltaMaisRapida = nome;
                }
                numVoltas++;
                velocidadeTotalVoltas = velocidadeTotalVoltas + velocidade;

                System.out.print("Deseja continuar? [sim/não] ");
                resposta = scanner.next().toLowerCase();
            }
        }
        System.out.printf("""
                Total de voltas: %d
                velocidade total: %.2f
                volta mais lenta: %.2f
                piloto da volta mais lenta: %s
                volta mais rapida: %.2f
                piloto da volta mais rapida: %s
                """,
                numVoltas, velocidadeTotalVoltas, voltaMaisLenta, nomePilotoVoltaMaisLenta, voltaMaisRapida, nomePilotoVoltaMaisRapida);
    }
}
