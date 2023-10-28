import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int jsDaftar, jsObat, jsVitamin, jsDok;
        Pemesanan pesan = new Pemesanan();
        Transaksi order = new Transaksi();
        System.out.println(" ================================================= ");
        System.out.println(" ----- SELAMAT DATANG DI RUMAH SAKIT WARAS ----- ");
        System.out.println(" ================================================= ");
        System.out.println();
        System.out.println("  ----------------------o0o----------------------  ");
        System.out.println("*Masukan Data Pasien*");

        System.out.print("Masukan Nama      : ");
        pesan.setNama(sc.nextLine());

        System.out.print("Masukan Alamat    : ");
        pesan.setAlamat(sc.nextLine());

        System.out.print("Masukan No. Telp  : ");
        pesan.setTelpon(sc.nextLine());

        System.out.println();

        order.viewpoli();
        System.out.println();
        System.out.print("Pilih Poli        : ");
        order.setPoli(sc.nextInt());
        sc.nextLine();
        System.out.println();

        order.viewdoktear();
        System.out.println();
        System.out.print("Pilih Dokter        : ");
        order.setDokter(sc.nextInt());
        sc.nextLine();

        System.out.println();
        System.out.print("Berikan Keterangan Dokter        : ");
        order.setKeterangan(sc.nextLine());

        System.out.println();

        System.out.print("Masukan Biaya Pendaftaran         : Rp.");
        jsDaftar = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Biaya Obat               : Rp.");
        jsObat = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Biaya Vitamin              : Rp.");
        jsVitamin = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukan Biaya Dokter           : Rp.");
        jsDok = sc.nextInt();
        sc.nextLine();

        System.out.println("  ----------------------o0o----------------------  ");
        System.out.println(" ================================================= ");
        System.out.println("Poli                        : "+order.getPoli());
       System.out.println("Dokter                       : "+order.getDoktear());
       System.out.println("Keterangan                   : "+order.getKet() );
       System.out.println();
       System.out.println("Total Biaya yang di Bayar Pasien : Rp."+(jsDaftar+jsObat+jsVitamin+jsDok));
       System.out.println();
       System.out.println("Salam sehat " + pesan.getNama() + " Dari Rumah Sakit Waras");

    }
}
