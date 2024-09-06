public class infoProdutos {

    public void info(String nome, int codigo) {
        System.out.println("Nome do produto: " + nome + ", Código: " + codigo);
    }

    public void info(String nome, int codigo, double valor) {
        System.out.println("Nome do produto: " + nome + ", Código: " + codigo + ", Valor: R$" + valor);
    }

    public static void main(String[] args) {
        infoProdutos produto = new infoProdutos();

        produto.info("Notebook DELL", 100984);

        produto.info("Cadeira escritório", 5009355, 520.50);
    }
}