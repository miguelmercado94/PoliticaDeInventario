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
public class Pedido {

private   int costo;
private int cuantordenar ;
private int diadeespera ;
private boolean estado ;


    public Pedido() {
         diadeespera = 0;
         cuantordenar = 0; 
         costo = 0;
         estado=false;
     
    }

    public Pedido(int costo, int cuantordenar, int diadeespera, boolean estado) {
        this.costo = costo;
        this.cuantordenar = cuantordenar;
        this.diadeespera = diadeespera;
        this.estado = estado;
    }
    
 public Pedido(int diadeespera, int cuantordenar,boolean estado) {
        this.diadeespera=diadeespera; 
         this.cuantordenar = cuantordenar; 
         this.estado= estado;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public boolean getEstado() {
        return estado;
    }

    public  int getCosto() {
        return costo;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getDiadeespera() {
        return diadeespera;
    }

    public void setDiadeespera(int diadeespera) {
        this.diadeespera = diadeespera;
    }

   

    public int getCuantordenar() {
        return cuantordenar;
    }

    public void setCuantordenar(int cantordenar) {
        this.cuantordenar = cantordenar;
    }

  
 
//public int invFinal(int inveincial, int demanda){
//return 0;
//}
}
