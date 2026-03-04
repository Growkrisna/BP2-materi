package Minggu3;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        cBarang barang = null;
        cPembeli pembeli;
        int pilih, sub_pilih;

        do{
            System.out.println("\\ Aplikasi warung \\");
            System.out.println("1. Barang\n2. Pembeli\n3. Exit");
            System.out.print("Pilih : ");
            pilih = scan.nextInt();
            System.out.println("");

            switch(pilih){
                case 1:
                    System.out.println("|| Menu Barang ||");
                    System.out.println("1. Tambah\n2. Lihat\n3. Ubah Harga\n4. Hapus");
                    System.out.print("Pilih : ");

                    sub_pilih = scan.nextInt();

                    System.out.println("");
                    switch (sub_pilih) {
                        case 1:
                            // barang = new cBarang(1, "Beras", 19000, 100);
                            System.out.print("ID : ");
                            int kd = scan.nextInt();
                            System.out.print("Nama = ");
                            String nm = scan.next();
                            System.out.print("Harga : ");
                            double hg = scan.nextDouble();
                            System.out.print("Stok : ");
                            int st = scan.nextInt();
                            barang = new cBarang(kd,nm,hg,st);

                            System.out.println("");
                            break;
                        case 2:
                            if(barang != null){
                                System.out.println(barang.toString());
                            } else {
                                System.out.println("Tidak ada barang apapun");
                            }
                            break;
                        case 3:
                            System.out.print("Ubah harga : ");
                            hg = scan.nextDouble();
                            barang.setHarga(hg);
                            break;
                        case 4:
                            System.out.println("Yakin hapus?");
                            System.out.print("1. Ya / 2. Tidak : ");
                            int yakin_hapus = scan.nextInt();
                            if (yakin_hapus == 1) {
                                barang = null;
                            }else {
                                System.out.println("Barang batal dihapus");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("|| Menu Pembeli ||");
                    System.out.println("1. Tambah\n2. Lihat\n3. Ubah\n4. Hapus");
                    System.out.print("Pilih : ");
                    sub_pilih = scan.nextInt();

                    break;
                case 3:
                    System.out.println("See you later..");
                    break;
            }
        }while(pilih != 3);
        
    }
}