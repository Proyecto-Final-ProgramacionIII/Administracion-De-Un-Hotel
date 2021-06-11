/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import clases.MySqlConn;
import java.awt.Color;
import java.awt.Image;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class P6_Check_Out extends javax.swing.JFrame {

    /**
     * Creates new form P6_Check_Out
     */
    MySqlConn conn = new MySqlConn();
    
    public P6_Check_Out(MySqlConn conn){
        this.conn = conn;
        initComponents();
        imagen();
    }
    public P6_Check_Out() {
        initComponents();
        imagen();
    }
    public void imagen(){
        ImageIcon icono = new ImageIcon("src/imagenes/sal.png");
        JLabel imagen = new JLabel();
        imagen.setBounds(0,0,380,450);
        imagen.setIcon(new ImageIcon(icono.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH) ));
       
        jPanelFondo.add(imagen);
        this.jLabelDias.setText("");
        this.jLabelPex.setText("");
        this.jLabel7.setText("");
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNHab = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabelDias = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelPex = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBoxCuarto = new javax.swing.JCheckBox();
        jCheckBoxbar = new javax.swing.JCheckBox();
        jCheckBoxtinto = new javax.swing.JCheckBox();
        jCheckBoxSpa = new javax.swing.JCheckBox();
        jCheckBoxLav = new javax.swing.JCheckBox();
        jCheckBoxGym = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Salida de cliente");
        setPreferredSize(new java.awt.Dimension(380, 450));

        jPanelFondo.setBackground(new java.awt.Color(204, 204, 204));
        jPanelFondo.setPreferredSize(new java.awt.Dimension(380, 450));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("Salida del Cliente");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setText("Numero de habitacion:");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jTextFieldNHab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNHabActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Buscar");
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Dias de estancia: ");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        jLabelDias.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelDias.setText("10");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Personas extra: ");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        jLabelPex.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabelPex.setText("10");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Cargos extra");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        jCheckBoxCuarto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxCuarto.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxCuarto.setText("Servicio al cuarto      ($450)");
        jCheckBoxCuarto.setContentAreaFilled(false);
        jCheckBoxCuarto.setEnabled(false);
        jCheckBoxCuarto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBoxCuartoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxCuartoMouseExited(evt);
            }
        });

        jCheckBoxbar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxbar.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxbar.setText("Servicio de bar           ($580)");
        jCheckBoxbar.setContentAreaFilled(false);
        jCheckBoxbar.setEnabled(false);
        jCheckBoxbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBoxbarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxbarMouseExited(evt);
            }
        });
        jCheckBoxbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxbarActionPerformed(evt);
            }
        });

        jCheckBoxtinto.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxtinto.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxtinto.setText("Servicio tintorería     ($390)");
        jCheckBoxtinto.setContentAreaFilled(false);
        jCheckBoxtinto.setEnabled(false);
        jCheckBoxtinto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBoxtintoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxtintoMouseExited(evt);
            }
        });

        jCheckBoxSpa.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxSpa.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxSpa.setText("Servicio de SPA         ($630)");
        jCheckBoxSpa.setContentAreaFilled(false);
        jCheckBoxSpa.setEnabled(false);
        jCheckBoxSpa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBoxSpaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxSpaMouseExited(evt);
            }
        });

        jCheckBoxLav.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxLav.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxLav.setText("Servicio lavandería    ($350)");
        jCheckBoxLav.setContentAreaFilled(false);
        jCheckBoxLav.setEnabled(false);
        jCheckBoxLav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBoxLavMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxLavMouseExited(evt);
            }
        });

        jCheckBoxGym.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jCheckBoxGym.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxGym.setText("GYM                            ($400)");
        jCheckBoxGym.setContentAreaFilled(false);
        jCheckBoxGym.setEnabled(false);
        jCheckBoxGym.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jCheckBoxGymMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jCheckBoxGymMouseExited(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Confirmar pago");
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Tipo de habitacion");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Sencilla");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Regresar");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel1))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelPex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jTextFieldNHab, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel7))))))
                    .addComponent(jCheckBoxCuarto)
                    .addComponent(jCheckBoxbar)
                    .addComponent(jCheckBoxtinto)
                    .addComponent(jCheckBoxSpa)
                    .addComponent(jCheckBoxLav)
                    .addComponent(jCheckBoxGym)))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(jButton5))
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jButton1))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelDias)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelPex)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBoxCuarto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxbar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxtinto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxSpa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxLav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxGym)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNHabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNHabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNHabActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setContentAreaFilled(true);
        jButton4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setContentAreaFilled(false);
        jButton4.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String tipo = null;
        int n = 0,nper = 0,dias = 0;
        if(this.jTextFieldNHab.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"No seleccionaste ninguna habitacion", "Numero de habitacion vacio", JOptionPane.ERROR_MESSAGE);
        }else{
            String query = "select * from clientes where NHabitacion = "+"'"+this.jTextFieldNHab.getText().trim()+"'";
            this.conn.Consult(query);
            try {
                n = this.conn.rs.getRow();
            } catch (SQLException ex) {
                System.out.println("Error#1...");
            }
            if(n != 0){
                try {
                    tipo = this.conn.rs.getString(2);
                    nper = this.conn.rs.getInt(4);
                    dias = this.conn.rs.getInt(5);
                } catch (SQLException ex) {
                    System.out.println("Error#1...");
                }
                oncheck();//activa los jcheckbox
                this.jLabelDias.setText(" "+dias+" ");
                if("Sencilla".equals(tipo)){
                    if(nper == 1)
                        this.jLabelPex.setText(" 0 ");
                    else{
                        int a = nper - 1;
                        this.jLabelPex.setText(" "+a+" ");
                    }
                }
                if("Doble".equals(tipo)){
                    if(nper == 2)
                        this.jLabelPex.setText(" 0 ");
                    else{
                        int a = nper - 2;
                        this.jLabelPex.setText(" "+a+" ");
                    }
                }
                if("Triple".equals(tipo)){
                    if(nper == 3)
                        this.jLabelPex.setText(" 0 ");
                    else{
                        int a = nper - 3;
                        this.jLabelPex.setText(" "+a+" ");
                    }
                }
                this.jLabel7.setText(" "+tipo+" ");
            }else{
                JOptionPane.showMessageDialog(null,"La habitacion buscada no se encuentra ocupada", "Habitacion No Ocupada", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jButton5.setContentAreaFilled(true);
        jButton5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        jButton5.setContentAreaFilled(false);
        jButton5.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String nom = null,tipo = null,cd,ing,sal;
        int n = 0,nper = 0,dias = 0,hos = 0,nhab = 0, ext = 0, tothosDias;
        String extC;
        if(this.jTextFieldNHab.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"No seleccionaste ninguna habitacion", "Numero de habitacion vacio", JOptionPane.ERROR_MESSAGE);
        }else{
            String query = "select * from clientes where NHabitacion = "+"'"+this.jTextFieldNHab.getText().trim()+"'";
        
            this.conn.Consult(query);
            try {
                nom = this.conn.rs.getString(1);//nombre
                tipo = this.conn.rs.getString(2);
                cd = this.conn.rs.getString(3);
                nper = this.conn.rs.getInt(4);
                dias = this.conn.rs.getInt(5);
                ing = this.conn.rs.getString(6);
                sal = this.conn.rs.getString(7);
                hos = this.conn.rs.getInt(8);
                nhab = this.conn.rs.getInt(9);
            } catch (SQLException ex) {
                System.out.println("Error#1...");
            }
            tothosDias = hos * dias;//total de hospedaje = hospedajexdia * dias
            if(this.jCheckBoxCuarto.isSelected()){
                ext = ext + 450;
                extC = "Servicio al cuarto";
            }
            if(this.jCheckBoxGym.isSelected()){
                ext = ext + 400;
                extC = "Servicio de GYM";
            }
            if(this.jCheckBoxLav.isSelected()){
                ext = ext + 350;
                extC = "Servicio de lavanderia";
            }
            if(this.jCheckBoxSpa.isSelected()){
                ext = ext + 630;
                extC = "Servicio de SPA";
            }
            if(this.jCheckBoxbar.isSelected()){
                ext = ext + 580;
                extC = "Servicio de bar";
            }
            if(this.jCheckBoxtinto.isSelected()){
                ext = ext + 390;
                extC = "Servicio de tintorería";
            }
            
            //baja de la tabla clientes
            query = " delete from clientes where Nombre ="+"'"+nom+"'";
            int j = this.conn.Update(query);
            
            if( j > 0)
                JOptionPane.showMessageDialog(null, "El pago fue exitoso, se esta generando tu recibo de pago","PAgo Realizado",JOptionPane.PLAIN_MESSAGE);            
            else
                JOptionPane.showMessageDialog(this, "El pago no se ha podido efectuar","Error de pago",JOptionPane.ERROR_MESSAGE);
        
             //Modificacion de disponibilidad de habitacion a DISPONIBLE
            String c = "1";//cadena que cambia la dispo de la hab
            String cb = "UPDATE habitaciones SET Disponibilidad = '"+c+"' WHERE Numerodehabitacion = "+nhab;//Instruccion SQL de cambio
        
            int f = this.conn.Update(cb);//SE HACE EL CAMBIO DE DISPONIBILIDAD EN LA HABITACION 
            if(f > 0)//segunn valor de retorno se hizo o no la modificacion
                System.out.println("Se modifico la disponibilidad de la habitacion "+nhab);
            else
                System.out.println("No fue posible modificar la disponibilidad de la habitacion "+nhab);
            
            //Guardar ingresos del hotel
            query = "select * from ingresoshotel where Llave = "+"'"+1+"'";
            this.conn.Consult(query);
            int x = 0, ingreso = 0;
            
            try {
                x = this.conn.rs.getRow();
            } catch (Exception e){
                System.out.println("Error#2 ...");
            }
            if(n != 0){
                try {
                    ingreso = this.conn.rs.getInt(2);
                } catch (SQLException ex) {
                    System.out.println("Error#3 ...");
                }
                ingreso = ingreso + (tothosDias + ext);//lo que ya tenia el hotel mas lo que pago este cliente
                query = "UPDATE ingresoshotel set ingresos = '"+ingreso+"' WHERE Llave = "+1;//se actualiza
                int g = this.conn.Update(cb);//SE HACE EL CAMBIO DE DISPONIBILIDAD EN LA HABITACION 
                if(g > 0)//segunn valor de retorno se hizo o no la modificacion
                    System.out.println("Se agrego el nuevo ingreso del hotel ");
                else
                    System.out.println("No fue posible agregar el ingreso del hotel ");
            }else{
                System.out.println("Error al obtener datos de ingreso del hotel");
            }
            //sacmos Fecha
            Date fecha = new Date();
            //System.out.println(f.getDate());
            SimpleDateFormat dFormat = new SimpleDateFormat("dd - MMMMM - YYYY");
            String cadFecha = dFormat.format(fecha);
            
            //se genera el PDF
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
        jLabel5.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        jLabel5.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
        jLabel3.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
        jLabel3.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        // TODO add your handling code here:
        jLabel4.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        // TODO add your handling code here:
        jLabel4.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jCheckBoxbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxbarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxbarActionPerformed

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
         jLabel6.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel6MouseExited

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        // TODO add your handling code here:
        jLabel7.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
         jLabel7.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel7MouseExited

    private void jCheckBoxCuartoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxCuartoMouseEntered
        // TODO add your handling code here:
        this.jCheckBoxCuarto.setForeground(Color.RED);
    }//GEN-LAST:event_jCheckBoxCuartoMouseEntered

    private void jCheckBoxbarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxbarMouseEntered
        // TODO add your handling code here:
        this.jCheckBoxbar.setForeground(Color.RED);
    }//GEN-LAST:event_jCheckBoxbarMouseEntered

    private void jCheckBoxtintoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxtintoMouseEntered
        // TODO add your handling code here:
        this.jCheckBoxtinto.setForeground(Color.RED);
    }//GEN-LAST:event_jCheckBoxtintoMouseEntered

    private void jCheckBoxSpaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxSpaMouseEntered
        // TODO add your handling code here:
        this.jCheckBoxSpa.setForeground(Color.RED);
    }//GEN-LAST:event_jCheckBoxSpaMouseEntered

    private void jCheckBoxLavMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxLavMouseEntered
        // TODO add your handling code here:
        this.jCheckBoxLav.setForeground(Color.RED);
    }//GEN-LAST:event_jCheckBoxLavMouseEntered

    private void jCheckBoxGymMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxGymMouseEntered
        // TODO add your handling code here:
        this.jCheckBoxGym.setForeground(Color.RED);
    }//GEN-LAST:event_jCheckBoxGymMouseEntered

    private void jCheckBoxCuartoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxCuartoMouseExited
        // TODO add your handling code here:
        this.jCheckBoxCuarto.setForeground(Color.BLACK);
    }//GEN-LAST:event_jCheckBoxCuartoMouseExited

    private void jCheckBoxbarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxbarMouseExited
        // TODO add your handling code here:
        this.jCheckBoxbar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jCheckBoxbarMouseExited

    private void jCheckBoxtintoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxtintoMouseExited
        // TODO add your handling code here:
        this.jCheckBoxtinto.setForeground(Color.BLACK);
    }//GEN-LAST:event_jCheckBoxtintoMouseExited

    private void jCheckBoxSpaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxSpaMouseExited
        // TODO add your handling code here:
        this.jCheckBoxSpa.setForeground(Color.BLACK);
    }//GEN-LAST:event_jCheckBoxSpaMouseExited

    private void jCheckBoxLavMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxLavMouseExited
        // TODO add your handling code here:
        this.jCheckBoxLav.setForeground(Color.BLACK);
    }//GEN-LAST:event_jCheckBoxLavMouseExited

    private void jCheckBoxGymMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBoxGymMouseExited
        // TODO add your handling code here:
        this.jCheckBoxGym.setForeground(Color.BLACK);
    }//GEN-LAST:event_jCheckBoxGymMouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new P4_Sistema_Index().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setContentAreaFilled(true);
        jButton1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setContentAreaFilled(false);
        jButton1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton1MouseExited

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
            java.util.logging.Logger.getLogger(P6_Check_Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P6_Check_Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P6_Check_Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P6_Check_Out.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P6_Check_Out().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBoxCuarto;
    private javax.swing.JCheckBox jCheckBoxGym;
    private javax.swing.JCheckBox jCheckBoxLav;
    private javax.swing.JCheckBox jCheckBoxSpa;
    private javax.swing.JCheckBox jCheckBoxbar;
    private javax.swing.JCheckBox jCheckBoxtinto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelDias;
    private javax.swing.JLabel jLabelPex;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JTextField jTextFieldNHab;
    // End of variables declaration//GEN-END:variables

    private void oncheck() {
        this.jCheckBoxCuarto.setEnabled(true);
        this.jCheckBoxGym.setEnabled(true);
        this.jCheckBoxLav.setEnabled(true);
        this.jCheckBoxSpa.setEnabled(true);
        this.jCheckBoxbar.setEnabled(true);
        this.jCheckBoxtinto.setEnabled(true);
    }
}
