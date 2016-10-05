/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

import java.util.ArrayList;

/**
 *
 * @author miguelangel
 */
public class CongruencialMultiplicativo extends Generador {
    private int a;
    private int c;
    private double semilla;
    private double mod;

    public CongruencialMultiplicativo( ArrayList<Integer> aleatorio) {
        super(aleatorio);
        this.a = aleatorio.get(0);
        this.c = aleatorio.get(1);
        this.semilla = aleatorio.get(2);
        this.mod = aleatorio.get(3);
    }

    public CongruencialMultiplicativo() {
        super();
        this.a = 0;
        this.c = 0;
        this.semilla = 0;
        this.mod = 0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getSemilla() {
        return semilla;
    }

    public void setSemilla(double semilla) {
        this.semilla = semilla;
    }

    public double getMod() {
        return mod;
    }

    public void setMod(double mod) {
        this.mod = mod;
    }
    
    
    @Override
    public double nextNumero() {
            double num=0.0;
            semilla=((a*semilla)+c)%mod;
            num = semilla /mod;
            return num;
    }
    
}
