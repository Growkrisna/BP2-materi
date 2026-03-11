package Minggu3;

    public class cBarang {
    private int kode_barang;
    private String nama;
    private double harga;
    private int stok;


    // Method 

    cBarang(){ //default constructor
        System.out.println("Constructor default..");
        System.out.println();
    }

    cBarang(int k, String n, double h, int s ){
        kode_barang = k; nama = n; harga = h; stok = s;
        System.out.println("Object "+nama+" dibuat..");
    }

    // Setter untuk mengisi untuk mengubah

    public void setHarga(double h){harga = h;}

    public void setStrok(int s){stok = s;}

    public int getKode(){return kode_barang;}
    public String getNama(){return nama;}
    public int getStok(){return stok;}
    public double getHarga(){ return harga;}

    //Query
    public String ToString(){
        return "Kode   :"+kode_barang+" \nnama   :"+nama+" \nHarga  :"+harga+" \nStok   :"+stok;
    }

}