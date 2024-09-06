public class AnimaisAbstratos {

    public void exibirInformacoes(String nome, String familia, String bioma, int idade) {
        System.out.println("Nome: " + nome + ", Família: " + familia + ", Bioma: " + bioma + ", Idade: " + idade);
    }

    public static void main(String[] args) {
        AnimaisAbstratos animais = new AnimaisAbstratos();

        System.out.println("Animal 01:");
        animais.exibirInformacoes("Leão", "Felídeo", "Savana", 5);

        System.out.println("Animal 02:");
        animais.exibirInformacoes("Pinguim", "Spheniscidae", "Antártica", 3);
    }
}