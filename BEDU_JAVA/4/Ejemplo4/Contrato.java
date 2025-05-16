package Ejemplo4;

public final class Contrato {

    private final String tipo;
    private final double salario;

    public Contrato(String tipo, double salario) {
        this.tipo = tipo;
        this.salario = salario;
    }

    public String getTipo() {
        return tipo;
    }

    public double getSalario() {
        return salario;
    }

    public void mostrarInfo() {
        System.out.println("Contrato: " + tipo + ", Salario: $" + salario);
    }
}
