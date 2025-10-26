
public abstract class Produto {
protected String descricao;
protected double valorBase;
protected double imposto;

public Produto(String descricao, double valorBase) {
   this.descricao = descricao;
   this.valorBase = valorBase;
}

public abstract double calcularValorFinal();

public abstract void exibirRelatorio();

public String getDescricao(){
    return descricao;
}

public double getValorbase(){
    return valorBase;
}
public double getImposto(){
    return imposto;
}

}