import java.util.Scanner;

public class PaperBag {
    private String ukuranPaper_bag;
    private long hargaPaper_bag;
    private double bunga;
    private double kewajibanBulanan;
    private double totalWajibBayar;

    public void setUkuranPaper_bag() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=========================");
        System.out.println("Pilih ukuran Paper Bag:");
        System.out.println("=========================");
        System.out.println("1. XL");
        System.out.println("2. L ");
        System.out.println("3. M ");
        System.out.println();
        System.out.print("MASUKKAN PILIHAN : ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                ukuranPaper_bag = "XL";
                hargaPaper_bag = 30000000;
                break;
            case 2:
                ukuranPaper_bag = "L";
                hargaPaper_bag = 20000000;
                break;
            case 3:
                ukuranPaper_bag = "M";
                hargaPaper_bag = 10000000;
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }

    public void hitungBungaDanKewajiban(int bulan) {
        bunga = hargaPaper_bag * 0.025;
        kewajibanBulanan = (bunga * bulan + hargaPaper_bag) / bulan;
        totalWajibBayar = hargaPaper_bag + (bunga * bulan);
    }

    public String getUkuranPaper_bag() {
        return ukuranPaper_bag;
    }

    public long getHargaPaper_bag() {
        return hargaPaper_bag;
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
