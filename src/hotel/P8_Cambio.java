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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class P8_Cambio extends javax.swing.JFrame {

    /**
     * Creates new form P8_Cambio
     */
    MySqlConn conn = new MySqlConn();
    private int di, nAlfa;
    String in;

    public P8_Cambio() {
        initComponents();
        imagen();
        this.jLabelnom.setText("");
        this.jLabelSal.setText("");
        this.jLabelCd.setText("");
        this.jLabeling.setText("");
    }

    public void imagen() {
        ImageIcon icono = new ImageIcon("src/imagenes/galeria/a14.png");
        JLabel imagen = new JLabel();

        imagen.setBounds(0, 0, 480, 460);
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNOM = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabelSal = new javax.swing.JLabel();
        jRadioButtonNom = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButtondias = new javax.swing.JRadioButton();
        jLabelCd = new javax.swing.JLabel();
        jRadioButtoning = new javax.swing.JRadioButton();
        jRadioButtoncd = new javax.swing.JRadioButton();
        jLabelnom = new javax.swing.JLabel();
        jLabeling = new javax.swing.JLabel();
        jDateChoosering = new com.toedter.calendar.JDateChooser();
        jTextFieldNnom = new javax.swing.JTextField();
        jSpinnerdias = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificacion de datos");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos del Cliente");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del huésped: ");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
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

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Regresar");
        jButton2.setBorderPainted(false);
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

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Guardar datos nuevos");
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

        jLabelSal.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelSal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSal.setText("Ciudad");
        jLabelSal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSalMouseExited(evt);
            }
        });

        jRadioButtonNom.setOpaque(false);

        jComboBox1.setMaximumRowCount(6);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quintana Roo", "Queretaro", "CDMX", "Aguascalientes", "Baja California", "Sonora", "Nayarit", "Guadalajara", "San Luis Potosi" }));
        jComboBox1.setOpaque(false);

        jRadioButtondias.setOpaque(false);

        jLabelCd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelCd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCd.setText("Ciudad");
        jLabelCd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCdMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelCdMouseExited(evt);
            }
        });

        jRadioButtoning.setOpaque(false);

        jRadioButtoncd.setOpaque(false);

        jLabelnom.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabelnom.setForeground(new java.awt.Color(255, 255, 255));
        jLabelnom.setText("Nombre");
        jLabelnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelnomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelnomMouseExited(evt);
            }
        });

        jLabeling.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabeling.setForeground(new java.awt.Color(255, 255, 255));
        jLabeling.setText("Ciudad");
        jLabeling.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelingMouseExited(evt);
            }
        });

        jSpinnerdias.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addComponent(jRadioButtoncd)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelCd, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButtoning)
                                            .addComponent(jRadioButtondias)
                                            .addComponent(jRadioButtonNom))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                                .addComponent(jLabelnom, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jButton1)
                                                    .addComponent(jTextFieldNnom, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                                .addComponent(jLabeling, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jDateChoosering, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanelFondoLayout.createSequentialGroup()
                                                .addComponent(jLabelSal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSpinnerdias, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(146, 146, 146))))
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextFieldNOM, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jButton3)))))
                        .addGap(0, 75, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelnom)
                            .addComponent(jTextFieldNnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jRadioButtonNom)
                        .addGap(11, 11, 11)))
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtoning)
                    .addComponent(jLabeling)
                    .addComponent(jDateChoosering, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelSal)
                        .addComponent(jSpinnerdias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButtondias, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtoncd)
                    .addComponent(jLabelCd)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelFondoLayout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(40, 40, 40))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        // TODO add your handling code here:
        jLabel1.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        // TODO add your handling code here:
        jLabel1.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel2MouseExited

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String query = "select * from clientes where Nombre = " + "'" + this.jTextFieldNOM.getText().trim() + "'";
        this.conn.Consult(query);
        int x = 0;

        try {
            x = this.conn.rs.getRow();
        } catch (SQLException ex) {
            Logger.getLogger(P8_Cambio.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (x != 0) {
            this.jLabelnom.setText(this.jTextFieldNOM.getText().trim());
            try {
                nAlfa = this.conn.rs.getInt(9);
                in = this.conn.rs.getString(6);
                this.jLabeling.setText("Ingreso: " + in);
                di = this.conn.rs.getInt(5);
                this.jLabelSal.setText("Dias: " + di);
                this.jLabelCd.setText(this.conn.rs.getString(3));

            } catch (SQLException ex) {
                Logger.getLogger(P8_Cambio.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Nombre no resgitrado", "Sin registro de huésped", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
        if (this.jRadioButtonNom.isSelected()) {//mod nombre
            String query = "UPDATE clientes SET Nombre = '" + this.jTextFieldNnom.getText().trim() + "' WHERE NHabitacion = " + nAlfa;
            int x = this.conn.Update(query);
            if (x == 0) 
                System.out.println("Error al modificar el nombre");
        }
        if (this.jRadioButtoning.isSelected()) {//mod fecha
            String Ing, Sal;
            if (this.jRadioButtondias.isSelected()) {
                SimpleDateFormat dFormat = new SimpleDateFormat("YYYY-MM-dd");
                Ing = dFormat.format(this.jDateChoosering.getDate());//fechas actulizadas con los dias 
                Sal = sumarDias((int) this.jSpinnerdias.getValue());
                
                String query = "UPDATE clientes SET Dias = '" + (int) this.jSpinnerdias.getValue() + "' WHERE NHabitacion = " + nAlfa;
                int x = this.conn.Update(query);
                if (x == 0) 
                    System.out.println("Error al modificar dias1");
                
            } else {
                SimpleDateFormat dFormat = new SimpleDateFormat("YYYY-MM-dd");
                Ing = dFormat.format(this.jDateChoosering.getDate());//fechas actulizadas sin dias
                Sal = sumarDias(di);
            }
            String query = "UPDATE clientes SET Ingreso = '" + Ing + "' WHERE NHabitacion = " + nAlfa;
            int x = this.conn.Update(query);
            if (x == 0) 
                System.out.println("Error al modificar fecha ingreso 1");
            query = "UPDATE clientes SET Salida = '" + Sal + "' WHERE NHabitacion = " + nAlfa;
            x = this.conn.Update(query);
            if (x == 0) 
                System.out.println("Error al modificar fecha salida 1");
        }
        if (this.jRadioButtondias.isSelected()){//mod dias
            String Sal, Ing;
            if(this.jRadioButtoning.isSelected()){
                SimpleDateFormat dFormat = new SimpleDateFormat("YYYY-MM-dd");
                Ing = dFormat.format(this.jDateChoosering.getDate());//fechas actulizadas con los dias 
                Sal = sumarDias((int) this.jSpinnerdias.getValue());
            }else{
                SimpleDateFormat dFormat = new SimpleDateFormat("YYYY-MM-dd");
                Ing = in;
                Sal = sumarDias((int) this.jSpinnerdias.getValue(),Ing);
            }
            String query = "UPDATE clientes SET Ingreso = '" + Ing + "' WHERE NHabitacion = " + nAlfa;
            int x = this.conn.Update(query);
            if (x == 0) 
                System.out.println("Error al modificar fecha ingreso 2");
            query = "UPDATE clientes SET Salida = '" + Sal + "' WHERE NHabitacion = " + nAlfa;
            x = this.conn.Update(query);
            if (x == 0) 
                System.out.println("Error al modificar fecha salida 2");
            
            query = "UPDATE clientes SET Dias = '" + (int) this.jSpinnerdias.getValue() + "' WHERE NHabitacion = " + nAlfa;
            x = this.conn.Update(query);
            if (x == 0) 
                System.out.println("Error al modificar dias2");
        }
        if(this.jRadioButtoncd.isSelected()){
            String c = (String)this.jComboBox1.getSelectedItem();
            String query = "UPDATE clientes SET CdOrigen = '" + c + "' WHERE NHabitacion = " + nAlfa;
            int x = this.conn.Update(query);
            if (x == 0) 
                System.out.println("Error al modificar la ciudad");
        }
        
        JOptionPane.showMessageDialog(null, "Los cambios se han guardado correctamente", "Modificacion exitosa", JOptionPane.INFORMATION_MESSAGE);
        this.jRadioButtonNom.setSelected(false);
        this.jRadioButtoncd.setSelected(false);
        this.jRadioButtondias.setSelected(false);
        this.jRadioButtoning.setSelected(false);
        this.jTextFieldNOM.setText("");
        this.jTextFieldNnom.setText("");
        
        this.jDateChoosering.setCalendar(null);
        this.jSpinnerdias.setValue(0);
        this.jComboBox1.setSelectedIndex(0);

        this.jLabelnom.setText("");
        this.jLabelSal.setText("");
        this.jLabelCd.setText("");
        this.jLabeling.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabelSalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalMouseEntered
        // TODO add your handling code here:
        jLabelSal.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelSalMouseEntered

    private void jLabelSalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalMouseExited
        // TODO add your handling code here:
        jLabelSal.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelSalMouseExited

    private void jLabelCdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCdMouseEntered
        // TODO add your handling code here:
        jLabelCd.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabelCdMouseEntered

    private void jLabelCdMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCdMouseExited
        // TODO add your handling code here:
        jLabelCd.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabelCdMouseExited

    private void jLabelnomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelnomMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelnomMouseEntered

    private void jLabelnomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelnomMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelnomMouseExited

    private void jLabelingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelingMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelingMouseEntered

    private void jLabelingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelingMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelingMouseExited

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
            java.util.logging.Logger.getLogger(P8_Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P8_Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P8_Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P8_Cambio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P8_Cambio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChoosering;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCd;
    private javax.swing.JLabel jLabelSal;
    private javax.swing.JLabel jLabeling;
    private javax.swing.JLabel jLabelnom;
    private javax.swing.JPanel jPanelFondo;
    private javax.swing.JRadioButton jRadioButtonNom;
    private javax.swing.JRadioButton jRadioButtoncd;
    private javax.swing.JRadioButton jRadioButtondias;
    private javax.swing.JRadioButton jRadioButtoning;
    private javax.swing.JSpinner jSpinnerdias;
    private javax.swing.JTextField jTextFieldNOM;
    private javax.swing.JTextField jTextFieldNnom;
    // End of variables declaration//GEN-END:variables
     private String sumarDias(int di) {
        SimpleDateFormat dFormat = new SimpleDateFormat("YYYY-MM-dd");
        String date = dFormat.format(this.jDateChoosering.getDate());

        int dias = di;
        if (dias == 0) {
            return date;
        }
        String[] f = date.split("-");
        Calendar calendar = Calendar.getInstance();
        //calendar.setTime(new Date(Integer.parseInt(f[0]), Integer.parseInt(f[1]), Integer.parseInt(f[2])));
        calendar.set(Integer.parseInt(f[0]), Integer.parseInt(f[1]) - 1, Integer.parseInt(f[2]));

        calendar.add(Calendar.DAY_OF_MONTH, dias);
        SimpleDateFormat d = new SimpleDateFormat("YYYY-MM-dd");
        return d.format(calendar.getTime());

    }
     private String sumarDias(int di, String in) {
        /*SimpleDateFormat dFormat = new SimpleDateFormat("YYYY-MM-dd");
        String date = dFormat.format(this.jDateChoosering.getDate());*/
        String date = in;
        int dias = di;
        if (dias == 0) {
            return date;
        }
        String[] f = date.split("-");
        Calendar calendar = Calendar.getInstance();
        //calendar.setTime(new Date(Integer.parseInt(f[0]), Integer.parseInt(f[1]), Integer.parseInt(f[2])));
        calendar.set(Integer.parseInt(f[0]), Integer.parseInt(f[1]) - 1, Integer.parseInt(f[2]));

        calendar.add(Calendar.DAY_OF_MONTH, dias);
        SimpleDateFormat d = new SimpleDateFormat("YYYY-MM-dd");
        return d.format(calendar.getTime());

    }
}
