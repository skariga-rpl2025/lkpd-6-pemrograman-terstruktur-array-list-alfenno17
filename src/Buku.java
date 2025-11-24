/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mutia
 */
public class Buku {
    private final String judul;
    private final String Pengarang;
    
    public Buku(String judul, String Pengarang){
        this.judul = judul;
        this.Pengarang = Pengarang;
    }
    
    public String getjudul(){
        return judul;
    }
    
    public String getPengarang(){
        return Pengarang;
    }
    
    public String tampil(){
        return "Judul: " + judul + ", Pengarang: " + Pengarang;
    }
    
}
