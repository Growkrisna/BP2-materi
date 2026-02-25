package Minggu2;

public class App_warung {
    public static void main(String[] args) {

        System.out.println("Aplikasi Warung");
        cBarang_warung barang = new cBarang_warung(12, "beras",20000,20);

        barang.setHarga(12000);
        barang.setStrok(12);

        System.out.println("Data barang");

        // System.out.println("Kode    :"+ barang.getKode());
        // System.out.println("Nama    :"+ barang.getNama());
        // System.out.println("Harga   :"+ barang.getHarga());
        // System.out.println("Stok    :"+ barang.getStok());

        //Query
        System.out.println(barang.ToString());
    }
}
