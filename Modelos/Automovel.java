package Modelos;

public class Automovel {
    
    private double distanciaPercorrida;
    private double combustivelGasto;

    public Automovel(double distanciaPercorrida, double combustivelGasto) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.combustivelGasto = combustivelGasto;
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public double calcularConsumoMedio() {
        if (combustivelGasto != 0) {
            return distanciaPercorrida / combustivelGasto;
        } else {
            return 0; 
        }
    }

}
