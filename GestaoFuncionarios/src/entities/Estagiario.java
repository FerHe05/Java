package entities;

public class Estagiario extends Funcionario {

    private int bolsaAuxilio;

    public Estagiario(String nome, int cpf, double salarioBase, int bolsaAuxilio) {
        super(nome, cpf, salarioBase);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bolsaAuxilio; // Salário base + bolsa-auxílio
    }
}