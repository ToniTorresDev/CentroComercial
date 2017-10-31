package entidades;

public class LocalComida extends CentroComercial {
    protected String nombreLocalComida;
    protected String horario;
    protected int numTrabajadores;
    protected int m2;



    public LocalComida(String CentroComercial, String nombreLocalComida,String horario, int numTrabajadores, int m2) {
        super(CentroComercial);
        this.nombreLocalComida = nombreLocalComida;
        this.horario = horario;
        this.numTrabajadores = numTrabajadores;
        this.m2 = m2;
    }

    public String getNombreLocalComida() {
        return nombreLocalComida;
    }

    public void setNombreLocalComida(String nombreLocalComida) {
        this.nombreLocalComida = nombreLocalComida;
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


    public double tax(){
        return 0;
    }

    @Override
    public double calcularImpuestos(){
        return calcularImpuestos();
    }

    @Override
    public String toString() {
        return "LocalComida{" +
                "nombreLocalComida='" + nombreLocalComida + '\'' +
                ", horario='" + horario + '\'' +
                ", numTrabajadores=" + numTrabajadores +
                ", m2=" + m2 +
                '}';
    }
}
