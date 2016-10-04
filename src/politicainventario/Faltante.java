/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package politicainventario;

/**
 *
 * @author miguelangel
 */
public class Faltante {
    private static final int costonoespera = 50;
    private static final int costoespera = 20;
    private int diaespera;
    private int unidad;
    private boolean espera;

    public Faltante(int diaespera, int unidad) {
        this.diaespera = diaespera;
        this.unidad = unidad;
    }
 public Faltante(int diaespera, int unidad,boolean espera) {
        this.diaespera = diaespera;
        this.unidad = unidad;
        this.espera=espera;
    }
    public Faltante() {
        diaespera=0;
        unidad=0;
    }

    public int getDiaespera() {
        return diaespera;
    }

    public void setDiaespera(int diaespera) {
        this.diaespera = diaespera;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    public boolean getEspera() {
        return espera;
    }

    public void setEspera(boolean espera) {
        this.espera = espera;
    }
    public int costoFaltante(){
        if(espera==true){
        return unidad* costoespera;
        }else{
        return unidad*costonoespera;
        }
    }
    
}
