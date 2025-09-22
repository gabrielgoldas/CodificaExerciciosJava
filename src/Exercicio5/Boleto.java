package Exercicio5;

import java.math.BigDecimal;

public class Boleto extends FormaPagamento {
    private String codigoBoleto;
    private boolean pagamentoValido;

    public Boleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    public boolean isPagamentoValido() {
        return pagamentoValido;
    }

    public void setPagamentoValido(boolean pagamentoValido) {
        this.pagamentoValido = pagamentoValido;
    }

    @Override
    void validarPagamento() throws PagamentoInvalidoException {
        String codigoLimpo = codigoBoleto.replaceAll("[\\s-]", "");
        if (!codigoLimpo.matches("\\d{47}|\\d{48}")) {
            setPagamentoValido(false);
            throw new PagamentoInvalidoException("Código de boleto inválido");
        }
        setPagamentoValido(true);

        this.setPagamentoValido(true);
    }

    @Override
    void processarPagamento(BigDecimal valor) throws PagamentoInvalidoException {
        if (this.isPagamentoValido() && valor.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Pagamento de R$" + valor + " realizado via Boleto");
        } else {
            throw new PagamentoInvalidoException("O pagamento não é válido!");
        }
    }
}
