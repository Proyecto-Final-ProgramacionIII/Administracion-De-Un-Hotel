/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultas;

import clases.MySqlConn;
import hotel.P7_Consulta_Menu;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class P7_Consulta_911 extends javax.swing.JFrame {

    /**
     * Creates new form P7_Consulta_911
     */
    MySqlConn conn = new MySqlConn();

    public P7_Consulta_911() {
        initComponents();
        this.jScrollPane1.setOpaque(false);
        this.jScrollPane1.getViewport().setOpaque(false);
        this.jTable1.setOpaque(false);
        ((DefaultTableCellRenderer) this.jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
        jTable1.getTableHeader().setFont(new java.awt.Font("Time New Roman", Font.BOLD, 12));
        jTable1.getTableHeader().repaint();
        imagen();
    }

    public void imagen() {
        ImageIcon icono = new ImageIcon("src/imagenes/galeria/a6.png");
        JLabel imagen = new JLabel();
        imagen.setBounds(0, 0, 400, 320);
        imagen.setIcon(new ImageIcon(icono.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));

        jPanelFondo.add(imagen);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Habitaciones ocupadas por piso");
        setPreferredSize(new java.awt.Dimension(400, 320));

        jPanelFondo.setPreferredSize(new java.awt.Dimension(400, 300));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Habitaciones ocupadas por piso");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTable1MouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(74, 74, 74))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jMenu1.setText("Escoger piso");

        jMenuItem1.setText("Piso 1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Piso 2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Limpiar");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        piso1();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
        this.jTable1.setForeground(Color.BLACK);
        this.jScrollPane1.setOpaque(true);
        this.jScrollPane1.getViewport().setOpaque(true);
        this.jTable1.setOpaque(true);
        ((DefaultTableCellRenderer) this.jTable1.getDefaultRenderer(Object.class)).setOpaque(true);
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseExited
        // TODO add your handling code here:
        this.jTable1.setForeground(Color.WHITE);
        this.jScrollPane1.setOpaque(false);
        this.jScrollPane1.getViewport().setOpaque(false);
        this.jTable1.setOpaque(false);
        ((DefaultTableCellRenderer) this.jTable1.getDefaultRenderer(Object.class)).setOpaque(false);
    }//GEN-LAST:event_jTable1MouseExited

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        piso2();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new P7_Consulta_Menu().setVisible(true);
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        this.dispose();
        new P7_Consulta_Menu().setVisible(true);
    }//GEN-LAST:event_jMenu3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(P7_Consulta_911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P7_Consulta_911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P7_Consulta_911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P7_Consulta_911.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P7_Consulta_911().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void piso1() {
        this.eliminar();
        String c = "1";
        String query = "select * from habitaciones where Piso = " + "'" + c + "'" + " and Disponibilidad = " + "'" + 0 + "'";
        this.conn.Consult(query);
        int x = 0, num[] = new int[15];
        try {
            this.conn.rs.last();
            x = this.conn.rs.getRow();//numero de hab ocupadas
            this.conn.rs.first();
        } catch (SQLException ex) {
            System.out.println("1");
            Logger.getLogger(P7_Consulta_9.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (x != 0) {
            Object datos[][] = new Object[x][4];
            for (int i = 0; i < x; i++) {
                try {
                    num[i] = this.conn.rs.getInt(1);//obtengo el numero de habitacion
                    this.conn.rs.next();
                } catch (SQLException ex) {
                    System.out.println("2");
                    Logger.getLogger(P7_Consulta_9.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            for (int i = 0; i < x; i++) {
                query = "select * from clientes where NHabitacion = " + "'" + num[i] + "'";//busco en tabla clientes el nuemero de hab
                this.conn.Consult(query);
                try {//obtengo los datos y los guardo
                    datos[i][0] = this.conn.rs.getString(1);
                    datos[i][2] = this.conn.rs.getString(6);
                    datos[i][3] = this.conn.rs.getString(7);
                    datos[i][1] = this.conn.rs.getInt(9);
                    this.conn.rs.next();
                } catch (SQLException ex) {
                    System.out.println("4");
                    Logger.getLogger(P7_Consulta_911.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            String cl[] = {"Nombre", "N° habitacion", "Fecha ingreso", "Fecha salida"};
            jTable1.setModel(new DefaultTableModel(datos, cl));

        } else {
            JOptionPane.showMessageDialog(null, "Sin habitaciones ocupadas en este piso", "Habitaciones disponible", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
    private void piso2() {this.eliminar();
        String c = "2";
        String query = "select * from habitaciones where Piso = " + "'" + c + "'" + " and Disponibilidad = " + "'" + 0 + "'";
        this.conn.Consult(query);
        int x = 0, num[] = new int[15];
        try {
            this.conn.rs.last();
            x = this.conn.rs.getRow();//numero de hab ocupadas
            this.conn.rs.first();
        } catch (SQLException ex) {
            System.out.println("1");
            Logger.getLogger(P7_Consulta_9.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (x != 0) {
            Object datos[][] = new Object[x][4];
            for (int i = 0; i < x; i++) {
                try {
                    num[i] = this.conn.rs.getInt(1);//obtengo el numero de habitacion
                    this.conn.rs.next();
                } catch (SQLException ex) {
                    System.out.println("2");
                    Logger.getLogger(P7_Consulta_9.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            for (int i = 0; i < x; i++) {
                query = "select * from clientes where NHabitacion = " + "'" + num[i] + "'";//busco en tabla clientes el nuemero de hab
                this.conn.Consult(query);
                try {//obtengo los datos y los guardo
                    datos[i][0] = this.conn.rs.getString(1);
                    datos[i][2] = this.conn.rs.getString(6);
                    datos[i][3] = this.conn.rs.getString(7);
                    datos[i][1] = this.conn.rs.getInt(9);
                    this.conn.rs.next();
                } catch (SQLException ex) {
                    System.out.println("4");
                    Logger.getLogger(P7_Consulta_911.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

            String cl[] = {"Nombre", "N° habitacion", "Fecha ingreso", "Fecha salida"};
            jTable1.setModel(new DefaultTableModel(datos, cl));

        } else {
            JOptionPane.showMessageDialog(null, "Sin habitaciones ocupadas en este piso", "Habitaciones disponible", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void eliminar() {
        DefaultTableModel tb = (DefaultTableModel) this.jTable1.getModel();
        int a = this.jTable1.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }
}
