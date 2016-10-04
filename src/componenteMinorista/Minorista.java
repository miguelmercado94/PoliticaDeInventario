package componenteMinorista;


import politicainventario.Inventario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author miguelangel
 */
public abstract class Minorista {
    protected int dia;
    protected int cod ;
    protected Inventario inventario;
    protected ConexionMayorista conexion;
    public Minorista(){
    cod = 0;
    dia = 0;
    this.inventario=new Inventario();
    this.conexion= new ConexionMayorista();
    inventario=null;
    }
    public Minorista(int cod, ConexionMayorista conexion, int dia){
   this.conexion = conexion;
   this.cod = cod;
   this.inventario=new Inventario();
   this.dia = dia;
    }
    public Minorista (int cod, Inventario inventario){
    this.cod=cod;
    this.inventario=inventario;
    this.conexion= new ConexionMayorista();
    }

    public ConexionMayorista getConexion() {
        return conexion;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setConexion(ConexionMayorista conexion) {
        this.conexion = conexion;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    
    public abstract void realizarPedido();
}
