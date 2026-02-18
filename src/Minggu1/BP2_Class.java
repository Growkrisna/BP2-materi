package Minggu1;
import java.util.*;
class MahaSiswa {
    // var data
    private String nama;
    private String npm;
    private double ipk;

    // method
    void isiData(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nama = ");
        nama = scan.next();
        System.out.print("NPM = ");
        npm = scan.next();
        System.out.print("IPK = ");
        ipk = scan.nextDouble();
    }

    void isiData(String nm, String np, double ip) {
        this.nama = nm;
        npm = np;
        ipk = ip;
    }

    void cetakData() {
        System.out.println("Data Mahasiswa");
        System.out.println("Nama : " + nama);
        System.out.println("NPM : " + npm);
        System.out.println("IPK : " + ipk);
    }
}
