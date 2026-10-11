package Testes.aula_interface;

public class Pix implements Pagamento {


    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento em PIX...");
    }
}
