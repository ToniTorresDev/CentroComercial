package entidades;


public class LocalLibro extends CentroComercial {
    protected String nombreLocalLibro;
    protected String horario;
    protected int numTrabajadores;
    protected int m2;
    protected double taxLibro = 1;

    public LocalLibro(String CentroComercial, String nombreLocalLibro, String horario, int numTrabajadores, int m2) {
        super(CentroComercial);
        this.nombreLocalLibro = nombreLocalLibro;
        this.horario = horario;
        this.numTrabajadores = numTrabajadores;
        this.m2 = m2;
    }

    public String getNombreLocalLibro() {
        return nombreLocalLibro;
    }

    public void setNombreLocalLibro(String nombreLocalLibro) {
        this.nombreLocalLibro = nombreLocalLibro;
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
        return m2*taxLibro;
    }

    @Override
    public String toString() {
        return "LocalLibro{" +
                "nombreLocalLibro='" + nombreLocalLibro + '\'' +
                ", horario='" + horario + '\'' +
                ", numTrabajadores=" + numTrabajadores +
                ", m2=" + m2 +
                '}';
    }
}

