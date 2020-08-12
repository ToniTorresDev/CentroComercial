/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion;
import entidades.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author bryan
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Adaptador
        Adaptador conversor = new Adaptador();
        conversor.setYardaAMetro(15);
        System.out.println(conversor.getYardaAMetro());
        //Una lista de locales vacia
        List<LocalBuilder> locales = new ArrayList<>();
        
        CentroComercial centroComercial = new CentroComercial();
        centroComercial.setNombreCentroComercial("Maquinista");
        
        LocalBuilder localComidaBar = new LocalComidaBar();
        LocalBuilder localComidaRestaurante = new LocalComidaRestaurante();
        LocalBuilder localDeportes = new LocalDeportes();
        LocalBuilder localLibros = new LocalLibros();
        LocalBuilder localRopaFemenina = new LocalRopaFemenina();
        LocalBuilder localRopaMasculino = new LocalRopaMasculino();
        //localComidaBar.
        //Construccion de Local Comida Bar
        centroComercial.setLocalBuilder(localComidaBar);
        centroComercial.construirLocal();
        //Construccion del local Comida Restaurante
        centroComercial.setLocalBuilder(localComidaRestaurante);
        centroComercial.construirLocal();
        //Construccion del local de Deportes
        centroComercial.setLocalBuilder(localDeportes);
        centroComercial.construirLocal();
        //Construccion del local de Libros
        centroComercial.setLocalBuilder(localLibros);
        centroComercial.construirLocal();
        //Construccion del local de Ropa Femenina
        centroComercial.setLocalBuilder(localRopaFemenina);
        centroComercial.construirLocal();
        //Construccion del local de Ropa Masculina
        centroComercial.setLocalBuilder(localRopaMasculino);
        centroComercial.construirLocal();
        //Se imprime el nombre del Centro Comercial
        System.out.println(centroComercial.getNombreCentroComercial());
        //Se agrega los locales a una lista
        locales.add(localComidaBar);
        locales.add(localComidaRestaurante);
        locales.add(localDeportes);
        locales.add(localLibros);
        locales.add(localRopaFemenina);
        locales.add(localRopaMasculino);
        //Se imprime la cantidad de locales de la lista
        System.out.println(locales.size());
        //Se imprime la lista de los locales
        for(LocalBuilder e:locales){
            System.out.println(e.getLocal());
        }
    }
}
