/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Cesar
 */
public class Hab {
    private 
            int Num;
            String tipo;
            int Piso;
            int ty;

    public Hab(int Num, String tipo, int Piso, int ty) {
        this.Num = Num;
        this.tipo = tipo;
        this.Piso = Piso;
        this.ty = ty;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPiso() {
        return Piso;
    }

    public void setPiso(int Piso) {
        this.Piso = Piso;
    }

    public int getTy() {
        return ty;
    }

    public void setTy(int ty) {
        this.ty = ty;
    }
    
    
}
