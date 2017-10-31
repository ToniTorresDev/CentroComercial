package entidades;

public class LocalRopaMasculino extends LocalRopa{
    protected double taxMasculino = 1.2;

    public LocalRopaMasculino(String CentroComercial, String nombreLocalRopa, String horario, int numTrabajadores, int m2) {
        super(CentroComercial, nombreLocalRopa, horario, numTrabajadores, m2);

    }

    public double getTaxMasculino() {
        return taxMasculino;
    }

    public void setTaxMasculino(double taxMasculino) {
        this.taxMasculino = taxMasculino;
    }

    @Override
    public double calcularImpuestos() {
        return getM2()*taxMasculino;
    }

    @Override
    public String toString() {
        return "LocalRopaMasculino{" +
                "taxMasculino=" + taxMasculino +
                '}';
    }
}
