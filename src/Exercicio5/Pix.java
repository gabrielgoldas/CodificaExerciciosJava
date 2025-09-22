package Exercicio5;

import java.math.BigDecimal;

public class Pix extends FormaPagamento {
    private String chavePix;
    private boolean pagamentoValido;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public boolean isPagamentoValido() {
        return pagamentoValido;
    }

    public void setPagamentoValido(boolean pagamentoValido) {
        this.pagamentoValido = pagamentoValido;
    }

    @Override
    void validarPagamento() throws PagamentoInvalidoException {
        if (chavePix == null || chavePix.isEmpty()) {
            setPagamentoValido(false);
            throw new PagamentoInvalidoException("Chave pix não pode ser vazia");
        }

        boolean formatoValido = chavePix.matches("\\d{11}") || // CPF
                                chavePix.matches(".+@.+\\..+") || // E-mail
                                chavePix.matches("\\+?\\d{10,13}"); // Telefone
        if (!formatoValido) {
            setPagamentoValido(false);
            throw new PagamentoInvalidoException("Chave Pix inválida");
        }

        setPagamentoValido(true);
    }

    @Override
    void processarPagamento(BigDecimal valor) throws PagamentoInvalidoException {
        if (this.isPagamentoValido() && valor.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Pagamento de R$" + valor + " realizado via pix");
        } else {
            throw new PagamentoInvalidoException("O pagamento não é válido!");
        }
    }
}
