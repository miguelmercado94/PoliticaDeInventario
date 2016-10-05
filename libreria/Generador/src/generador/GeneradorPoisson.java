/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generador;

import static java.lang.Math.exp;
import static java.lang.Math.pow;

/**
 *
 * @author Luis David SAHER
 */
public class GeneradorPoisson extends Generador{
    
    private double landa;
    private int k;
    
    public GeneradorPoisson(double landa, int k){
        this.landa = landa;
        this.k = k;
        generarDistribucion(k);
    }
    
    private void generarDistribucion(int k){
        for(int i=0; i<=k; i++){
            super.addOpcion(i, ((exp(-1*landa)*pow(landa,k))/factorial(k)));
        }
        
    }
    
    private int factorial(int num){
        int factorial = 1;
        while(num>0){
            factorial*=num;
            num--;
        } 
        return factorial;
    }
    
}
