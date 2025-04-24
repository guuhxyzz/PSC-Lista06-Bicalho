
import java.util.Random;
import java.util.Scanner;

public class Bolinhas {

    public static void main(String[] args) {
        Random random = new Random();
        int bolinhas = random.nextInt(100);
        int erros = 0, tentativas = 0;

        Scanner scanner = new Scanner(System.in);
        String resp = "s";
        while (resp.equalsIgnoreCase("s")) {
            System.out.print("Adivinhe o número de bolinhas de gude que estão no pote de vidro: ");
            int qntdBolinha = scanner.nextInt();

            if (qntdBolinha == bolinhas) {
                System.out.println("Parabéns, você acertou!");
                break;
            } else if (qntdBolinha < bolinhas) {
                System.out.println("Você errou! Exissstem mais bolinhas do que você digitou!");
                erros++;
            } else {
                System.out.println("Você errou! Existem menos bolinhas do que você digitou!");
                erros++;
            }
            tentativas++;

            System.out.println("Deseja continuar? [s/n]");
            resp = scanner.next().toLowerCase();
        }
    }
}
