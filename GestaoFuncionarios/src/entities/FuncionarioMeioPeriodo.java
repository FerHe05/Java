package entities;

public class FuncionarioMeioPeriodo extends Funcionario {

    private int horasTrabalhadas;
    private int valorPorHora;

    public FuncionarioMeioPeriodo(String nome, int cpf, double salarioBase, int horasTrabalhadas, int valorPorHora) {
        super(nome, cpf, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return horasTrabalhadas * valorPorHora; // Salário calculado por horas trabalhadas
    }
}