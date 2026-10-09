package Produtos;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Iphone18 Pro Max", 2000.00,7);

        System.out.println("-=-".repeat(10));

        produto1.exibirInformacoes();

    }
}
