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
public class Local {
    private String nombreLocal = "";
    private String horario = "";
    private int numTrabajadores = 0;
    private double m2 = 0;
    private double tax = 0;

    /**
     * 
     * @param nombreLocal Se escribe el nombre del local
     */
    public void setNombreLocal(String nombreLocal) {
        this.nombreLocal = nombreLocal;
    }

    /**
     * 
     * @param horario Se escribe el horario del local 
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * 
     * @param numTrabajadores Se inserta el numero de trabajadores para el local 
     */
    public void setNumTrabajadores(int numTrabajadores) {
        this.numTrabajadores = numTrabajadores;
    }

    /**
     * 
     * @param m2 Se ingresa la cantidad de metros cuadrados del local 
     */
    public void setM2(double m2) {
        this.m2 = m2;
    }

    /**
     * 
     * @param tax Se ingresa los tax que maneja el local 
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * 
     * @return Retorna la cantidad de metros cuadrados del local 
     */
    public double getM2() {
        return m2;
    }

    /**
     * 
     * @return Retorna el tax del local 
     */
    public double getTax() {
        return tax;
    }
    
    /**
     * 
     * @return Retorna la cantidad de impuesto del local 
     */
    public double calcularImpuestos(){
        return this.getM2()*this.getTax();
    }
    
    @Override
    public String toString() {
        return "NombreLocal: " + nombreLocal + ", horario: " + horario + ", numTrabajadores: " + numTrabajadores+", Impuestos: $ "+calcularImpuestos();
    }
    
    
    
}
