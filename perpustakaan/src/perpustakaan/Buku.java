/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

/**
 *
 * @author AJO
 */
public class Buku extends Perpustakaan {
    private String Judul;
    private String Pengarang;
    private String Jenisnya;
    private int Halaman;
    
    public Buku(){
        Judul = "nihil";
        Pengarang = "nihil";
        Halaman = 0;
}
    
    public Buku(String Judul,String Pengarang,String Jenisnya,int Halaman){
        this.Judul = Judul;
        this.Pengarang = Pengarang;
        this.Halaman = Halaman;
        this.Jenisnya = Jenisnya;
    }
    
    public String getJudul(){
        return Judul;
    }
    
    public void setJudul(String Judul){
        this.Judul = Judul;
    }
    
     public String getPengarang(){
        return Pengarang;
    }
    
    public void setPengarang(String Pengarang){
        this.Pengarang = Pengarang;
    }
  
    
     public int getHalaman(){
        return Halaman;
    }
    
    public void setHalaman(int Halaman){
        this.Halaman= Halaman;
        
    }
    
    public String getJenisnya(){
        return Jenisnya;
    }
    
    public void setJenisnya(String Jenisnya){
        this.Judul = Judul;
    }
    
    public void cetak(){
        System.out.println("Judul buku : "+ Judul);
        System.out.println("Pengarang : " + Pengarang);
        System.out.println("Jumlah Halaman : "+Halaman);
    }
    
    
        
    }
