    package componenteMinorista;


import java.util.ArrayList;
import politicainventario.Inventario;
import politicainventario.Pedido;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguelangel
 */
public class MinoristaHumano extends Minorista {
    private double presupuesto;
    public MinoristaHumano() {
        super();      
    }

    public MinoristaHumano(int cod, ConexionMayorista conexion, int dia) {
        super(cod,conexion,dia);
       
    }
    public MinoristaHumano(int cod, Inventario inventario) {
        super(cod,inventario);
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public Inventario getInventario() {
        return inventario;
    }

    public void setInventario(Inventario inventario) {
        this.inventario = inventario;
    }
    

    @Override
    public void realizarPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
