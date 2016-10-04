/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componenteMinorista;

/**
 *
 * @author miguelangel
 */
public class ConexionMayorista {
    private String ip ;
    private int puerto ;

    public ConexionMayorista(String ip, int puerto) {
        this.ip = ip;
        this.puerto = puerto;
    }

    public ConexionMayorista() {
        ip="";
        puerto = 0;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getPuerto() {
        return puerto;
    }

    public void setPuerto(int puerto) {
        this.puerto = puerto;
    }
    
}
