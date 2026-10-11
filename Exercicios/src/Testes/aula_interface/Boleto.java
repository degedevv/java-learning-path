package Testes.aula_interface;

public class Boleto implements Pagamento{

    @Override
    public void processarPagamento() {
        System.out.println("Gerando pagamento em BOLETO...");
    }
}
