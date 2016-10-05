package generador;

import aleatorios.CongruencialCuadratico;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis David SAHER
 */
public class Aleatorio {
    private CongruencialCuadratico n;
    
    public Aleatorio(){
        this.n = new CongruencialCuadratico(2611, 2711, 2711, 100000, 1311);        
    }
    
    public double generar(){
        return n.siguienteAlt();
    }
}
