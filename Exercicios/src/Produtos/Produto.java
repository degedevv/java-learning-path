package Produtos;

public class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public Produto setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public double getPreco() {
        return preco;
    }

    public Produto setPreco(double preco) {
        this.preco = preco;
        return this;
    }

    public int getEstoque() {
        return estoque;
    }

    public Produto setEstoque(int estoque) {
        if (estoque > 0){
            this.estoque = estoque;
        }
        return this;
    }


    public void exibirInformacoes(){
        System.out.println(nome);
        System.out.println(preco);
        System.out.println(estoque);
        System.out.println("-=-".repeat(10));
    }

    public double calcularValorEstoque(){
        double resultado = preco * estoque;
        return resultado;
        }
}
