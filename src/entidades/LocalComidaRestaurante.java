package entidades;

public class LocalComidaRestaurante extends LocalComida{
    protected double taxRest = 1.3;

    public LocalComidaRestaurante(String CentroComercial, String nombreLocalComida, String horario, int numTrabajadores, int m2) {
        super(CentroComercial, nombreLocalComida, horario, numTrabajadores, m2);

    }

    @Override
    public double calcularImpuestos() {
        return getM2()*taxRest;
    }

    @Override
    public String toString() {
        return "LocalComidaRestaurante{" +
                "taxRest=" + taxRest +
                '}';
    }
}
