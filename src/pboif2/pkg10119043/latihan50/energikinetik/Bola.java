/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan50.energikinetik;

/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menghitung energi kinetik dan usaha
 */
public class Bola {
    private double massa;
    private double konversi;
    private double kecepatanAwal;
    private double kecepatanAkhir;

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public void setKonversi(double konversi) {
        this.konversi = konversi;
    }

    public void setKecepatanAwal(double kecepatanAwal) {
        this.kecepatanAwal = kecepatanAwal;
    }

    public void setKecepatanAkhir(double kecepatanAkhir) {
        this.kecepatanAkhir = kecepatanAkhir;
    }

    public double getMassa() {
        return massa;
    }

    public double getKonversi() {
        return konversi;
    }

    public double getKecepatanAwal() {
        return kecepatanAwal;
    }

    public double getKecepatanAkhir() {
        return kecepatanAkhir;
    }

    public double energiKinetik(double massa, double kecepatanAkhir) {
        return 0.5 * massa * (kecepatanAkhir * kecepatanAkhir);
    }
    
    public double usaha(double massa, double kecepatanAwal, double kecepatanAkhir) {
        return 0.5 * massa * ((kecepatanAkhir*kecepatanAkhir)-(kecepatanAwal*kecepatanAwal));
    }
}
