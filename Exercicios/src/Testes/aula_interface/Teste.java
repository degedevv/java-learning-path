package Testes.aula_interface;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {

        Pagamento boleto = new Boleto();
        Pagamento pix = new Pix();

        List<Pagamento> pagamentos = new ArrayList<>();
        pagamentos.add(boleto);
        pagamentos.add(pix);
        pagamentos.add(new CartaoCredito());

        for (Pagamento pagamento: pagamentos){
            pagamento.processarPagamento();
        }

    }
}
