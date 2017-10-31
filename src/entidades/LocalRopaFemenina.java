package entidades;

public class LocalRopaFemenina extends LocalRopa{
    protected double taxFemenina = 0.9;

    public LocalRopaFemenina(String CentroComercial, String nombreLocalRopa, String horario, int numTrabajadores, int m2) {
        super(CentroComercial, nombreLocalRopa, horario, numTrabajadores, m2);

    }

    public double getTaxFemenina() {
        return taxFemenina;
    }

    public void setTaxFemenina(double taxFemenina) {
        this.taxFemenina = taxFemenina;
    }

    @Override
    public double calcularImpuestos() {
        return getM2()*taxFemenina;
    }

    @Override
    public String toString() {
        return "LocalRopaFemenina{" +
                "taxFemenina=" + taxFemenina +
                '}';
    }
}
