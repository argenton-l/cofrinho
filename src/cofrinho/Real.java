package cofrinho;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converterParaReal() {
        return valor; // Já está em reais
    }

    @Override
    public String info() {
        return "Real: " + valor + " BRL";
    }
}