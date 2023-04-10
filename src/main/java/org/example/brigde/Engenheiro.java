package org.example.brigde;

public class Engenheiro extends Cargo{
    public Engenheiro(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.nivelCargo.percentualAumento());
    }
}
