package entidades;

public class LocalComidaBar  extends LocalComida{
    protected double taxBar = 1.2;

    public LocalComidaBar(String CentroComercial, String nombreLocalComida, String horario, int numTrabajadores, int m2) {
        super(CentroComercial,nombreLocalComida, horario, numTrabajadores, m2);

    }

    @Override
    public double calcularImpuestos() {
        return getM2()*taxBar;
    }

    @Override
    public String toString() {
        return "LocalComidaBar{" +
                "taxBar=" + taxBar +
                '}';
    }
}
