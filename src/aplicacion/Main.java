package aplicacion;

import entidades.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<CentroComercial> locales = new ArrayList<>(); //Arraylist

        CentroComercial cc1 = new CentroComercial("Maquinista");

        LocalComidaBar friendsClub = new LocalComidaBar(null,"FriendsClub","9-13/18-23",6,350);
        LocalRopaMixta Desigual = new LocalRopaMixta(null,"Desigual","9-20",15,450);
        LocalLibro libreriaFnac = new LocalLibro(null,"Fnac","9-20",30,700);
        LocalComidaRestaurante spagguetyFr = new LocalComidaRestaurante(null,"SpagguetyFr","12-20",20,600);
        LocalComidaRestaurante burritosMex = new LocalComidaRestaurante(null,"BurritosMex","12-20",10,400);

        locales.add(friendsClub);
        locales.add(Desigual);
        locales.add(libreriaFnac);
        locales.add(spagguetyFr);
        locales.add(friendsClub);
        locales.add(friendsClub);

        System.out.println("Centro: "+cc1);
        System.out.println("Cantidad de Locales: " + locales.size());

        System.out.println("Locales: ");
            System.out.println("         "+friendsClub.getNombreLocalComida()+" - "+friendsClub.getClass().getName()+" - Impuestos: "+friendsClub.calcularImpuestos()+"€");
            System.out.println("         "+Desigual.getNombreLocalRopa()+" - "+Desigual.getClass().getName()+" - Impuestos: "+Desigual.calcularImpuestos()+"€");
            System.out.println("         "+libreriaFnac.getNombreLocalLibro()+" - "+libreriaFnac.getClass().getName()+" - Impuestos: "+libreriaFnac.calcularImpuestos()+"€");
            System.out.println("         "+spagguetyFr.getNombreLocalComida()+" - "+spagguetyFr.getClass().getName()+" - Impuestos: "+spagguetyFr.calcularImpuestos()+"€");
            System.out.println("         "+burritosMex.getNombreLocalComida()+" - "+burritosMex.getClass().getName()+" - Impuestos: "+burritosMex.calcularImpuestos()+"€");


    }
}
