package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.*;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionários deseja cadastrar?");
        int n = sc.nextInt();
        sc.nextLine(); // Consome a linha extra

        for (int i = 0; i < n; i++) {
            System.out.println("Informe o tipo de funcionário (1 - Integral, 2 - Meio Período, 3 - Estagiário):");
            int tipo = sc.nextInt();
            sc.nextLine(); // Consome a linha extra

            System.out.println("Nome:");
            String nome = sc.nextLine();
            System.out.println("CPF:");
            int cpf = sc.nextInt();
            System.out.println("Salário base:");
            double salarioBase = sc.nextDouble();

            if (tipo == 1) {
                System.out.println("Bônus:");
                double bonus = sc.nextDouble();
                funcionarios.add(new FuncionarioIntegral(nome, cpf, salarioBase, bonus));
            } else if (tipo == 2) {
                System.out.println("Horas trabalhadas:");
                int horas = sc.nextInt();
                System.out.println("Valor por hora:");
                int valorPorHora = sc.nextInt();
                funcionarios.add(new FuncionarioMeioPeriodo(nome, cpf, salarioBase, horas, valorPorHora));
            } else if (tipo == 3) {
                System.out.println("Bolsa auxílio:");
                int bolsa = sc.nextInt();
                funcionarios.add(new Estagiario(nome, cpf, salarioBase, bolsa));
            }
        }

        System.out.println("\nSalários dos funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + ": " + f.calcularSalario());
        }

        sc.close();
    }
}
