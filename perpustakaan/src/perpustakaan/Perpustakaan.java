/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package perpustakaan;
import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;
import java.lang.NullPointerException;
import java.lang.ArithmeticException;
import java.io.*;
/**
 *
 * @author AJO
 */
public class Perpustakaan {
    
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       Buku[]Perpustakaan = new Buku[1000000];
       int TotalBuku = 3;
       int JumlahFiksi = 0;
       int JumlahNonFiksi = 0;
       int HalamanFiksi=0;
       int HalamanNonFiksi=0;
       double standardeviasi=0;
       double standardeviasifiksi=0;
       double standardeviasinonfiksi=0; 
       int pilihan;
       Random a = new Random();
       Buku[] b = new Buku[1000000];
 
       
       for (int i=0; i<Perpustakaan.length ; i++){
           pilihan = a.nextInt(2)+1;
           if (pilihan==1){
               Perpustakaan[i]=new Fiksi();
           }
           if (pilihan==1){
               Perpustakaan[i]=new NonFiksi();
           }
       }
       
       for(int i=0;i<3;i++){
           pilihan = a.nextInt(2)+1;
           if (pilihan==1){
               Perpustakaan[i] = new Buku("Apel","Alicia","Fiksi",150);
               JumlahFiksi+=1;
               HalamanFiksi+=Perpustakaan[i].getHalaman();
           }
           if (pilihan==2){
               Perpustakaan[i] = new Buku("Jeruk","Jeremia","NonFiksi",200);
               JumlahNonFiksi+=1;
               HalamanNonFiksi+=Perpustakaan[i].getHalaman();
       }
       }
           System.out.println("=============================================");
           System.out.println("P E R P U S T A K A A N");
           System.out.println("=============================================");
           System.out.println("Buku yang ada diperpustakaan : "+"\n");
           for (int i=0;i<TotalBuku;i++){
               System.out.println((i+1)+". Judul : " + Perpustakaan[i].getJudul()+"\n" + " Pengarang : "+ 
               Perpustakaan[i].getPengarang()+"\n"+"Jumlah Halaman : "+Perpustakaan[i].getHalaman()+"\n");}
               System.out.println("=============================================");
               System.out.println("Jumlah buku didalam perpustakaan : "+TotalBuku);
               double ratarata=(HalamanFiksi+HalamanNonFiksi)/TotalBuku;
               double rataratafiksi=HalamanFiksi/JumlahFiksi;
               double rataratanonfiksi=HalamanNonFiksi/JumlahNonFiksi;
               for(int i =0;i<TotalBuku;i++){
               standardeviasi = (Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-ratarata),2))/TotalBuku);}
               for(int i =0;i<TotalBuku;i++){
                   if(Perpustakaan[i].getJenisnya()=="Fiksi"){
                   standardeviasifiksi =(Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-rataratafiksi),2))/JumlahFiksi);
                   }else{ 
                   standardeviasinonfiksi = (Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-rataratanonfiksi),2))/JumlahNonFiksi);}}
               System.out.println("Rata-rata halaman buku dalam perpustakaan : " + ratarata);
               System.out.println("Standar deviasi halaman buku dalam perpustakaan : "+standardeviasi);
               System.out.println("=============================================");
               System.out.println("Jumlah buku fiksi didalam perpustakaan : "+ JumlahFiksi);
               System.out.println("Rata-rata halaman buku fiksi dalam perpustakaan : " + rataratafiksi);
               System.out.println("Standar deviasi halaman buku fiksi dalam perpustakaan : "+standardeviasifiksi);
               System.out.println("=============================================");
               System.out.println("Jumlah buku non-fiksi didalam perpustakaan : "+ JumlahNonFiksi);
               System.out.println("Rata-rata halaman buku non-fiksi dalam perpustakaan : " + rataratanonfiksi);
               System.out.println("Standar deviasi halaman buku non-fiksi dalam perpustakaan : "+standardeviasinonfiksi);
               System.out.println("=============================================");
               System.out.println("[1].input buku baru");
               System.out.println("[2].modifikasi detail buku");
               System.out.println("[3].hapus buku");
               System.out.println("[4].Exit");
               System.out.println("Masukkan opsi yang anda inginkan : ");
               int opsi = input.nextInt();
               
               if (opsi==1){
                   TotalBuku+=1;
                   System.out.println("=============================================");
                   System.out.println("B U K U  B A R U");
                   System.out.println("=============================================");
                   System.out.println("Input Judul Buku : ");
                   String judulbaru=input.next();
                   Perpustakaan[TotalBuku - 1].setJudul(judulbaru);
                   System.out.println("Input Pengarang Buku : ");
                   String pengarangbaru = input.next();
                   Perpustakaan[TotalBuku - 1].setPengarang(pengarangbaru);
                   System.out.println("Input Jumlah Halaman Buku : ");
                   int halamanbaru = input.nextInt();
                   Perpustakaan[TotalBuku - 1].setHalaman(halamanbaru);
                   pilihan = a.nextInt(2)+1;
                   if(pilihan==1){
                       Perpustakaan[TotalBuku-1] = new Buku(judulbaru,pengarangbaru,"Fiksi",halamanbaru);
                       JumlahFiksi+=1;
                       HalamanFiksi+=halamanbaru;
                   }
                   if(pilihan==2){
                       Perpustakaan[TotalBuku-1] = new Buku(judulbaru,pengarangbaru,"NonFiksi",halamanbaru);
                       JumlahNonFiksi+=1;
                       HalamanNonFiksi+=halamanbaru;
                   }
                   for (int i =0;i<TotalBuku;i++){
                   System.out.println((i+1)+". Judul : " + Perpustakaan[i].getJudul()+"\n" + " Pengarang : "+ 
                   Perpustakaan[i].getPengarang()+"\n"+"Jumlah Halaman : "+Perpustakaan[i].getHalaman()+"\n");}
                   System.out.println("=============================================");
                   System.out.println("Jumlah buku didalam perpustakaan : "+TotalBuku);
                   ratarata=(HalamanFiksi+HalamanNonFiksi)/TotalBuku;
                   rataratafiksi=HalamanFiksi/JumlahFiksi;
                   rataratanonfiksi=HalamanNonFiksi/JumlahNonFiksi;
                   for(int i =0;i<TotalBuku;i++){
                   standardeviasi = (Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-ratarata),2))/TotalBuku);}
                   for(int i =0;i<TotalBuku;i++){
                   if(Perpustakaan[i].getJenisnya()=="Fiksi"){
                   standardeviasifiksi =(Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-rataratafiksi),2))/JumlahFiksi);
                   }else{ 
                   standardeviasinonfiksi = (Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-rataratanonfiksi),2))/JumlahNonFiksi);}}
                   System.out.println("Rata-rata halaman buku dalam perpustakaan : " + ratarata);
                   System.out.println("Standar deviasi halaman buku dalam perpustakaan : "+standardeviasi);
                   System.out.println("=============================================");
                   System.out.println("Jumlah buku fiksi didalam perpustakaan : "+ JumlahFiksi);
                   System.out.println("Rata-rata halaman buku fiksi dalam perpustakaan : " + rataratafiksi);
                   System.out.println("Standar deviasi halaman buku fiksi dalam perpustakaan : "+standardeviasifiksi);
                   System.out.println("=============================================");
                   System.out.println("Jumlah buku non-fiksi didalam perpustakaan : "+ JumlahNonFiksi);
                   System.out.println("Rata-rata halaman buku non-fiksi dalam perpustakaan : " + rataratanonfiksi);
                   System.out.println("Standar deviasi halaman buku non-fiksi dalam perpustakaan : "+standardeviasinonfiksi);
                   System.out.println("=============================================");
                   
                }else if(opsi==2){
                    System.out.println("=============================================");
                   System.out.println("U B A H  B U K U");
                   System.out.println("=============================================");
                   System.out.println("Pilih buku yang akan diubah : ");
                   for (int i =0;i<TotalBuku;i++){
                   System.out.println((i+1)+". Judul : " + Perpustakaan[i].getJudul()+"\n" + " Pengarang : "+ 
                   Perpustakaan[i].getPengarang()+"\n");}
                   System.out.println("Yang akan diubah : ");
                   int x=input.nextInt();
                   System.out.println("Input Judul Buku : ");
                   String judulbaru=input.next();
                   Perpustakaan[x - 1].setJudul(judulbaru);
                   System.out.println("Input Pengarang Buku : ");
                   String pengarangbaru = input.next();
                   Perpustakaan[x - 1].setPengarang(pengarangbaru);
                   System.out.println("Input Jumlah Halaman Buku : ");
                   int halamanbaru = input.nextInt();
                   Perpustakaan[x - 1].setHalaman(halamanbaru);
                   if ( Perpustakaan[x-1].getJenisnya()=="Fiksi"){
                       HalamanFiksi=HalamanFiksi-halamanbaru+Perpustakaan[x].getHalaman();
                   }else{
                       HalamanNonFiksi=HalamanNonFiksi-halamanbaru+Perpustakaan[x].getHalaman();}
                   
                   System.out.println("=============================================");
                   System.out.println("Jumlah buku didalam perpustakaan : "+TotalBuku);
                   ratarata=(HalamanFiksi+HalamanNonFiksi)/TotalBuku;
                   rataratafiksi=HalamanFiksi/JumlahFiksi;
                   rataratanonfiksi=HalamanNonFiksi/JumlahNonFiksi;
                   for(int i =0;i<TotalBuku;i++){
                   standardeviasi = (Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-ratarata),2))/TotalBuku);}
                   for(int i =0;i<TotalBuku;i++){
                   if(Perpustakaan[i].getJenisnya()=="Fiksi"){
                   standardeviasifiksi =(Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-rataratafiksi),2))/JumlahFiksi);
                   }else{ 
                   standardeviasinonfiksi = (Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-rataratanonfiksi),2))/JumlahNonFiksi);}}
                   System.out.println("Rata-rata halaman buku dalam perpustakaan : " + ratarata);
                   System.out.println("Standar deviasi halaman buku dalam perpustakaan : "+standardeviasi);
                   System.out.println("=============================================");
                   System.out.println("Jumlah buku fiksi didalam perpustakaan : "+ JumlahFiksi);
                   System.out.println("Rata-rata halaman buku fiksi dalam perpustakaan : " + rataratafiksi);
                   System.out.println("Standar deviasi halaman buku fiksi dalam perpustakaan : "+standardeviasifiksi);
                   System.out.println("=============================================");
                   System.out.println("Jumlah buku non-fiksi didalam perpustakaan : "+ JumlahNonFiksi);
                   System.out.println("Rata-rata halaman buku non-fiksi dalam perpustakaan : " + rataratanonfiksi);
                   System.out.println("Standar deviasi halaman buku non-fiksi dalam perpustakaan : "+standardeviasinonfiksi);
                   System.out.println("=============================================");    
                   
                 }else if(opsi==3){
                   System.out.println("=============================================");
                   System.out.println("H A P U S  B U K U");
                   System.out.println("=============================================");
                   System.out.println("Pilih buku yang akan dihapus : ");
                   for (int i =0;i<TotalBuku;i++){
                   System.out.println((i+1)+". Judul : " + Perpustakaan[i].getJudul()+"\n" + " Pengarang : "+ 
                   Perpustakaan[i].getPengarang()+"\n");}
                   System.out.println("Yang akan dihapus : ");
                   int y=input.nextInt();
                   for (int i=y;i<TotalBuku;i++){
                   Perpustakaan[i-1] = Perpustakaan[i];}
               if ( Perpustakaan[y].getJenisnya()=="Fiksi"){
                       HalamanFiksi=HalamanFiksi-Perpustakaan[y].getHalaman();
                   }else{
                       HalamanNonFiksi=HalamanNonFiksi-Perpustakaan[y].getHalaman();}
                }
                System.out.println("=============================================");
                   System.out.println("Jumlah buku didalam perpustakaan : "+TotalBuku);
                   ratarata=(HalamanFiksi+HalamanNonFiksi)/TotalBuku;
                   rataratafiksi=HalamanFiksi/JumlahFiksi;
                   rataratanonfiksi=HalamanNonFiksi/JumlahNonFiksi;
                   for(int i =0;i<TotalBuku;i++){
                   standardeviasi = (Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-ratarata),2))/TotalBuku);}
                   for(int i =0;i<TotalBuku;i++){
                   if(Perpustakaan[i].getJenisnya()=="Fiksi"){
                   standardeviasifiksi =(Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-rataratafiksi),2))/JumlahFiksi);
                   }else{ 
                   standardeviasinonfiksi = (Math.sqrt(Math.pow((Perpustakaan[i].getHalaman()-rataratanonfiksi),2))/JumlahNonFiksi);}}
                   System.out.println("Rata-rata halaman buku dalam perpustakaan : " + ratarata);
                   System.out.println("Standar deviasi halaman buku dalam perpustakaan : "+standardeviasi);
                   System.out.println("=============================================");
                   System.out.println("Jumlah buku fiksi didalam perpustakaan : "+ JumlahFiksi);
                   System.out.println("Rata-rata halaman buku fiksi dalam perpustakaan : " + rataratafiksi);
                   System.out.println("Standar deviasi halaman buku fiksi dalam perpustakaan : "+standardeviasifiksi);
                   System.out.println("=============================================");
                   System.out.println("Jumlah buku non-fiksi didalam perpustakaan : "+ JumlahNonFiksi);
                   System.out.println("Rata-rata halaman buku non-fiksi dalam perpustakaan : " + rataratanonfiksi);
                   System.out.println("Standar deviasi halaman buku non-fiksi dalam perpustakaan : "+standardeviasinonfiksi);
                   System.out.println("=============================================");    
                   
                   }
}
    
    

           
       

  
    