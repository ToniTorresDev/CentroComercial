/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author t_t-b
 */
public class Adaptador implements IAdaptador{
    Local local = new Local();
    



    @Override
    public double getYardaAMetro() {
        return this.local.getM2();
    }

    @Override
    public void setYardaAMetro(double i) {
         local.setM2((0.914*i));
    }
    
}
