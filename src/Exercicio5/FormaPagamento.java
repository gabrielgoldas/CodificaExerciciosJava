package Exercicio5;

import java.math.BigDecimal;

public abstract class FormaPagamento {
    abstract void validarPagamento() throws PagamentoInvalidoException;
    abstract void processarPagamento(BigDecimal valor) throws PagamentoInvalidoException;
}
