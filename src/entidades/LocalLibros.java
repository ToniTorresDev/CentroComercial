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
public class LocalLibros extends LocalBuilder{

    @Override
    public void buildNombreLocal() {
        local.setNombreLocal("Book World");}

    @Override
    public void buildHorario() {
        local.setHorario("7H00 - 14H00");}

    @Override
    public void buildNumTrabajadores() {
        local.setNumTrabajadores(8);}

    @Override
    public void buildM2() {
        local.setM2(160);}

    @Override
    public void buildTax() {
        local.setTax(1);}
    
    
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
