package cofrinho;

public class Dolar extends Moeda {
    private static final double TAXA_CONVERSAO = 5.4; // Exemplo: 1 USD = 5,4 BRL

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * TAXA_CONVERSAO;
    }

    @Override
    public String info() {
        return "Dólar: " + valor + " USD";
    }
}