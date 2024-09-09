package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.Estagiario;
import entities.FuncionarioIntegral;
import entities.FuncionarioMeioPeriodo;

class testFuncionario {

    @Test
    void testCalcularSalarioFuncionarioIntegral() {
        FuncionarioIntegral func = new FuncionarioIntegral("Carlos", 123456, 5000.0, 1000.0);
        double expected = 6000.0; // Salário base + bônus
        assertEquals(expected, func.calcularSalario(), 0.01);
    }

    @Test
    void testCalcularSalarioFuncionarioMeioPeriodo() {
        FuncionarioMeioPeriodo func = new FuncionarioMeioPeriodo("Ana", 789456, 0.0, 20, 50);
        double expected = 1000.0; // 20 horas * 50 por hora
        assertEquals(expected, func.calcularSalario(), 0.01);
    }

    @Test
    void testCalcularSalarioEstagiario() {
        Estagiario est = new Estagiario("João", 123789, 1500.0, 500);
        double expected = 2000.0; // Salário base + bolsa-auxílio
        assertEquals(expected, est.calcularSalario(), 0.01);
    }
}
