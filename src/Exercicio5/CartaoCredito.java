package Exercicio5;

import java.math.BigDecimal;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;
    private boolean pagamentoValido;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public boolean isPagamentoValido() {
        return pagamentoValido;
    }

    public void setPagamentoValido(boolean pagamentoValido) {
        this.pagamentoValido = pagamentoValido;
    }

    @Override
    void validarPagamento() throws PagamentoInvalidoException {
        String numerolimpo = numeroCartao.replaceAll("[\\s-]", "");
        if (!numerolimpo.matches("\\d{15}|\\d{16}")) {
            setPagamentoValido(false);
            throw new PagamentoInvalidoException("Número do cartão inválido");
        }
        this.setPagamentoValido(true);
    }

    @Override
    void processarPagamento(BigDecimal valor) throws PagamentoInvalidoException {
        if (this.isPagamentoValido() && valor.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Pagamento de R$" + valor + " realizado no cartão de crédito");
        } else {
            throw new PagamentoInvalidoException("O pagamento não é válido!");
        }
    }
}
