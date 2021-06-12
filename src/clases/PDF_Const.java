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
public class PDF_Const {
    private 
            String cadFecha, nom, cd, ing, sal, tipo, costo, tothosDias, ex, extC[];
            int dias;

    public PDF_Const(String cadFecha, String nom, String cd, String ing, String sal, String tipo, String costo,int dias, String tothosDias, String ex, String[] extC) {
        this.cadFecha = cadFecha;
        this.nom = nom;
        this.cd = cd;
        this.ing = ing;
        this.sal = sal;
        this.tipo = tipo;
        this.costo = costo;
        this.tothosDias = tothosDias;
        this.ex = ex;
        this.extC = extC;
        this.dias = dias;
    }

    public String getCadFecha() {
        return cadFecha;
    }

    public void setCadFecha(String cadFecha) {
        this.cadFecha = cadFecha;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCd() {
        return cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getIng() {
        return ing;
    }

    public void setIng(String ing) {
        this.ing = ing;
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getTothosDias() {
        return tothosDias;
    }

    public void setTothosDias(String tothosDias) {
        this.tothosDias = tothosDias;
    }

    public String getEx() {
        return ex;
    }

    public void setEx(String ex) {
        this.ex = ex;
    }

    public String[] getExtC() {
        return extC;
    }

    public void setExtC(String[] extC) {
        this.extC = extC;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
    
    
}
