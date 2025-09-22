package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class ProgramaMeioDeTransportes {
    public static void main(String[] args) {
        List<IMeioTransporte> meioTransportes = new ArrayList<>();

        // Carro fusca = new Carro(-1, "Fusca");
        Carro uno = new Carro(20, "Fiat Uno");
        //Bicicleta specialized = new Bicicleta(50, "Specialized");
        Bicicleta trek = new Bicicleta(2, "Trek");
        // Trem ave = new Trem(-12, "AVE");
        Trem trensurb = new Trem(0, "Trensurb");

        // meioTransportes.add(fusca);
        meioTransportes.add(uno);
        // meioTransportes.add(specialized);
        meioTransportes.add(trek);
        // meioTransportes.add(ave);
        meioTransportes.add(trensurb);

        for (IMeioTransporte meioTransporte : meioTransportes) {
            meioTransporte.acelerar();
            meioTransporte.frear();
            System.out.println("---------------");
        }
    }
}
