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
public abstract class  Generador {
    private ArrayList<Integer> aleatorio ;

    public Generador(ArrayList<Integer> aleatorio) {
        this.aleatorio = aleatorio;
    }

    public Generador() {
         this.aleatorio = new ArrayList<Integer>();
    }

    public ArrayList<Integer> getAleatorio() {
        return aleatorio;
    }

    public void setAleatorio(ArrayList<Integer> aleatorio) {
        this.aleatorio = aleatorio;
    }
    
    public abstract double nextNumero();
}
