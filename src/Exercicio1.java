import java.math.BigDecimal;

public class Exercicio1 {

    public static class Produto {
        private String nome;
        private BigDecimal preco;
        private BigDecimal qtdEstoque;

        public String getNome() {
            return this.nome;
        }

        public void setNome(String nome) {
            if (nome == null || nome.isEmpty()) {
                throw new IllegalArgumentException("O nome não pode ser nulo ou vazio");
            }
            this.nome = nome;
        }

        public BigDecimal getPreco() {
            return this.preco;
        }

        public void setPreco(BigDecimal preco) {
            if (preco.compareTo(BigDecimal.ZERO) < 0) {
                throw new IllegalArgumentException("O preço não pode ser menor do que zero");
            }
            this.preco = preco;
        }

        public BigDecimal getQtdEstoque() {
            return this.qtdEstoque;
        }

        public void setQtdEstoque(BigDecimal qtdEstoque) {
            if (qtdEstoque.compareTo(BigDecimal.ZERO) < 0) {
                throw new IllegalArgumentException("A quantidade em estoque não pode ser menor do que zero");
            }
            this.qtdEstoque = qtdEstoque;
        }
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto();
        //produto1.setNome(null);
        //produto1.setNome("");
        //produto1.setPreco(BigDecimal.valueOf(-1));
        // produto1.setQtdEstoque(BigDecimal.valueOf(-2));

        produto1.setNome("Celular");
        produto1.setPreco(BigDecimal.valueOf(1800.00));
        produto1.setQtdEstoque(BigDecimal.valueOf(2));

        System.out.println("Nome do Produto: " + produto1.getNome());
        System.out.println("Preço: R$" + produto1.getPreco());
        System.out.println("Quantidade em estoque: " + produto1.getQtdEstoque());

    }

}
