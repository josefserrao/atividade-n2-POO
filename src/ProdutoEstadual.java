
    public class ProdutoEstadual extends Produto{

        public ProdutoEstadual(String descricao, double valorBase) {
            super(descricao, valorBase);
            this.imposto = valorBase * 0.10; // 10% de imposto estadual
        }
        public double calcularValorFinal(){
            return valorBase + imposto;
        }

        public void exibirRelatorio(){
            System.out.println("\n=== Produto Estadual ===");
            System.out.println("Descrição: " + descricao);
            System.out.println("Valor Base: R$ " + valorBase);
            System.out.println("Imposto Estadual (10%): R$ " + imposto);
            System.out.println("Valor Final: R$ " + calcularValorFinal());
        }
    }

