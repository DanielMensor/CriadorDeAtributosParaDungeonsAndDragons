package org.example;

import java.util.List;
import java.util.Random;

/**
 * This class has been made to calculate attributes for D&D automatically;
 * Using the form of rolling 4 d6, adding each of them and subtracting the smallest
 *
 * @version 0.0.1
 * @author Daniel Mensor
 */

public class AtributesGenerator {


    /*
    This method rolls a d6, draws a number from 1 to 6
     */
    public static int d6roller(){
        Random gerador = new Random();
        return gerador.nextInt(6)+1;
    }


    /*
    This method roll 4 d6 and subtract the smallest
     */
    public static int rolaAtributo(){
        int soma=0;
        int dado;
        int menorDado=6;

        dado = d6roller();

        soma+=dado;
        if (dado<menorDado){
            menorDado=dado;
        }

        dado = d6roller();

        soma+=dado;
        if (dado<menorDado){
            menorDado=dado;
        }

        dado = d6roller();

        soma+=dado;
        if (dado<menorDado){
            menorDado=dado;
        }

        dado = d6roller();
        soma+=dado;
        if (dado<menorDado){
            menorDado=dado;
        }


        return soma-menorDado;
    }

    /*
    this method does the previous one 6 times, and returns a string with all of them
     */
    public static String gerarAtributos(){

        String atributos = "atrs= ";

        atributos+= Integer.toString(rolaAtributo());
        atributos+= ", ";
        atributos+= Integer.toString(rolaAtributo());
        atributos+= ", ";
        atributos+= Integer.toString(rolaAtributo());
        atributos+= ", ";
        atributos+= Integer.toString(rolaAtributo());
        atributos+= ", ";
        atributos+= Integer.toString(rolaAtributo());
        atributos+= ", ";
        atributos+= Integer.toString(rolaAtributo());

        return atributos;
    }

}
