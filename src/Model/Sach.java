/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;

/**
 *
 * @author default
 */
public class Sach  implements Serializable{

   
    private int ma;
    private String ten;
    private String tacgia;
    private String chuyennganh;
    private int nam;
    private int soluong;
    private static int sma=10000;

    public Sach() {
        
    }


    public Sach( String ten, String tacgia, String chuyennganh, int nam, int soluong) {
        this.ma=sma++;
        this.ten = ten;
        this.tacgia = tacgia;
        this.chuyennganh = chuyennganh;
        this.nam = nam;
        this.soluong = soluong;
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

    public String getTacgia() {
        return tacgia;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public static int getSma() {
        return sma;
    }

    public static void setSma(int sma) {
        Sach.sma = sma;
    }

    public Object[] toObject(){
        return new Object[]{
                ma,ten,tacgia,chuyennganh,soluong,nam
        };
   }
}
