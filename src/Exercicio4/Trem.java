package Exercicio4;

public class Trem implements IMeioTransporte {
    private int velocidade;
    private String modelo;

    public Trem(int velocidade, String modelo) {
        this.velocidade = velocidade;
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public void acelerar() {
        if (this.velocidade >= 300) {
            throw new IllegalArgumentException("O " + getModelo() + " já está na velocidade máxima");
        } else if (this.velocidade < 0) {
            throw new IllegalArgumentException("Velocidade não pode ser menor do que zero.");
        }

        while (this.velocidade < 300) {
            this.velocidade += 20;
        }
        System.out.println(this.getModelo() + " está acelerando...");
        System.out.println("O trem " + this.getModelo() + " atingiu a velociade máxima de " + this.getVelocidade());
    }

    @Override
    public void frear() {
        if (this.velocidade <= 0) {
            throw new IllegalArgumentException("O " + getModelo() + "já está parado");
        }
        while (this.velocidade > 0) {
            this.velocidade -= 30;
        }
        System.out.println(this.getModelo() + " está freando...");
        System.out.println("O trem " + this.getModelo() + " parou!");
    }
}
