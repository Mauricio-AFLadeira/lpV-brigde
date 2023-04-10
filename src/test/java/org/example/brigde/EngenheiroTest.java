package org.example.brigde;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngenheiroTest {
    @Test
    void deveRetornarSalarioEngenheiroComEstagiario() {
        NivelCargo nivelCargo = new Estagiario();
        Engenheiro engenheiro = new Engenheiro(2000.0f);
        engenheiro.setNivelCargo(nivelCargo);
        assertEquals(2000.0f, engenheiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEngenheiroComPleno() {
        NivelCargo nivelCargo = new Pleno();
        Engenheiro engenheiro = new Engenheiro(2000.0f);
        engenheiro.setNivelCargo(nivelCargo);
        assertEquals(2800.0f, engenheiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEngenheiroComJunior() {
        NivelCargo nivelCargo = new Junior();
        Engenheiro engenheiro = new Engenheiro(2000.0f);
        engenheiro.setNivelCargo(nivelCargo);
        assertEquals(2400.0f, engenheiro.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioEngenheiroComSenior() {
        NivelCargo nivelCargo = new Senior();
        Engenheiro engenheiro = new Engenheiro(2000.0f);
        engenheiro.setNivelCargo(nivelCargo);
        assertEquals(3200.0f, engenheiro.calcularSalario(), 0.01f);
    }

}