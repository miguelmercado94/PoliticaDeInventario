/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios;

/**
 *
 * @author edgar
 */
public class NumerosPseusoaleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Generador g;
        Prueba p;
        //g = new CongruencialMixto(24, 13, 23, 3);
        //g = new CongruencialMultiplicativo(15, 101, 6);
        g =  new CongruencialCuadratico(260, 271, 271, 1000, 131);
        //g = new Fibonacci(g.generar(16), 13, 1, 2, Fibonacci.PRODUCTO);
        //p = new PruebaPromedios();
        //p = new PruebaKolmogorovSmirnov();
        //p = new PruebaFrecuencia(5, 42.5569);
        //p.probarNumeros(g.generarAlt(1000));
        //System.out.println(""+g.generarAlt(1000).toString());
        System.out.println(""+g.siguiente().toString());
    }
    
}
