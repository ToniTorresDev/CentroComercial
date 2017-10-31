package entidades;


public class LocalRopa extends CentroComercial {
    protected String nombreLocalRopa;
    protected String horario;
    protected int numTrabajadores;
    protected int m2;

    public LocalRopa(String CentroComercial,String nombreLocalRopa, String horario, int numTrabajadores, int m2) {
        super(CentroComercial);
        this.nombreLocalRopa = nombreLocalRopa;
        this.horario = horario;
        this.numTrabajadores = numTrabajadores;
        this.m2 = m2;
    }

    public String getNombreLocalRopa() {
        return nombreLocalRopa;
    }

    public void setNombreLocalRopa(String nombreLocalRopa) {
        this.nombreLocalRopa = nombreLocalRopa;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getNumTrabajadores() {
        return numTrabajadores;
    }

    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    @Override
    public double calcularImpuestos() {
        return super.calcularImpuestos();
    }

    @Override
    public String toString() {
        return "LocalRopa{" +
                "nombreLocalRopa='" + nombreLocalRopa + '\'' +
                ", horario='" + horario + '\'' +
                ", numTrabajadores=" + numTrabajadores +
                ", m2=" + m2 +
                '}';
    }
}
