/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author edgar
 */
public class CongruencialMultiplicativo implements Generador{
    /* Esta descrito de la forma: 
    x[n+1] = ( a*x[n]) * mod m
    ((this.a*this.x)+this.c)*/
    private Integer a;
    private Integer m;
    private Integer x;

    public CongruencialMultiplicativo(Integer a, Integer m, Integer x) {
        this.a = a;
        this.m = m;
        this.x = x;
    }
    
    @Override
    public List<Integer> generar(Integer cantidad){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(((this.a*this.x)) % this.m);
        for (int i = 0; i < cantidad; i++) {
            numeros.add((((this.a*numeros.get(i)))%this.m));
        }
        this.x = numeros.get(numeros.size()-1);
        return numeros;
    }

    @Override
    public List<Double> generarAlt(Integer cantidad) {
        List<Integer> numeros = generar(cantidad);
        List<Double> lista = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            lista.add((double)numeros.get(i)/this.m);
        }
        return lista;
    }

    @Override
    public Integer siguiente() {
        this.x = (((this.a*this.x)) % this.m);
        return this.x;
    }

    @Override
    public Double siguienteAlt() {
        this.x = (((this.a*this.x)) % this.m);
        return (double) this.x/this.m;
    }
}
