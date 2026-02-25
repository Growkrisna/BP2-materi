package Minggu2;

class cBarang_warung {

    //Data barang

    private int kode_barang;
    private String nama;
    private double harga;
    private int stok;


    // Method 

    cBarang_warung(){ //default constructor
        System.out.println("Constructor default..");
        System.out.println();
    }

    cBarang_warung(int k, String n, double h, int s ){
        kode_barang = k; nama = n; harga = h; stok = s;
        System.out.println("Object "+nama+" dibuat..");
    }

    // Setter untuk mengisi untuk mengubah

    public void setHarga(double h){harga = h;}

    public void setStrok(int s){stok = s;}

    public double getHarga(){ return harga;}
    public int getStok(){return stok;}
    public String getNama(){return nama;}
    public int getKode(){return kode_barang;}

    //Query
    public String ToString(){
        return "Kode   :"+kode_barang+" \nnama   :"+nama+" \nHarga  :"+harga+" \nStok   :"+stok;
    }

}
