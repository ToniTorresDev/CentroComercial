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
public class LocalComidaRestaurante extends LocalComida{

    @Override
    public void buildNombreLocal() {
        local.setNombreLocal("SpagguetyFr");}

    @Override
    public void buildHorario() {
        local.setHorario("12H00 - 20H00");}

    @Override
    public void buildNumTrabajadores() {
        local.setNumTrabajadores(20);}

    @Override
    public void buildM2() {
        local.setM2(600);}

    @Override
    public void buildTax() {
        local.setTax(1.3);}
    
    
    //creacion de local de acuerdo al usuario
    @Override
    public void buildNombreLocal(String n) {
        local.setNombreLocal(n);
    }

    @Override
    public void buildHorario(String h) {
        local.setHorario(h);
    }

    @Override
    public void buildNumTrabajadores(int i) {
        local.setNumTrabajadores(i);
    }

    @Override
    public void buildM2(double i) {
        local.setM2(i);
    }

    @Override
    public void buildTax(double tax) {
        local.setTax(tax);
    }

    
            
}
