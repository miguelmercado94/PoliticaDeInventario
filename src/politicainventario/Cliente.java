/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politicainventario;

import generador.Generador;
import java.util.ArrayList;
import generadores.AleatorioAditivo;


/**
 *
 * @author miguelangel
 */
public class Cliente {
    private static final int[] tiempoEspera={0,1,2,3,4};
     private  ArrayList<Integer> secuencia ; 
    AleatorioAditivo auxFaltante;
    ArrayList<Pedido> pedidos =  new ArrayList<Pedido>();
    private Generador demanda;
    private Generador espera;

    public Cliente() {
        
        secuencia =  new ArrayList<Integer>();
        secuencia.add(368);
        secuencia.add(213);
        secuencia.add(341);
        secuencia.add(123);
        secuencia.add(32);
        secuencia.add(637);
        secuencia.add(289);
        secuencia.add(566);
        secuencia.add(121);
        secuencia.add(3647);
        auxFaltante = new AleatorioAditivo(secuencia);
        demanda = new Generador();
        espera = new Generador();  
        inicializar();
//        
    }
    
    private void inicializar(){
        demanda.addOpcion(25, 0.02);
        demanda.addOpcion(26, 0.04);
        demanda.addOpcion(27, 0.03);
        demanda.addOpcion(28, 0.12);
        demanda.addOpcion(29, 0.2);
        demanda.addOpcion(30, 0.24);
        demanda.addOpcion(31, 0.15);
        demanda.addOpcion(32, 0.10);
        demanda.addOpcion(33, 0.05);
        demanda.addOpcion(34, 0.02);
        
        espera.addOpcion(0, 0.25);
        espera.addOpcion(1, 0.25);
        espera.addOpcion(2, 0.1);
        espera.addOpcion(3, 0.2);
        espera.addOpcion(4, 0.3);
        
        
    }
    
    public int generaDemanda(){
//         int[] demanda1 = {25,26,27,28,29,30,31,32,33,34};
//        double[] prodemanda ={0.02,0.04,0.06,0.12,0.20,0.24,0.15,0.10,0.05,0.02};
//        double num = auxFaltante.nextNumero();
//        double cont =0;
//        int elegido=0;
//       for(int i=0;i<10;i++){
//       if((num>=cont)&&(num<(cont+prodemanda[i]))){
//       elegido = demanda1[i];
//       cont =0;
//       break;
//       }else{
//       elegido = 0;
//       cont = cont + prodemanda[i];
//       }
//       }
        
        
        return (int)demanda.generar();}
    
    public boolean confirmaEspera(int diaespera ){ 
      
        if(diaespera==0){
        return true;
        }else{
       if(diaespera> generaEspera()){
       return false;
       }else{
        return true;
       }
        }
    }
    private int generaEspera(){
//        double[]proTiempoEspera = {0.40,0.20,0.15,0.15,0.10};
//         int[] tiempoEspera={0,1,2,3,4};
//        double num = auxFaltante.nextNumero();
//        double cont =0;
//        int elegido=0;
//       for(int i=0;i<4;i++){
//       if((num>=cont)&&(num<(cont+proTiempoEspera[i]))){
//       elegido = tiempoEspera[i];
//       cont =0;
//       break;
//       }else{
//       elegido = 0;
//       cont = cont + proTiempoEspera[i];
//       }
//       }
        
    return (int)espera.generar();
    }
}
