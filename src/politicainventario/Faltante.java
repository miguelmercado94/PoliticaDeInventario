/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politicainventario;

/**
 *
 * @author miguelangel
 */
public class Faltante {
    private  int costo ;
   private int unidad;
   

   

    public Faltante(int costo,  int unidad) {
        this.costo = costo;
        this.unidad = unidad;
    }
    


   
    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    
}
