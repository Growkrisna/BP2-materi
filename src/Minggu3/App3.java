package Minggu3;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int code = 100;
        cBarang barang = null;
        cPembeli pembeli = null;
        cTransaksi tex = new cTransaksi();
        int pilih, sub_pilih;

        do{
            System.out.println("\\ Aplikasi warung \\");
            System.out.println("1. Barang\n2. Pembeli\n3. Transaksi\n4. Exit");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();
            System.out.println("");

            switch(pilih){
                case 1:
                    System.out.println("|| Menu Barang ||");
                    System.out.println("1. Tambah\n2. Lihat\n3. Ubah Harga\n4. Hapus");
                    System.out.print("Pilih : ");

                    sub_pilih = sc.nextInt();

                    System.out.println("");
                    switch (sub_pilih) {
                        case 1:
                            // barang = new cBarang(1, "Beras", 19000, 100);
                            System.out.print("ID : ");
                            int kd = sc.nextInt();
                            System.out.print("Nama = ");
                            String nm = sc.next();
                            System.out.print("Harga : ");
                            double hg = sc.nextDouble();
                            System.out.print("Stok : ");
                            int st = sc.nextInt();
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
                            hg = sc.nextDouble();
                            barang.setHarga(hg);
                            break;
                        case 4:
                            System.out.println("Yakin hapus?");
                            System.out.print("1. Ya / 2. Tidak : ");
                            int yakin_hapus = sc.nextInt();
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
                    sub_pilih = sc.nextInt();

                    switch (sub_pilih) {
                        case 1:
                            System.out.print("ID : ");
                            int kd = sc.nextInt();
                            System.out.print("Nama : ");
                            String nm = sc.next();
                            System.out.print("Alamat : ");
                            String a = sc.next();
                            pembeli = new cPembeli(nm, a, kd);
                            break;
                        case 2:
                            if(pembeli != null){
                                System.out.println(pembeli.toString());
                            } else {
                                System.out.println("Tidak ada pembeli apapun");
                            }
                            break;
                        case 3:
                            System.out.print("Ubah nama : ");
                            nm = sc.next();
                            pembeli.setNama(nm);
                            break;
                        case 4:
                            System.out.println("Yakin hapus?");
                            System.out.print("1. Ya / 2. Tidak : ");
                            int yakin_hapus = sc.nextInt();
                            if (yakin_hapus == 1) {
                                pembeli = null;
                            }else {
                                System.out.println("Pembeli batal dihapus");
                            }
                            break;
                    
                        default:
                            break;
                    }

                    break;
                case 3:
                    System.out.println("|| Menu Transaksi ||");
                    // Ideal nya CRUD
                    code++;
                    System.out.print("Pembeli = ");
                    String p = sc.next();
                    pembeli = new cPembeli(p, "Magetan", 0);
                    System.out.print("Barang = ");
                    String b = sc.next();
                    if (b.equalsIgnoreCase(barang.getNama())){
                        System.out.print("Jumlah = ");
                        int q = sc.nextInt();
                    if(barang.getStok() > q){
                        tex.tambahTransaksi(code, barang, pembeli, q);
                        tex.cetakTransaksi();
                    } else {
                        System.out.println("Stok barang tidak mencukupi");
                    }
                    } else {
                        System.out.println("Barang tidak ada!");
                    }
                    break;
                case 4:
                    System.out.println("See you later..");
                    break;
            }
        }while(pilih != 4);
    }
}
