
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Ecommerce {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<String> produtos = new ArrayList<>();
        while (true) {
            System.out.print("""
                    === Menu ===
                    0 - Sair do programa
                    1 - Listar produtos
                    2 - Cadastrar produto
                    3 - Alterar produto
                    4 - Excluir produto
                    """);
            try {
                int menu = scanner.nextInt();
                scanner.nextLine();
                switch (menu) {
                    case 0 -> {
                        System.out.println("Saindo do programa!");
                        return;
                    }

                    case 1 -> {
                        if (produtos.isEmpty()) {
                            System.out.println("Não tem produtos disponíveis");
                        } else {
                            System.out.println("Produtos disponíveis:");
                            for (int i = 0; i < produtos.size(); i++) {
                                System.out.println(i + " - " + produtos.get(i));
                            }
                        }
                    }

                    case 2 -> {
                        System.out.print("Quantos produtos você irá adicionar? ");
                        int addProdutos = scanner.nextInt();
                        for (int i = 0; i <= addProdutos; i++) {
                            System.out.print("Digite o nome do produto: ");
                            String novoProduto = scanner.nextLine();
                            produtos.add(novoProduto);
                        }

                    }

                    case 3 -> {
                        if (produtos.isEmpty()) {
                            System.out.println("Não tem produtos disponíveis para alterar.");
                        } else {
                            System.out.println("Produtos disponíveis:");
                            for (int i = 0; i < produtos.size(); i++) {
                                System.out.println(i + " - " + produtos.get(i));
                            }

                            System.out.print("Digite o índice do produto que deseja alterar: ");
                            int indice = scanner.nextInt();
                            scanner.nextLine();

                            if (indice >= 0 && indice < produtos.size()) {
                                System.out.print("Digite o novo nome do produto: ");
                                String novoNome = scanner.nextLine();
                                produtos.set(indice, novoNome);
                                System.out.println("Produto alterado com sucesso!");
                            } else {
                                System.out.println("Índice inválido.");
                            }
                        }
                    }

                    case 4 -> {
                        if (produtos.isEmpty()) {
                            System.out.println("Não tem produtos disponíveis para excluir.");
                        } else {
                            System.out.println("Produtos disponíveis:");
                            for (int i = 0; i < produtos.size(); i++) {
                                System.out.println(i + " - " + produtos.get(i));
                            }

                            System.out.print("Digite o índice do produto que deseja excluir: ");
                            int indice = scanner.nextInt();
                            scanner.nextLine();

                            if (indice >= 0 && indice < produtos.size()) {
                                produtos.remove(indice);
                            } else {
                                System.out.println("Índice inválido.");
                            }
                        }
                    }

                    default ->
                        System.out.println("Opção não encontrada.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, digite um número.");
                scanner.nextLine();
            }
        }
    }
}
