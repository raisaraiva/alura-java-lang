package model.utils;

import model.Tributavel;

public class CalculadoraUtils {

    private double totalImposto;

    public double getTotalImposto() {
        return totalImposto;
    }

    public void registra(Tributavel tributavel) {
        this.totalImposto += tributavel.getValorImposto();
    }
}
