import java.util.Scanner;

public class Karung {
    private String ukuranKarung;
    private long hargaKarung;
    private double bunga;
    private double kewajibanBulanan;
    private double totalWajibBayar;

    public void setUkuranKarung() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Pilih ukuran Karung:");
        System.out.println("=========================");
        System.out.println("1. XL");
        System.out.println("2. L");
        System.out.println("3. M ");
        System.out.println();
        System.out.print("MASUKKAN PILIHAN : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                ukuranKarung = "XL";
                hargaKarung = 100000000;
                break;
            case 2:
                ukuranKarung = "L";
                hargaKarung = 75000000;
                break;
            case 3:
                ukuranKarung = "M";
                hargaKarung = 50000000;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public void hitungBungaDanKewajiban(int bulan) {
        bunga = hargaKarung * 0.025;
        kewajibanBulanan = (bunga * bulan + hargaKarung) / bulan;
        totalWajibBayar = hargaKarung + (bunga * bulan);
    }

    public String getUkuranBaju() {
        return ukuranKarung;
    }

    public long getHargaBaju() {
        return hargaKarung;
    }

    public double getBunga() {
        return bunga;
    }

    public double getKewajibanBulanan() {
        return kewajibanBulanan;
    }

    public double getTotalWajibBayar() {
        return totalWajibBayar;
    }
}