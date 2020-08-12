/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author bryan
 */
public class CentroComercial {
    private String nombreCentroComercial;
    private LocalBuilder builder;
    
    public void setLocalBuilder(LocalBuilder localBuilder){
        builder = localBuilder;
    }

    public void setNombreCentroComercial(String nombreCentroComercial) {
        this.nombreCentroComercial = nombreCentroComercial;
    }

    public String getNombreCentroComercial() {
        return nombreCentroComercial;
    }
    
    public Local getLocal(){
        return builder.getLocal();
    }
    
    public void construirLocal(){
        builder.crearNuevoLocal();
        builder.buildNombreLocal();
        builder.buildHorario();
        builder.buildNumTrabajadores();
        builder.buildM2();
        builder.buildTax();
    }
}
