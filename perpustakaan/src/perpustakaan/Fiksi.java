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
public class Fiksi extends Buku {
    private String Jenis;
    
    public Fiksi(){
        super();
        Jenis = "Fiksi";
    }
    
    public Fiksi(String Judul,String Pengarang,int Halaman, String Jenisnya,String Jenis){
        super(Judul,Pengarang,Jenisnya,Halaman);
        this.Jenis = Jenis;
    }
    
    public String getJenis(){
        return Jenis;
    }
    
    public void setJenisnya(String Jenis){
        this.Jenis = Jenis;
    }
    

    
}
