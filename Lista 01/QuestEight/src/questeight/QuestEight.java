package questeight;

public class QuestEight {

    public static void main(String[] args) {
        Paises china = new Paises("China", "Pequim", 9596961);
        Paises japao = new Paises("Japão", "Tokyo", 377975);
        Paises russia = new Paises("Russia", "Moscou", 17098242);
        Paises coreiadosul = new Paises("Coreia do Sul", "Seul", 100210);

        china.adicionarFronteira(russia);
        china.adicionarFronteira(coreiadosul);

        japao.adicionarFronteira(coreiadosul);
        japao.adicionarFronteira(russia);

        System.out.println("Paises vizinhos do Japão:");
        for (Paises fronteira : japao.getFronteiras()) {
            System.out.println(fronteira.getNome());
        }

        System.out.println("\nPaises que são vizinhos de Japão e China simultâneamente:");
        for (Paises vizinho : japao.vizinhosComuns(china)) {
            System.out.println(vizinho.getNome());
        }
    }
}