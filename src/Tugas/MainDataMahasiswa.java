/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author Lab Studio
 */
public class MainDataMahasiswa {
    
    public static void main(String[] args) {
        
        DataMahasiswa dataM = new DataMahasiswa();
        
        dataM.tambahMahasiswa("2214", "Agus", "Batu");
        dataM.tambahMahasiswa("2215", "Ika", "Surabaya");
        dataM.tambahMahasiswa("2216", "Dwi", "Samarinda");
        dataM.tambahMahasiswa("2217", "Dava", "Ternate");
        System.out.println("Jumlah Mahasiswa: " + dataM.jumlahMahasiswa());
        dataM.tambahMahasiswa("2220", "Iqbal", "Surakarta");
        
        String cari = "2232";
        System.out.println("Cari Mahasiswa dengan Npm: " + cari);
        Mahasiswa mahas = dataM.cariMahasiswa(cari);
        if(mahas == null){
            System.out.println("Mahasiswa Tidak Ditemukan! ");
    
        }else{
            System.out.println("Mahasiswa ditemukan dengan Npm: " + mahas.getNpm() + 
                    ", Nama: " + mahas.getNama() + ", Alamat: " + mahas.getAlamat());
        }
        
        dataM.gantiMahasiswa(0, "2245", "Hamid", "Samarinda");
        mahas = dataM.lihatMahasiswa(0);
        System.out.println("Mahasiswa diganti dengan Npm: " + mahas.getNpm() +
                ", Nama: " + mahas.getNama() + ", Alamat: " + mahas.getAlamat());
        
        dataM.hapusMahasiswa(0);
        System.out.println("Jumlah Mahasiswa: " + dataM.jumlahMahasiswa());
    }
}