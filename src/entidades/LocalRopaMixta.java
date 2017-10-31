package entidades;

public class LocalRopaMixta extends LocalRopa{
    protected double taxMixta = 1;

    public LocalRopaMixta(String CentroComercial, String nombreLocalRopa, String horario, int numTrabajadores, int m2) {
        super(CentroComercial, nombreLocalRopa, horario, numTrabajadores, m2);

    }

    public double getTaxMixta() {
        return taxMixta;
    }

    public void setTaxMixta(double taxMixta) {
        this.taxMixta = taxMixta;
    }

    @Override
    public double calcularImpuestos() {
        return getM2()*taxMixta;
    }

    @Override
    public String toString() {
        return "LocalRopaMixta{" +
                "taxMixta=" + taxMixta +
                '}';
    }
}
