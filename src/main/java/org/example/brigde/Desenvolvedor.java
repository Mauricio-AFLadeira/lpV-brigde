package org.example.brigde;

public class Desenvolvedor extends Cargo{
    public Desenvolvedor(float salarioBase) {
        super(salarioBase);
    }

    public float calcularSalario() {
        return this.salarioBase * (1 + this.nivelCargo.percentualAumento());
    }
}
