/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import hotel.P1_Portada;
import hotel.P5_Check_In;

/**
 *
 * @author Cesar
 */
public class Main {
    MySqlConn objConn = new MySqlConn();
    public Main(){
        new P5_Check_In(objConn).setVisible(true);
        new P1_Portada().setVisible(true);
    }
    public static void main(String[] args) {
        new Main();
    }
  
}
