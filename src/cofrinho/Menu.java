package cofrinho;

public class Menu {

    //Exibe o menu principal
    public static void exibirMenu() {
        System.out.println("===== Menu do Cofrinho =====");
        System.out.println("1. Adicionar Moeda");
        System.out.println("2. Remover Moeda");
        System.out.println("3. Listar Moedas");
        System.out.println("4. Calcular Total em Reais");
        System.out.println("5. Sair");
        System.out.println("=============================");
    }

    //Exibe o menu de tipos de moedas para adicionar
    public static void exibirTiposMoedas() {
        System.out.println("===== Menu de Moedas =====");
        System.out.println("Selecione o tipo de moeda a ser adicionada:");
        System.out.println("1. Dólar");
        System.out.println("2. Euro");
        System.out.println("3. Real");
        System.out.println("4. Voltar ao Menu Principal");
        System.out.println("=============================");
    }

    //Exibe o menu de tipos de moedas para remover
    public static void exibirTiposMoedasRemover() {
        System.out.println("Selecione o tipo de moeda a ser removida:");
        System.out.println("1. Dólar");
        System.out.println("2. Euro");
        System.out.println("3. Real");
        System.out.println("4. Voltar ao Menu Principal");
        System.out.println("=============================");
    }
}
