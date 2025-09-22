package Exercicio5;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProgramaPagamento {
    public static void main(String[] args) {
        List<FormaPagamento> formas = new ArrayList<>();

        // Cenários válidos
        CartaoCredito visa = new CartaoCredito("1234 5678 9012 3456");
        Boleto boletoValido = new Boleto("237933814562860000000123456789012345678901234567");
        Pix pixEmail = new Pix("gabriel@email.com");

        // Cenários inválidos
        CartaoCredito cartaoInvalido = new CartaoCredito("123"); // muito curto
        Boleto boletoInvalido = new Boleto("abc123"); // não numérico
        Pix pixInvalido = new Pix(""); // vazio

        // Adiciona todos à lista
        formas.add(visa);
        formas.add(boletoValido);
        formas.add(pixEmail);
        formas.add(cartaoInvalido);
        formas.add(boletoInvalido);
        formas.add(pixInvalido);

        // Testa cada forma de pagamento
        for (FormaPagamento forma : formas) {
            try {
                forma.validarPagamento();
                forma.processarPagamento(new BigDecimal("150.00"));
            } catch (PagamentoInvalidoException e) {
                System.out.println("Erro ao processar pagamento: " + e.getMessage());
            }
            System.out.println("---------------");
        }

    }
}
