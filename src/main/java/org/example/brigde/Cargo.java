package org.example.brigde;

public abstract class Cargo {

    protected NivelCargo nivelCargo;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNivelCargo(NivelCargo nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float calcularSalario();
}
