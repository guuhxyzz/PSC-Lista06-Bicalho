
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {
        ArrayList<String> logins = new ArrayList<>();
        ArrayList<String> senhas = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("==CADASTRO===\n");
                System.out.print("Digite seu login: ");
                String login = scanner.nextLine();
                System.out.print("Digite sua senha: ");
                String senha = scanner.nextLine();

                if (logins.contains(login)) {
                    System.out.println("Você não pode usar esse login");
                    continue;
                } else if (login.equalsIgnoreCase(senha)) {
                    System.out.println("Essa senha não é segura, escolha outra");
                    continue;
                } else {
                    logins.add(login);
                    senhas.add(senha);

                    System.out.println("Cadastro realizado com sucesso!");
                }

                System.out.print("Deseja cadastrar outro usuário? (s/n): ");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("n")) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("ERROR: " + e.getMessage());
                scanner.nextLine();
            }
        }
    }
}
