package cofrinho;

public class Euro extends Moeda {
    private static final double TAXA_CONVERSAO = 6.14; // Exemplo: 1 EUR = 6,14 BRL

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor * TAXA_CONVERSAO;
    }

    @Override
    public String info() {
        return "Euro: " + valor + " EUR";
    }
}