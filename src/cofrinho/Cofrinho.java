package cofrinho;
import java.util.ArrayList;
import java.util.List;

public class Cofrinho {

    private List<Moeda> moedas;

    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    //adicionar moedas de diferentes valores e paises
    public void adicionarMoeda(Moeda moeda) {
        moedas.add(moeda);
    }

    //remover moedas especificas
    public boolean removerMoeda(Moeda moeda) {
        return moedas.remove(moeda);
    }

    //listar todas as moedas
    public void listarMoedas() {
        for (Moeda moeda : moedas) {
            System.out.println(moeda.info());
        }
    }

    //verifica se o cofrinho está vazio
    public boolean estaVazio() {
        return moedas == null || moedas.isEmpty();
    }

    //calcular quanto tem no cofrinho e converter para real
    public double calcularTotalEmReais() {
        double total = 0.0;
        for (Moeda moeda : moedas) {
            total += moeda.converterParaReal();
        }
        return total;
    }

   
}
