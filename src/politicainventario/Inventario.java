/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politicainventario;

import java.util.ArrayList;

/**
 *
 * @author miguelangel
 */
public class Inventario {
    private int inventario;
    private  int puntoR;
    private  int cantidadQ;
    private static final int  costoInventario = 52;
    private ArrayList<Faltante> faltante = new ArrayList<Faltante>();
    private ArrayList<Pedido> orden = new ArrayList<Pedido>();
    private ArrayList<Pedido> pedido = new ArrayList<Pedido>();
    


    public Inventario() {
        cantidadQ=0;
        puntoR=0;
        inventario=0;
    }
   public Inventario (int r , int q , int inventario){
       puntoR=r;
       cantidadQ =q;
       this.inventario=inventario;
   }
   public Inventario (int inventario){
   this.inventario=inventario;
   puntoR=0;
   cantidadQ=0;
   }
   public Inventario (Inventario i){
    this.inventario = i.getInventario();
    this.puntoR=i.getPuntoR();
    this.cantidadQ=i.getCantidadQ();
    faltante = i.getFaltante();
    orden = i.getOrden();
    pedido = i.getPedido();

}

    public int getInventario() {
        return inventario;
    }

    public void setInventario(int inventario) {
        this.inventario = inventario;
    }

    public int getPuntoR() {
        return puntoR;
    }

    public void setPuntoR(int puntoR) {
        this.puntoR = puntoR;
    }

    public int getCantidadQ() {
        return cantidadQ;
    }

    public void setCantidadQ(int cantidadQ) {
        this.cantidadQ = cantidadQ;
    }

    public ArrayList<Faltante> getFaltante() {
        return faltante;
    }

    public void setFaltante(ArrayList<Faltante> faltante) {
        this.faltante = faltante;
    }

    public ArrayList<Pedido> getOrden() {
        return orden;
    }

    public void setOrden(ArrayList<Pedido> orden) {
        this.orden = orden;
    }

    public ArrayList<Pedido> getPedido() {
        return pedido;
    }

    public void setPedido(ArrayList<Pedido> pedido) {
        this.pedido = pedido;
    }
    
   
}
