
    public class ProdutoNacional extends Produto{
        private double taxa;

        public ProdutoNacional(String descricao,double valorBase){
            super(descricao, valorBase);
            this.imposto = valorBase * 0.10; // imposto estadual
            this.taxa = valorBase * 0.05;  // taxa nacional
        }

        public double calcularValorFinal(){
            return valorBase + imposto + taxa;
        }
        public void exibirRelatorio() {
            System.out.println("\n=== Produto Nacional ===");
            System.out.println("Descrição: " + descricao);
            System.out.println("Valor Base: R$ " + valorBase);
            System.out.println("Imposto Estadual (10%): R$ " + imposto);
            System.out.println("Taxa Nacional (5%): R$ " + taxa);
            System.out.println("Valor Final: R$ " + calcularValorFinal());
        }

    }

