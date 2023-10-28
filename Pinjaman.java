import java.util.Scanner;

public class Pinjaman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ================================================= ");
        System.out.println(" ----- WELCOME TO THE SOLUTION OF MONEY ----- ");
        System.out.println(" ================================================= ");
        System.out.println();
        System.out.println("  ----------------------o0o----------------------  ");
        System.out.println("SILAHKAN PILIH PAKET PINJAMAN :");
        System.out.println("1. KARUNG");
        System.out.println("2. PAPER BAG");
        System.out.println();
        System.out.print("MASUKKAN PILIHAN PAKET : ");
        int pilihan = scanner.nextInt();
        System.out.println("  ----------------------<*>----------------------  ");
        System.out.println();
        System.out.println("Silahkan Masukan Data Anda");
        System.out.println("  ----------------------<*>----------------------  ");
        System.out.print("Masukkan nama peminjam : ");
        scanner.nextLine();
        String namaPeminjam = scanner.nextLine();

        System.out.print("Masukkan nomor KTP peminjam : ");
        String nomorKtpPeminjam = scanner.next();

        if (pilihan == 1) {
            Karung karung = new Karung();
            karung.setUkuranKarung();
            System.out.println();

            System.out.print("Berapa Lama Pinjam (bulan) : ");
            int bulan = scanner.nextInt();
            karung.hitungBungaDanKewajiban(bulan);

            System.out.println();
            System.out.println("Anda Memilih Paket " + karung.getUkuranBaju());
            System.out.println("Dengan Pinjam : Rp. " + karung.getHargaBaju());
            System.out.println("Dengan Bunga : Rp. " + karung.getBunga());
            System.out.println();
            System.out.println("  ------------------------------------");
            System.out.println("  -----Total Kewajiban Pinjaman ----- ");
            System.out.println("Nama Peminjam : " + namaPeminjam);
            System.out.printf("Kewajiban Bulanan: Rp%,.2f%n", karung.getKewajibanBulanan());
            System.out.println();
            System.out.printf("Total Wajib Bayar: Rp%,.2f%n", karung.getTotalWajibBayar());
            System.out.println();
            System.out.println(
                    "Terimakasih sudah meminjam di THE SOLUTION OF MONEY \n Pusing dengan Keuangan... Kami Solusinya (*_*)");

        } else if (pilihan == 2) {
            PaperBag pprbag = new PaperBag();
            pprbag.setUkuranPaper_bag();
            System.out.println();

            System.out.println("  ----------------------o0o----------------------  ");

            System.out.print("Berapa Lama Pinjam (bulan) : ");
            int bulan = scanner.nextInt();
            pprbag.hitungBungaDanKewajiban(bulan);

            System.out.println();
            System.out.println("Anda Memilih Paket " + pprbag.getUkuranPaper_bag());
            System.out.println("Dengan Pinjam : Rp. " + pprbag.getHargaPaper_bag());
            System.out.println("Dengan Bunga : Rp. " + pprbag.getBunga());
            System.out.println();
            System.out.println("  ------------------------------------");
            System.out.println("  -----Total Kewajiban Pinjaman ----- ");
            System.out.println("Nama Peminjam : " + namaPeminjam);
            System.out.printf("Kewajiban Bulanan: Rp%,.2f%n", pprbag.getKewajibanBulanan());
            System.out.println();
            System.out.printf("Total Wajib Bayar: Rp%,.2f%n", pprbag.getTotalWajibBayar());
            System.out.println();
            System.out.println(
                    "Terimakasih sudah meminjam di THE SOLUTION OF MONEY \n Pusing dengan Keuangan... Kami Solusinya (*_*)");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}