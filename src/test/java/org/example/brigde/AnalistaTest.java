package org.example.brigde;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnalistaTest {
    @Test
    void deveRetornarSalarioAnalistaComEstagiario() {
        NivelCargo nivelCargo = new Estagiario();
        Analista analista = new Analista(2000.0f);
        analista.setNivelCargo(nivelCargo);
        assertEquals(2000.0f, analista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAnalistaComPleno() {
        NivelCargo nivelCargo = new Pleno();
        Analista analista = new Analista(2000.0f);
        analista.setNivelCargo(nivelCargo);
        assertEquals(2800.0f, analista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAnalistaComJunior() {
        NivelCargo nivelCargo = new Junior();
        Analista analista = new Analista(2000.0f);
        analista.setNivelCargo(nivelCargo);
        assertEquals(2400.0f, analista.calcularSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioAnalistaComSenior() {
        NivelCargo nivelCargo = new Senior();
        Analista analista = new Analista(2000.0f);
        analista.setNivelCargo(nivelCargo);
        assertEquals(3200.0f, analista.calcularSalario(), 0.01f);
    }


}