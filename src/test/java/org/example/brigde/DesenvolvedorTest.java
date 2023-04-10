package org.example.brigde;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesenvolvedorTest {
    @Test
    void deveRetornarSalarioDesenvolvedorComEstagiario() {
        NivelCargo nivelCargo = new Estagiario();
        Desenvolvedor desenvolvedor = new Desenvolvedor(2000.0f);
        desenvolvedor.setNivelCargo(nivelCargo);
        assertEquals(2000.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioDesenvolvedorComPleno() {
        NivelCargo nivelCargo = new Pleno();
        Desenvolvedor desenvolvedor = new Desenvolvedor(2000.0f);
        desenvolvedor.setNivelCargo(nivelCargo);
        assertEquals(2800.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioDesenvolvedorComJunior() {
        NivelCargo nivelCargo = new Junior();
        Desenvolvedor desenvolvedor = new Desenvolvedor(2000.0f);
        desenvolvedor.setNivelCargo(nivelCargo);
        assertEquals(2400.0f, desenvolvedor.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioDesenvolvedorComSenior() {
        NivelCargo nivelCargo = new Senior();
        Desenvolvedor desenvolvedor = new Desenvolvedor(2000.0f);
        desenvolvedor.setNivelCargo(nivelCargo);
        assertEquals(3200.0f, desenvolvedor.calcularSalario(), 0.01f);
    }


}