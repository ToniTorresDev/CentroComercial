package entidades;

public class LocalDeportes extends CentroComercial {
    protected String nombreLocalDeportes;
    protected String horario;
    protected int numTrabajadores;
    protected int m2;
    protected double taxDeportes = 1.4;

    public LocalDeportes(String CentroComercial, String nombreLocalDeportes, String horario, int numTrabajadores, int m2) {
        super(CentroComercial);
        this.nombreLocalDeportes = nombreLocalDeportes;
        this.horario = horario;
        this.numTrabajadores = numTrabajadores;
        this.m2 = m2;
    }


    public String getNombreLocalDeportes() {
        return nombreLocalDeportes;
    }

    public void setNombreLocalDeportes(String nombreLocalDeportes) {
        this.nombreLocalDeportes = nombreLocalDeportes;
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

    public double getTaxDeportes() {
        return taxDeportes;
    }

    public void setTaxDeportes(double taxDeportes) {
        this.taxDeportes = taxDeportes;
    }

    @Override
    public double calcularImpuestos() {
        return m2*taxDeportes;
    }

    @Override
    public String toString() {
        return "LocalDeportes{" +
                "nombreLocalDeportes='" + nombreLocalDeportes + '\'' +
                ", horario='" + horario + '\'' +
                ", numTrabajadores=" + numTrabajadores +
                ", m2=" + m2 +
                ", taxDeportes=" + taxDeportes +
                '}';
    }
}
