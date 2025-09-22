package Exercicio3;

import java.math.BigDecimal;

public class Gerente extends Funcionario{

    public Gerente(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        BigDecimal bonus = new BigDecimal("0.20");
        System.out.println("Bônus do Gerente R$" + this.getNome() + ": " + salario.multiply(bonus));
    }
}
