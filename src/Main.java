import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<ProdutoEstadual> produtosEstaduais = new ArrayList<>();
        List<ProdutoNacional> produtosNacionais = new ArrayList<>();
        List<ProdutoImportado> produtosImportados = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 – Cadastrar Produto Estadual");
            System.out.println("2 – Cadastrar Produto Nacional");
            System.out.println("3 – Cadastrar Produto Importado");
            System.out.println("4 – Exibir Produtos Estaduais");
            System.out.println("5 – Exibir Produtos Nacionais");
            System.out.println("6 – Exibir Produtos Importados");
            System.out.println("7 – Exibir Todos os Produtos");
            System.out.println("9 – SAIR");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Descrição: ");
                    String descE = sc.nextLine();
                    System.out.print("Valor base: ");
                    double valorE = sc.nextDouble();
                    produtosEstaduais.add(new ProdutoEstadual(descE, valorE));
                    System.out.println("Produto Estadual cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.print("Descrição: ");
                    String descN = sc.nextLine();
                    System.out.print("Valor base: ");
                    double valorN = sc.nextDouble();
                    produtosNacionais.add(new ProdutoNacional(descN, valorN));
                    System.out.println("Produto Nacional cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.print("Descrição: ");
                    String descI = sc.nextLine();
                    System.out.print("Valor base: ");
                    double valorI = sc.nextDouble();
                    produtosImportados.add(new ProdutoImportado(descI, valorI));
                    System.out.println("Produto Importado cadastrado com sucesso!");
                    break;

                case 4:
                    if (produtosEstaduais.isEmpty()) System.out.println("Nenhum produto estadual cadastrado.");
                    else produtosEstaduais.forEach(ProdutoEstadual::exibirRelatorio);
                    break;

                case 5:
                    if (produtosNacionais.isEmpty()) System.out.println("Nenhum produto nacional cadastrado.");
                    else produtosNacionais.forEach(ProdutoNacional::exibirRelatorio);
                    break;

                case 6:
                    if (produtosImportados.isEmpty()) System.out.println("Nenhum produto importado cadastrado.");
                    else produtosImportados.forEach(ProdutoImportado::exibirRelatorio);
                    break;

                case 7:
                    System.out.println("\n=== TODOS OS PRODUTOS ===");
                    produtosEstaduais.forEach(ProdutoEstadual::exibirRelatorio);
                    produtosNacionais.forEach(ProdutoNacional::exibirRelatorio);
                    produtosImportados.forEach(ProdutoImportado::exibirRelatorio);
                    break;

                case 9:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 9);

        sc.close();
    }
}
