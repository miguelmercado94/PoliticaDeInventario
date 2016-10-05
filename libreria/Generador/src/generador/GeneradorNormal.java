/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generador;

/**
 *
 * @author Luis David SAHER
 */
public class GeneradorNormal extends Generador{
    
    private double media;
    private double desviacion;
    
    public GeneradorNormal(double media, double desviacion){
        this.desviacion = desviacion;
        this.media = media;
    }
    
    @Override
    public long generar(){
        
        int suma=0;
        
        for(int i=0; i<12; i++){
            suma+=this.n.generar();
        }
        
        return (long)(media + desviacion*(suma - 6));
    }
    
}
