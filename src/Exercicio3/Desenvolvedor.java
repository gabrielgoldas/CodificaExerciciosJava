package Exercicio3;

import java.math.BigDecimal;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        BigDecimal bonus = new BigDecimal("0.10");
        System.out.println("Bônus do Desenvolvedor R$" + this.getNome() + ": " + salario.multiply(bonus));
    }
}
