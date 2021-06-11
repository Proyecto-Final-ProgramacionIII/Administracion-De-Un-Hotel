/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import clases.Hab;
import clases.MySqlConn;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cesar
 */
public class P5_Habitaciones extends javax.swing.JFrame {

    /**
     * Creates new form P5_Habitaciones
     */
    MySqlConn conn = new MySqlConn();
    
    private Hab dato;
    int tipo = 0, piso = 0;
   
    
    
    public P5_Habitaciones(MySqlConn conn){
        this.conn = conn;
        initComponents();
        
    }
    
    public P5_Habitaciones() {
        initComponents();
        this.jScrollPane1.setOpaque(false);
        this.jScrollPane1.getViewport().setOpaque(false);
        this.jTableHab.setOpaque(false);
        ((DefaultTableCellRenderer)this.jTableHab.getDefaultRenderer(Object.class)).setOpaque(false);
        jTableHab.getTableHeader().setFont(new java.awt.Font("Time New Roman", Font.BOLD, 12));
        jTableHab.getTableHeader().repaint();
        imagen();
    }
    public void imagen(){
        ImageIcon icono = new ImageIcon("src/imagenes/habitaciones.png");
        JLabel imagen = new JLabel();
        //ImageIcon icono1 = new ImageIcon("src/imagenes/logo3.png");
       // JLabel imagen1 = new JLabel();
        
        imagen.setBounds(0,0,715,415);
        imagen.setIcon(new ImageIcon(icono.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),Image.SCALE_SMOOTH) ));
       
        //imagen1.setBounds(0,0,130,80);
        //imagen1.setIcon(new ImageIcon(icono1.getImage().getScaledInstance(imagen1.getWidth(),imagen1.getHeight(),Image.SCALE_SMOOTH) ));
               
        //jPanelLogo.add(imagen1);
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

        buttonGroupTipo = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelFondo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButtonS = new javax.swing.JRadioButton();
        jRadioButtonD = new javax.swing.JRadioButton();
        jRadioButtonT = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButtonP = new javax.swing.JRadioButton();
        jRadioButtonSeg = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHab = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldHab = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextFielPiso = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Habitaciones Disponibles");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setText("Habitaciones");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setText("Tipo de habitacion");

        buttonGroupTipo.add(jRadioButtonS);
        jRadioButtonS.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButtonS.setText("Sencilla");
        jRadioButtonS.setContentAreaFilled(false);

        buttonGroupTipo.add(jRadioButtonD);
        jRadioButtonD.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButtonD.setText("Doble");
        jRadioButtonD.setContentAreaFilled(false);

        buttonGroupTipo.add(jRadioButtonT);
        jRadioButtonT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButtonT.setText("Triple");
        jRadioButtonT.setContentAreaFilled(false);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setText("Piso");

        buttonGroup1.add(jRadioButtonP);
        jRadioButtonP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButtonP.setText("Primero");
        jRadioButtonP.setContentAreaFilled(false);

        buttonGroup1.add(jRadioButtonSeg);
        jRadioButtonSeg.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButtonSeg.setText("Segundo");
        jRadioButtonSeg.setContentAreaFilled(false);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Buscar habitacion");
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTableHab.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTableHab.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTableHab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero de habitacion", "Piso", "Tipo"
            }
        ));
        jTableHab.setGridColor(java.awt.SystemColor.control);
        jTableHab.setOpaque(false);
        jTableHab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTableHabMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jTableHabMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(jTableHab);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setText("Sencilla $500");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setText("Doble $950");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setText("Triple $1450");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setText("Habitacion");

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Confirmar");
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

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setText("Piso");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar");
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel1))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addComponent(jRadioButtonP)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonSeg)
                                .addGap(36, 36, 36)
                                .addComponent(jButton3))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonS)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonD)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButtonT))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(64, 64, 64))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFielPiso, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldHab, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4))))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jRadioButtonS)
                    .addComponent(jRadioButtonD)
                    .addComponent(jRadioButtonT)
                    .addComponent(jLabel6))
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jRadioButtonP)
                            .addComponent(jRadioButtonSeg)))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton3))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addGap(29, 29, 29)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextFieldHab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextFielPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(0, 104, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jButton3.setContentAreaFilled(true);
        jButton3.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setContentAreaFilled(false);
        jButton3.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       String query = null;
        if(this.jRadioButtonP.isSelected()){//piso 1
            piso = 1;
            this.eliminar();
            if(this.jRadioButtonS.isSelected()){//piso 1 sencillo
                //Consulta el tipo de habitacion, el piso y la disponibilidad
                query = "select * from habitaciones where Tipo = "+"'"+1+"'"+" and "+"Piso = "+"'"
                        +1+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
                tipo = 1;
            }
            if(this.jRadioButtonD.isSelected()){//piso 1 doble
                query = "select * from habitaciones where Tipo = "+"'"+2+"'"+" and "+"Piso = "+"'"
                        +1+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
                tipo = 2;
            }
            if(this.jRadioButtonT.isSelected()){//piso 1 triple
                query = "select * from habitaciones where Tipo = "+"'"+3+"'"+" and "+"Piso = "+"'"
                        +1+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
                tipo = 3;
            }
            if(tipo == 0){//solo se selecciono el piso
                 query = "select * from habitaciones where Piso = "+"'"+1+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
            }
            this.conn.Consult(query);
            int n = 0;                 
           

            try {
              this.conn.rs.last();
              n = this.conn.rs.getRow();
              this.conn.rs.first();
            } catch (Exception e){
                System.out.println("Error#1 ...");
            }
            if ( n != 0) {
            System.out.println("Total de habitaciones disponibles: "+n);
            Object datos [][] = new Object[n][3];
            for (int i = 0; i < n ; i++) {
                try {
                    datos[i][0] = this.conn.rs.getInt(1);
                    datos[i][1] = this.conn.rs.getString(2);
                    datos[i][2] = this.conn.rs.getString(3);
                    this.conn.rs.next();
                } catch (Exception e){
                    System.out.println("Error#2 ...");
                }
                
            }
            String columnas[] = {"Numero de habitacion","Piso","Tipo"};
            jTableHab.setModel(new DefaultTableModel(datos,columnas));
            //System.out.println("tabla lista");
        }
        else
            JOptionPane.showMessageDialog(this, "No hay habitaciones disponibles de este tipo...");
        }//fin if piso1
        if(this.jRadioButtonSeg.isSelected()){//piso 2
            piso = 1;
            this.eliminar();
            if(this.jRadioButtonS.isSelected()){//piso 2 sencillo
                query = "select * from habitaciones where Tipo = "+"'"+1+"'"+" and "+"Piso = "+"'"
                        +2+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
                 tipo = 1;
            }
            if(this.jRadioButtonD.isSelected()){//piso 2 doble
                query = "select * from habitaciones where Tipo = "+"'"+2+"'"+" and "+"Piso = "+"'"
                        +2+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
                 tipo = 2;
            }
            if(this.jRadioButtonT.isSelected()){//piso 2 triple
                query = "select * from habitaciones where Tipo = "+"'"+3+"'"+" and "+"Piso = "+"'"
                        +2+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
                tipo = 3;
            }
            if(tipo == 0){//solo se selecciono el piso
                 query = "select * from habitaciones where Piso = "+"'"+2+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
            }
            this.conn.Consult(query);
            int n = 0;
            try {
              this.conn.rs.last();
              n = this.conn.rs.getRow();
              this.conn.rs.first();
            } catch (Exception e){
                System.out.println("Error#1 ...");
            }
            if ( n != 0) {
            System.out.println("Total de habitaciones disponibles: "+n);
            Object datos [][] = new Object[n][3];
            for (int i = 0; i < n ; i++) {
                try {
                    datos[i][0] = this.conn.rs.getInt(1);
                    datos[i][1] = this.conn.rs.getString(2);
                    datos[i][2] = this.conn.rs.getString(3);
                    this.conn.rs.next();
                } catch (Exception e){
                    System.out.println("Error#2 ...");
                }
                
            }
            String columnas[] = {"Numero de habitacion","Piso","Tipo"};
            jTableHab.setModel(new DefaultTableModel(datos,columnas));
            //System.out.println("tabla lista");
        }
        else
            JOptionPane.showMessageDialog(this, "No hay habitaciones disponibles de este tipo...");
        }
        if(piso == 0){//sin selecion de piso
            this.eliminar();
            if(this.jRadioButtonS.isSelected()){//sencillo
                query = "select * from habitaciones where Tipo = "+"'"+1+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
                 tipo = 1;
            }
            if(this.jRadioButtonD.isSelected()){//doble
                query = "select * from habitaciones where Tipo = "+"'"+2+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
                 tipo = 2;
            }
            if(this.jRadioButtonT.isSelected()){//triple
                query = "select * from habitaciones where Tipo = "+"'"+3+"'"+" and "+"Disponibilidad = "+"'"+1+"'";
                tipo = 3;
            }
            this.conn.Consult(query);
            int n = 0;
            try {
              this.conn.rs.last();
              n = this.conn.rs.getRow();
              this.conn.rs.first();
            } catch (Exception e){
                System.out.println("Error#1 ...");
            }
            if ( n != 0) {
            System.out.println("Total de habitaciones disponibles: "+n);
            Object datos [][] = new Object[n][3];
            for (int i = 0; i < n ; i++) {
                try {
                    datos[i][0] = this.conn.rs.getInt(1);
                    datos[i][1] = this.conn.rs.getString(2);
                    datos[i][2] = this.conn.rs.getString(3);
                    this.conn.rs.next();
                } catch (Exception e){
                    System.out.println("Error#2 ...");
                }
                
            }
            String columnas[] = {"Numero de habitacion","Piso","Tipo"};
            jTableHab.setModel(new DefaultTableModel(datos,columnas));
            //System.out.println("tabla lista");
            }
            else
                JOptionPane.showMessageDialog(this, "No hay habitaciones disponibles de este tipo...");
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
        //int num = Integer.parseInt(this.jTextFieldHab.getText().trim());
        int num = 0;
        int piso = Integer.parseInt(this.jTextFielPiso.getText().trim());
        try {
            num = Integer.parseInt(this.jTextFieldHab.getText().trim());
        } catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "¡No se selecciono una habitacion!", "Sin Habitacion :(", JOptionPane.WARNING_MESSAGE);
            System.out.println("No se selecciono alguna habitacion");
            this.dato = new Hab(0,"",0,0);
        }
        switch (tipo) {
            case 1:
                this.dato = new Hab(num,"Sencilla",piso,1);
                break;
            case 2:
                this.dato = new Hab(num,"Doble",piso,2);
                break;
            case 3:
                this.dato = new Hab(num,"Triple",piso,3);
                break;
            default:
                
                break;
        }
        this.dispose();
        new P5_Check_In(this.dato).setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setContentAreaFilled(true);
        jButton2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setContentAreaFilled(false);
        jButton2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new P4_Sistema_Index().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableHabMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHabMouseEntered
        // TODO add your handling code here:
        this.jTableHab.setForeground(Color.BLACK);
        this.jScrollPane1.setOpaque(true);
        this.jScrollPane1.getViewport().setOpaque(true);
        this.jTableHab.setOpaque(true);
        ((DefaultTableCellRenderer)this.jTableHab.getDefaultRenderer(Object.class)).setOpaque(true);
        
    }//GEN-LAST:event_jTableHabMouseEntered

    private void jTableHabMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHabMouseExited
        // TODO add your handling code here:
        this.jTableHab.setForeground(Color.WHITE);
        this.jScrollPane1.setOpaque(false);
        this.jScrollPane1.getViewport().setOpaque(false);
        this.jTableHab.setOpaque(false);
        ((DefaultTableCellRenderer)this.jTableHab.getDefaultRenderer(Object.class)).setOpaque(false);
    }//GEN-LAST:event_jTableHabMouseExited

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
            java.util.logging.Logger.getLogger(P5_Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P5_Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P5_Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P5_Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P5_Habitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroupTipo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JRadioButton jRadioButtonD;
    private javax.swing.JRadioButton jRadioButtonP;
    private javax.swing.JRadioButton jRadioButtonS;
    private javax.swing.JRadioButton jRadioButtonSeg;
    private javax.swing.JRadioButton jRadioButtonT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHab;
    private javax.swing.JTextField jTextFielPiso;
    private javax.swing.JTextField jTextFieldHab;
    // End of variables declaration//GEN-END:variables

    private void eliminar(){
        DefaultTableModel tb = (DefaultTableModel) this.jTableHab.getModel();
        int a  = this.jTableHab.getRowCount()-1;
        for (int i = a; i >= 0; i--) 
            tb.removeRow(tb.getRowCount()-1);
    }
}
