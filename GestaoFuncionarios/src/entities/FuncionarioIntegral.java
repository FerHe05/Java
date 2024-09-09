package entities;

public class FuncionarioIntegral extends Funcionario {

    private double bonus;

    public FuncionarioIntegral(String nome, int cpf, double salarioBase, double bonus) {
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus; // Salário base + bônus
    }
}