public class ProdutoImportado extends Produto {
    private double taxa;
    private double taxaImportacao;

    public ProdutoImportado(String descricao, double valorBase){
        super(descricao, valorBase);
        this.imposto = valorBase * 0.10;          // imposto estadual
        this.taxa = valorBase * 0.05;             // taxa nacional
        this.taxaImportacao = valorBase * 0.05;   // taxa de importação
    }

    public double calcularValorFinal(){
        return valorBase + imposto + taxa + taxaImportacao;
    }
    public void exibirRelatorio() {
        System.out.println("\n=== Produto Importado ===");
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor Base: R$ " + valorBase);
        System.out.println("Imposto Estadual (10%): R$ " + imposto);
        System.out.println("Taxa Nacional (5%): R$ " + taxa);
        System.out.println("Taxa de Importação (5%): R$ " + taxaImportacao);
        System.out.println("Valor Final: R$ " + calcularValorFinal());
    }
}
