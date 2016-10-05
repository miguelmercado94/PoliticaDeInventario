/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import com.google.gson.Gson;
import componenteMinorista.MinoristaHumano;
import inventario.modelo.IMayorista;
import inventario.modelo.Orden;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import politicainventario.Cliente;
import politicainventario.Faltante;
import politicainventario.Pedido;

/**
 *
 * @author miguelangel
 */
public class VistaMinoristaHumano extends javax.swing.JFrame {
    
    private IMayorista servidor = null;
    private MinoristaHumano minorista;
    private Cliente cliente = new Cliente(); 
    Thread hilo;
    
    public VistaMinoristaHumano() {
        initComponents();
        minorista = new MinoristaHumano();
    }
    
    public VistaMinoristaHumano(VistaMinoristaHumano vista) {
        initComponents();
        
    }
    
    public VistaMinoristaHumano(MinoristaHumano minoristaH) throws RemoteException {
        initComponents();
        this.minorista = minoristaH;
        try {
            Registry registro = LocateRegistry.getRegistry(this.minorista.getConexion().getIp(), this.minorista.getConexion().getPuerto());
            servidor = (IMayorista) registro.lookup("Mayorista");
        } catch (RemoteException ex) {
            Logger.getLogger(VistaMinoristaHumano.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NotBoundException ex) {
            Logger.getLogger(VistaMinoristaHumano.class.getName()).log(Level.SEVERE, null, ex);
        }
        jLDia.setText("Dia " + minorista.getDia());
        jLPresupuesto.setText("" + this.minorista.getPresupuesto());
        jLInvI.setText("" + minorista.getInventario().getInventario());
        desactivarElementos();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLDia = new javax.swing.JLabel();
        jLInvI = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLPresupuesto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtpedido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePedido = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableOrden = new javax.swing.JTable();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLDia.setText("Dia de servicio");

        jLInvI.setText("0");

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel6.setText("Minorista Humano");

        jLPresupuesto.setText("0");

        jLabel1.setText("Presupuesto $");

        jLabel2.setText("Inv. Actual:");

        jButton1.setText("Hacer pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Pedido");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(txtpedido, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        jLabel7.setText("Ordenes");

        jLabel8.setText("Cantidad");

        jLabel9.setText("Precio");

        jLabel10.setText("Dia de espera");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel3.setText("ultima orden Realizada");

        jLabel20.setText("Cantidad");

        jLabel21.setText("Precio");

        jLabel22.setText("Dia de espera");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(51, 51, 51))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(39, 39, 39))
                                .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel22))
                .addContainerGap())
        );

        jLabel11.setText("Pedidos");

        jLabel12.setText("Cantidad");

        jLabel13.setText("Precio");

        jLabel14.setText("Dia de espera");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel5.setText("ultimo pedido atendido");

        jLabel17.setText("Cantidad");

        jLabel18.setText("Precio");

        jLabel19.setText("Dia de espera");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 13, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 46, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(174, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("General", jPanel4);

        jTablePedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "precio de venta", "demanda", "No Atendidos", "Dia de espera"
            }
        ));
        jScrollPane1.setViewportView(jTablePedido);

        jTableOrden.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "precio compra", "precio de orden", "cantidad", "tiempo de espera"
            }
        ));
        jScrollPane2.setViewportView(jTableOrden);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel15.setText("Ordenes Realizadas");

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel16.setText("Pedidos Atendidos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(291, 291, 291))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(289, 289, 289))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Informacion Financiera", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLDia)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 568, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addContainerGap(24, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(169, 169, 169)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(536, 536, 536)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLInvI)
                                    .addComponent(jLPresupuesto))
                                .addContainerGap(32, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDia)
                    .addComponent(jLabel2)
                    .addComponent(jLInvI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLPresupuesto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cargarDatos();
         hilo = new Thread() {
            @Override
            public void run() {
                super.run();                
                while (true) {
                    try {
                        if (minorista.getDia() < servidor.obtenerDia()) {
                            try {
                                minorista.setDia(servidor.obtenerDia());
                                jLDia.setText("Dia " + minorista.getDia());
                                
                            } catch (Exception ex) {
                            }
                            for (int i = 0; i < minorista.getInventario().getOrden().size(); i++) {
                                
                                if ((minorista.getInventario().getOrden().get(i).getEstado())) {
                                    if (minorista.getInventario().getOrden().get(i).getDiadeespera() == 0) {
                                        minorista.getInventario().getOrden().get(i).setEstado(false);
                                        minorista.getInventario().setInventario(minorista.getInventario().getInventario() + minorista.getInventario().getOrden().get(i).getCuantordenar());
                                        
                                        jLInvI.setText("" + minorista.getInventario().getInventario());
                                        break;
                                    }
                                    if (minorista.getInventario().getOrden().get(i).getDiadeespera() > 0) {
                                        minorista.getInventario().getOrden().get(i).setDiadeespera(minorista.getInventario().getOrden().get(i).getDiadeespera() - 1);
                                        
                                        break;
                                    }
                                }
                            }
                            int cont = 0;
                            for (int i = 0; i < minorista.getInventario().getPedido().size(); i++) {
                                if ((minorista.getInventario().getPedido().get(i).getEstado())) {
                                    if (minorista.getInventario().getPedido().get(i).getDiadeespera() == 0) {
                                        minorista.getInventario().getPedido().get(i).setEstado(false);
                                        minorista.getInventario().setInventario(minorista.getInventario().getInventario() - minorista.getInventario().getPedido().get(i).getCuantordenar());
                                        cont = 1;
                                        accionesDelCliente();
                                        break;
                                    } else {
                                        if (minorista.getInventario().getPedido().get(i).getDiadeespera() > 0) {
                                            minorista.getInventario().getPedido().get(i).setDiadeespera(minorista.getInventario().getPedido().get(i).getDiadeespera() - 1);
                                        }
                                        break;
                                    }
                                }
                            }
                            if (cont == 0) {
                                accionesDelCliente();
                            } 
                            
                        }
                        cargarDatos();
                    } catch (RemoteException ex) {
                        Logger.getLogger(VistaMinoristaHumano.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
                
            }
            
        };
        hilo.start();
        activarElementos();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void cargarDatos() {
        Pedido pedido1 = new Pedido();
        Pedido pedido2 = new Pedido();
        try {
            pedido1 = minorista.getInventario().getOrden().get(minorista.getInventario().getOrden().size() - 1);
        } catch (Exception ex) {
        }
        try {
            pedido2 = minorista.getInventario().getPedido().get(minorista.getInventario().getPedido().size() - 1);
        } catch (Exception ex) {
        }        
        jLabel8.setText("" + pedido1.getCuantordenar());
        jLabel9.setText("" + (pedido1.getCuantordenar() * 5));
        jLabel10.setText("" + pedido1.getDiadeespera());
        jLabel12.setText("" + pedido2.getCuantordenar());
        jLabel13.setText("" + (pedido2.getCuantordenar() * 7));
        jLabel14.setText("" + pedido2.getDiadeespera());
    }
    
    private void accionesDelCliente() {
        int demanda = cliente.generaDemanda();        
        if (demanda <= minorista.getInventario().getInventario()) {
            minorista.getInventario().getPedido().add(new Pedido(0, demanda, 0, false));
            minorista.setPresupuesto(minorista.getPresupuesto() + demanda * 7);
            minorista.getInventario().setInventario(minorista.getInventario().getInventario() - demanda);
            jLPresupuesto.setText("" + minorista.getPresupuesto());
            jLInvI.setText("" + minorista.getInventario().getInventario());
        } else {
            int aux = 0;
            for (int i = 0; i < minorista.getInventario().getOrden().size(); i++) {
                if ((minorista.getInventario().getOrden().get(i).getEstado())) {
                    if ((minorista.getInventario().getOrden().get(i).getCuantordenar() + minorista.getInventario().getInventario()) >= demanda) {
                        if (cliente.confirmaEspera(minorista.getInventario().getOrden().get(i).getDiadeespera())) {
                            minorista.getInventario().getPedido().add(new Pedido(0, demanda, minorista.getInventario().getOrden().get(i).getDiadeespera(), true));
                            minorista.getInventario().getFaltante().add(new Faltante(1, (demanda - minorista.getInventario().getInventario())));
                            minorista.setPresupuesto(minorista.getPresupuesto() + (demanda * 7));
                            aux=1;
                        } else {
                            minorista.getInventario().getPedido().add(new Pedido(0, demanda, -1, false));
                            minorista.getInventario().getFaltante().add(new Faltante(2, demanda));
                            minorista.setPresupuesto(minorista.getPresupuesto()-(2*demanda));
                            minorista.getInventario().setInventario(minorista.getInventario().getInventario()-demanda);
                           aux=1;
                        }
                    } 
                     break;
                }
            }
                 if (aux==0) {
                            minorista.getInventario().getPedido().add(new Pedido(0, demanda, -1, false));
                            minorista.getInventario().getFaltante().add(new Faltante(2, demanda)); 
                            minorista.setPresupuesto(minorista.getPresupuesto()-(2*demanda));
                            minorista.getInventario().setInventario(minorista.getInventario().getInventario()-demanda);
                            if(minorista.getPresupuesto()<=0){
                            JOptionPane.showMessageDialog(null, "Usted A quedado en quiebra");
                            hilo.stop();
                            }
                        } 
                        
            jLPresupuesto.setText("" + minorista.getPresupuesto());
            jLInvI.setText("" + minorista.getInventario().getInventario());
        }
        
        rellenarTablaPedido(minorista.getInventario().getPedido());
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int cantidad = Integer.parseInt(txtpedido.getText());
            if ((cantidad * 5) + ((50 + (cantidad * 0.2))) > minorista.getPresupuesto()) {
                JOptionPane.showMessageDialog(null, "No posee el capital suficiente para la compra");
            } else {
                int seleccion = JOptionPane.QUESTION_MESSAGE;
                String info = "";
                info = servidor.hacerPedido(cantidad, minorista.getCod());
                Gson gson = new Gson();
                Orden ord = gson.fromJson(info, Orden.class);
                seleccion = JOptionPane.showOptionDialog(null, "   Tiempo de espera " + ord.getDiasEspera() + " Dias"
                        + " \nDesea Confirmar el pedido pedido", "Confirmar", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
                if (seleccion == JOptionPane.YES_OPTION) {
                    try {
                        servidor.aceptarOrden(minorista.getCod());
                    } catch (RemoteException ex) {
                        Logger.getLogger(VistaMinoristaHumano.class.getName()).log(Level.SEVERE, null, ex);
                        System.out.println(ex.toString());
                    }
                    minorista.getInventario().getOrden().add(new Pedido(50 + (cantidad * 0.2), cantidad, ord.getDiasEspera(), true));
                    minorista.setPresupuesto(minorista.getPresupuesto() - (cantidad * 5) - (50 + (cantidad * 0.2)));
                    jLPresupuesto.setText("" + minorista.getPresupuesto());
                    rellenarTablaOrden(minorista.getInventario().getOrden());
                } else {
                    txtpedido.setText("");
                }
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
            JOptionPane.showMessageDialog(null, "No a ingresado un numero de unidades valido");
        }
        txtpedido.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed
    private void rellenarTablaOrden(ArrayList<Pedido> ord) {
        Object[][] datos = new Object[ord.size()][5];
        for (int i = 0; i < ord.size(); i++) {
            datos[i][0] = ord.get(i).getCuantordenar() * 5;
            datos[i][1] = ord.get(i).getCosto();
            datos[i][2] = ord.get(i).getCuantordenar();
            datos[i][3] = ord.get(i).getDiadeespera();
        }
        
        jTableOrden.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Precio Compra", "Precio de orden", "cantidad", "tiempo de espera"
                }));
        DefaultTableModel temp = (DefaultTableModel) jTableOrden.getModel();
        for (int i = 0; i < ord.size(); i++) {
            temp.addRow(datos[i]);
        }
    }
    
    private void rellenarTablaPedido(ArrayList<Pedido> pedido) {
        Object[][] datos = new Object[pedido.size()][5];        
        for (int i = 0; i < pedido.size(); i++) {
            datos[i][0] = pedido.get(i).getCuantordenar() * 7;
            datos[i][1] = pedido.get(i).getCuantordenar();
            datos[i][2] = pedido.get(i).getEstado();
            datos[i][3] = pedido.get(i).getDiadeespera();
        }
        jTablePedido.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Precio de venta", "demanda", "No Atendidos", "Dia de espera"
                }));
        DefaultTableModel temp = (DefaultTableModel) jTablePedido.getModel();
        for (int i = 0; i < pedido.size(); i++) {
            temp.addRow(datos[i]);
        }
    }
    
    private void activarElementos() {
        jLabel18.setEnabled(true);
        jLabel19.setEnabled(true);
        jLabel17.setEnabled(true);
        jLabel20.setEnabled(true);
        jLabel22.setEnabled(true);
        jLabel21.setEnabled(true);
        jLabel4.setEnabled(true);
        txtpedido.setEnabled(true);
        jButton1.setEnabled(true);
        jLabel7.setEnabled(true);
        jLabel8.setEnabled(true);
        jLabel9.setEnabled(true);
        jLabel10.setEnabled(true);
        jLabel11.setEnabled(true);
        jLabel12.setEnabled(true);
        jLabel13.setEnabled(true);
        jLabel14.setEnabled(true);
    }
    
    private void desactivarElementos() {
        jLabel18.setEnabled(false);
        jLabel19.setEnabled(false);
        jLabel17.setEnabled(false);
        jLabel20.setEnabled(false);
        jLabel22.setEnabled(false);
        jLabel21.setEnabled(false);
        jLabel4.setEnabled(false);
        txtpedido.setEnabled(false);
        jButton1.setEnabled(false);
        jLabel7.setEnabled(false);
        jLabel8.setEnabled(false);
        jLabel9.setEnabled(false);
        jLabel10.setEnabled(false);
        jLabel11.setEnabled(false);
        jLabel12.setEnabled(false);
        jLabel13.setEnabled(false);
        jLabel14.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLDia;
    private javax.swing.JLabel jLInvI;
    private javax.swing.JLabel jLPresupuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableOrden;
    private javax.swing.JTable jTablePedido;
    private javax.swing.JTextField txtpedido;
    // End of variables declaration//GEN-END:variables
}
