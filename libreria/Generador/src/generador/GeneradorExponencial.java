/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generador;

import static java.lang.Math.log;
import static java.lang.Math.round;

/**
 *
 * @author Luis David SAHER
 */
public class GeneradorExponencial extends Generador {
    
    private double landa;
    
    public GeneradorExponencial(double landa){
        this.landa = landa;        
    }
    
    /**
     * n es un objeto heredado de la clase Generador, n atravez del metodo generar, genera un numero aleatorio uniforme
     * @return Valor entero que corresponde al redonde del valor aleatorio generado 
     */
    @Override
    public long generar(){
        double p = (-1/landa)*log(this.n.generar());
        long aux = round(p);
        return aux;
    }
    
}
