package clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;

/**
 *
 * @author Cesar
 */
public class P3_RegistroCuentas {
 MySqlConn conn = new MySqlConn();

   public P3_RegistroCuentas(MySqlConn conn) {
        this.conn = conn;
    }

    public P3_RegistroCuentas() {
    }
   
    public static void main(String[] args) {
        P3_RegistroCuentas a = new P3_RegistroCuentas();
        a.registro();
    }
   private void registro(){
        String cuenta, pass, parte1, parte2, query;
        System.out.println("?");

        cuenta = JOptionPane.showInputDialog("Ingresa tu nombre de cuenta");
        pass = JOptionPane.showInputDialog("Ingresa tu contraseña");

        parte1 = "insert into cuentas values (";
        parte2 = "'" + cuenta + "'," + " MD5('" + pass + "'))";
        query = parte1 + parte2;
        System.out.println(query);
        int j = this.conn.Update(query);
        System.out.println("1.");
        if (j > 0) {
            JOptionPane.showMessageDialog(null, "Cuenta Registrada...");
            System.out.println("Cuenta Registrada...");
        }
    }
}
