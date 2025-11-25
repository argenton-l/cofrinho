package cofrinho;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cofrinho cofrinho = new Cofrinho();
        int option = 0;
        Scanner scanner = new Scanner(System.in);

        while (option != 5) {
            Menu.exibirMenu();
            System.out.println("Digite a opção desejada:");
            option = scanner.nextInt();
            scanner.nextLine(); // consumir newline restante
            
            switch (option) {
                case 1:
                    try {
                        int optionMoeda = 0;
                        while (optionMoeda != 4) {
                            Menu.exibirTiposMoedas();
                            System.out.println("Digite a opção desejada:");
                            optionMoeda = scanner.nextInt();
                            scanner.nextLine();
                            switch (optionMoeda){
                                case 1:
                                    // Adiciona moeda ao cofrinho 
                                    System.out.println("Digite o valor da moeda:");
                                    double valorDolar = scanner.nextDouble();
                                    cofrinho.adicionarMoeda(new Dolar(valorDolar));
                                    System.out.println("Moeda adicionada com sucesso!");
                                    System.out.println("");
                                    break;
                       
                                case 2:
                                    System.out.println("Digite o valor da moeda:");
                                    double valorEuro = scanner.nextDouble();
                                    cofrinho.adicionarMoeda(new Euro(valorEuro));
                                    System.out.println("Moeda adicionada com sucesso!");
                                    System.out.println("");
                                    break;

                                case 3:
                                    System.out.println("Digite o valor da moeda:");
                                    double valorReal = scanner.nextDouble();
                                    cofrinho.adicionarMoeda(new Real(valorReal));
                                    System.out.println("Moeda adicionada com sucesso!");
                                    System.out.println("");
                                    break;

                                case 4:
                                        break;}
                        }                                  
                    } catch (Exception e) {
                        System.out.println("Digite uma opção válida.");       
                        System.out.println("");
                    }
                    break;

                case 2:
                    Menu.exibirTiposMoedasRemover();
                    System.out.println("Digite o tipo de moeda a ser removida:");
                    int opcaoMoedaRemover = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        System.out.println("Digite o valor da moeda a ser removida:");
                        double valorRemover = scanner.nextDouble();
                        scanner.nextLine();
                        Moeda moedaParaRemover = null;
                        switch (opcaoMoedaRemover) {
                            case 1:
                                moedaParaRemover = new Dolar(valorRemover);
                                break;
                            case 2:
                                moedaParaRemover = new Euro(valorRemover);
                                break;
                            case 3:
                                moedaParaRemover = new Real(valorRemover);
                                break;
                            default:
                                System.out.println("Opção inválida! Digite uma opção válida.");
                                continue;
                        }
                        boolean removido = cofrinho.removerMoeda(moedaParaRemover);
                        if (removido) {
                            System.out.println("Moeda removida com sucesso!");
                        } else {
                            System.out.println("Moeda não encontrada no cofrinho.");
                        }
                        System.out.println("");
                    } catch (Exception e) {
                        System.out.println("Erro ao remover moeda. Verifique os dados e tente novamente.");
                        System.out.println("");
                    }
                    break;

                case 3:
                    // Lista todas as moedas no cofrinho
                    if (cofrinho == null || cofrinho.estaVazio()) {
                        System.out.println("O cofrinho está vazio.");
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("Moedas no cofrinho:");
                        cofrinho.listarMoedas();
                        System.out.println("");
                        break;
                    }
                case 4:
                    // Calcula o total em reais no cofrinho
                    if (cofrinho == null || cofrinho.estaVazio()) {
                        System.out.println("O cofrinho está vazio.");
                        System.out.println("");
                        break;
                    } else {
                        double totalEmReais = cofrinho.calcularTotalEmReais();
                        System.out.println("Total contido no cofrinho em Reais: " + totalEmReais + " BRL");
                        System.out.println("");
                        break;
                    }
                case 5:
                    // Sair do programa
                    System.out.println("Saindo do programa."); 
                    break;        
        }

    }
    scanner.close();
}
}
