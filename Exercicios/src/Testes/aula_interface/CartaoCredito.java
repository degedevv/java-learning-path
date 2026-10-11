package Testes.aula_interface;

public class CartaoCredito implements Pagamento{

    @Override
    public void processarPagamento() {
        System.out.println("Processando cartão de credito...");
    }
}
