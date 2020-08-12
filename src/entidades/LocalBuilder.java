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
public abstract class LocalBuilder {
    protected Local local;
    
    public Local getLocal(){
        return local;
    }
    
    public void crearNuevoLocal(){
        local = new Local();
    }
    
    //Creacion local fijos
    public abstract void buildNombreLocal();
    public abstract void buildHorario();
    public abstract void buildNumTrabajadores();
    public abstract void buildM2();
    public abstract void buildTax();
    //Creacion de local mediante usuario
    public abstract void buildNombreLocal(String n);
    public abstract void buildHorario(String h);
    public abstract void buildNumTrabajadores(int i);
    public abstract void buildM2(double i);
    public abstract void buildTax(double tax);
    
}
