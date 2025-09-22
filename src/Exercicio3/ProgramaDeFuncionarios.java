package Exercicio3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ProgramaDeFuncionarios {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Desenvolvedor douglas = new Desenvolvedor("Douglas Doga10", BigDecimal.valueOf(10.000));
        Desenvolvedor luan = new Desenvolvedor("Luanel Messi", BigDecimal.valueOf(15.000));
        Gerente kannemann = new Gerente("Kannemann", BigDecimal.valueOf(10.000));
        Gerente marceloGrohe = new Gerente("Marcelo Grohe", BigDecimal.valueOf(50.000));
        Gerente maicon = new Gerente("Maicon Capita", BigDecimal.valueOf(25.000));
        // Gerente dalessandro = new Gerente("dalessandro", BigDecimal.valueOf(0));

        funcionarios.add(douglas);
        funcionarios.add(luan);
        funcionarios.add(kannemann);
        funcionarios.add(marceloGrohe);
        funcionarios.add(maicon);

        for (Funcionario funcionario : funcionarios) {
            funcionario.calcularBonus();
        }

    }
}
