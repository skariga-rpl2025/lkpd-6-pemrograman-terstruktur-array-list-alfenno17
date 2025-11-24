 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lab Studio
 */
public class Main {
    public static void main(String[] args) {
        
        Perpustakaan perpus = new Perpustakaan();
        perpus.tambahBuku("One it All","Raff");
        perpus.tambahBuku("Mas Ambarawa", "Zrukis");
        perpus.tambahBuku("Timur ke Utara", "Salim Bapak");
        System.out.println("Jumlah Buku: " + perpus.jumlahBuku());
        perpus.tambahBuku("Pray to Allah", "Umar");
        
        String cari = "Komedi";
        System.out.println("Cari Buku dengan Kata Kunci: " + cari);
        Buku buku = perpus.cariBuku(cari);
        if(buku == null){
            System.out.println("Buku Tidak Ditemukan! ");
    
        }else{
            System.out.println("Buku ditemukan dengan judul: " + buku.getjudul() + 
                    ", Pengarang: " + buku.getPengarang());
        }
        
        perpus.gantiBuku(0, "Nasi Kotak", "Dono");
        buku = perpus.lihatBuku(0);
        System.out.println("Buku diganti dengan judul: " + buku.getjudul() +
                ", Pengarang: " + buku.getPengarang());
        
        perpus.hapusBuku(0);
        System.out.println("Jumlah Buku: " + perpus.jumlahBuku());
    }
    
}
