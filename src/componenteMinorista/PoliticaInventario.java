package componenteMinorista;



import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import inventario.modelo.IMayorista;
import java.lang.reflect.Type;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import inventario.modelo.Orden;
import vistas.VistaPrincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author miguelangel
 */
public class PoliticaInventario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws RemoteException  {
     
   // Minorista minorista = new MinoristaHumano();
    new VistaPrincipal().setVisible(true);
    

    }
    
}
