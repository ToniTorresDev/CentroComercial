package entidades;

public class CentroComercial {
    protected String nombreCentro;

    public CentroComercial(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public String getNombreCentro() {
        return nombreCentro;
    }

    public void setNombreCentro(String nombreCentro) {
        this.nombreCentro = nombreCentro;
    }

    public double calcularImpuestos(){
     return calcularImpuestos();
    }

    @Override
    public String toString() {
        return nombreCentro;
    }
}
