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
public class AleatorioAditivo extends Generador {
    private ArrayList<Integer> secuencia ;
    private int mod;
    private static int numero=1; 

    public AleatorioAditivo(ArrayList<Integer> aleatorio) {
        super(aleatorio);
        mod = aleatorio.get(aleatorio.size()-1);
        secuencia = aleatorio;
        secuencia.remove(aleatorio.size()-1);
    }
    

    public AleatorioAditivo() {
        super();
        secuencia = new ArrayList<Integer>();
        mod = 0;
    }

    public ArrayList<Integer> getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(ArrayList<Integer> secuencia) {
        this.secuencia = secuencia;
    }

    public int getMod() {
        return mod;
    }

    public void setMod(int mod) {
        this.mod = mod;
    }
    
    @Override
    public double nextNumero() {
    double n;
        int num =secuencia.size();
        n = (secuencia.get(num-1)+ secuencia.get(numero))%mod;
        secuencia.add((int)n);
        double mostrar = n/(mod-1);
        numero++;
    return mostrar;
    }
    
}
