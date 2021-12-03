/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author default
 */
public class Bandoc implements Serializable{

   
    private int ma;
    private String ten;
    private String diachi;
    private String sdt;
    private static int sma=10000;

    public Bandoc() {
        ma=sma++;
    }

    public Bandoc(int ma, String ten, String diachi, String sdt) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Bandoc.sma = sma;
    }
    
    
    

    

    public Object[][] toObject(){
        return (Object[][]) new Object[]{
                ma,ten,diachi,sdt
        };
   }
}
