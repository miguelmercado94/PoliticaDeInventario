package generador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Luis David SAHER
 */
public class pruba {
    public static void main(String [] main){
        Generador caraMoneda = new Generador();
        caraMoneda.addOpcion(1,0.5);
        caraMoneda.addOpcion(2,0.5);
        
        for(int i=0; i<10; i++){
            System.out.println(caraMoneda.generar());
            
        }
        
    }
}
