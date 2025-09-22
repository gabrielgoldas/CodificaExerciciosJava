package Exercicio3;

import java.math.BigDecimal;

public abstract class Funcionario {
    protected String nome;
    protected BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        if (salario.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Salário precisa ser positivo!");
        }
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public abstract void calcularBonus();


}
