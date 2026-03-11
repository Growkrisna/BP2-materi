package Minggu3;

class cPembeli {
    private int id;
    private String nama, alamat;

    cPembeli(){
        System.out.println("Objek pembeli dibuat...");
    }

    cPembeli(String n, String a, int i){
        this.nama = n;
        this.alamat = a;
        this.id = i;
        System.out.println("Objek " + nama +" dibuat");
    }

    public void setAlamat(String a){this.alamat = a;}

    public void setNama(String n){this.nama = n;}

    public String getNama(){return nama;}

    public int getId(){return id;}

    public String getAlamat(){return alamat;}

    public String toString(){
        return "id : "+ id + "\nNama : " + nama + "\nAlamat : "+ alamat;
    }

}