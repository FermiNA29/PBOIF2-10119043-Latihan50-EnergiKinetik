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
public class PBOIF210119043Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola();
        bola.setMassa(145);
        bola.setKecepatanAkhir(25);
        bola.setKecepatanAwal(0);
        bola.setKonversi(bola.getMassa()/1000);
        
        System.out.println("====Program Energi Kinetik====");
        System.out.println("Massa : " + bola.getMassa() + " g");
        System.out.println("Kecepatan Awal : " + bola.getKecepatanAwal() + " m/s");
        System.out.println("Kecepatan Akhir: " + bola.getKecepatanAkhir() + " m/s");
        System.out.println("Konversi Massa : " + bola.getKonversi() + " Kg");
        System.out.println("Energi Kinetik : " + bola.energiKinetik(bola.getKonversi(), bola.getKecepatanAkhir()) + " Joule");
        System.out.println("Usaha : " + bola.usaha(bola.getKonversi(), bola.getKecepatanAwal(), bola.getKecepatanAkhir())+ " Joule");
        
    }
    
}
