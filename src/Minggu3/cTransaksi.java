package Minggu3;

class cTransaksi {
    protected int id_transaksi;
    protected cBarang barang;
    protected cPembeli pembeli;
    protected String tanggal;
    protected int qty;
    protected double total;

    cTransaksi(){}

    void tambahTransaksi(int i, cBarang b, cPembeli p, int q){
        //cek stok sebelum eksekusi
        id_transaksi = i; barang = b; pembeli = p; qty = q; 
        total = qty*barang.getHarga();
        if(barang.getStok() < qty){
            System.out.println("Barang tidak ada stok");
        } else {
            System.out.println("Stok tersedia "+ barang.getStok());
        }
        barang.setStrok(barang.getStok() - qty);
    }

    void cetakTransaksi(){
        System.out.println("Data Transaksi");
        System.out.println("ID        : " + id_transaksi);
        System.out.println("Pembeli   : " + pembeli.getNama());
        System.out.println("Barang    : " + barang.getHarga());
        System.out.println("Jumlah    : " + qty);
        System.out.println("Total     : " + total);
    }

}
