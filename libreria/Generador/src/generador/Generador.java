package generador;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis David SAHER
 */
public class Generador {
    private ArrayList numero;
    private ArrayList probabilidad;
    private float probabilidadRestante;
    protected Aleatorio n;
    
    public Generador(){
        this.n = new Aleatorio();
        this.numero = new ArrayList();
        this.probabilidad = new ArrayList();
        this.probabilidadRestante = 1;
    }
    /**
     * 
     * @param num numero opcion
     * @param p probabilidad de elecion del numero
     * @return retorna la probabilidad restante o -1 en caso de no poder completar la accion 
     */
    public float addOpcion(int num, double p){
        if(probabilidadRestante>0){
            if((probabilidadRestante-p)<=1){
                numero.add(num);
                probabilidad.add(p);
                probabilidadRestante-=p;
            }else{
                return -1;
            }            
        }
        return probabilidadRestante;
    }
    /**
     * 
     * @return retorna un numero escogido aleatoriamente entre las opciones o -1 si ningun numero fue escogido
     */
    public long generar(){
        double numAlt = n.generar();
        int pos=0;
        double rango=0;
        try{
            while(rango<1){
            if(pos<probabilidad.size()){
                rango+=(double)probabilidad.get(pos);
                if(numAlt<rango){
                        return (int)numero.get(pos);

                }                
            }
            pos++;
            }
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.toString());
            return generar();
        }       
        return -1;
    } 
}
