package cofrinho;

public abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public abstract double converterParaReal();

    public abstract String info();

    @Override
    public String toString() {
        return "Valor: " + valor;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Moeda moeda = (Moeda) obj;
        return Double.compare(moeda.valor, valor) == 0;
    }
    
    @Override
    public int hashCode() {
        return Double.hashCode(valor) + getClass().getName().hashCode();
    }
}