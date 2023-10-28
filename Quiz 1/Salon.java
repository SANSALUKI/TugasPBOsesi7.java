import java.util.Scanner;

class Salon {
    private String nama;
    public Salon(String nama, String noTelepon) {
        this.nama = nama;
    }

    public void menu() {
        Scanner input = new Scanner(System.in);
        Perawatan perawatan = new Perawatan();
        Sewa sewa = new Sewa();

        int totalHargaPerawatan = 0;
        int totalHargaSewa = 0;

        char ulang;
        do {
            System.out.println("Menu Pilihan Yang Tersedia:");
            System.out.println("1. Perawatan");
            System.out.println("2. Penyewaan");
            System.out.println("---------------------o0o--------------------");
            System.out.print("Pilihan menu : ");
            int pilihanMenu = input.nextInt();
            System.out.println("---------------------o0o--------------------");

            switch (pilihanMenu) {
                case 1:
                    perawatan.pilihanJenisPerawatan();
                    totalHargaPerawatan += perawatan.hargaPerawatan();
                    break;
                case 2:
                    sewa.pilihanJenisSewa();
                    totalHargaSewa += sewa.hargaSewa();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

            System.out.print("\nIngin memasukkan data lagi? (y/t): ");
            ulang = input.next().charAt(0);
            System.out.println("---------------------o0o--------------------");
        } while (ulang == 'y' || ulang == 'Y');

        int totalHarga = totalHargaPerawatan + totalHargaSewa;
        System.out.println("Total yang harus dibayar: Rp. " + totalHarga + ",-");
        System.out.println();
        System.out.println("Terima kasih " + nama
                + " Sudah Datang Di Salon Damara \nMembuat Anda cantik adalah keahlian kami");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println();
        System.out.println("=============================================");
        System.out.println("--- Selamat Datang Di Salon Damara ---");
        System.out.println("=============================================");
        System.out.print("Masukkan nama Pelanggan    : ");
        String nama = input.nextLine();
        System.out.print("Masukkan No.Telp Pelanggan : ");
        String noTelepon = input.nextLine();
        System.out.println();
        System.out.println("---------------------o0o--------------------");
        Salon salon = new Salon(nama, noTelepon);
        salon.menu();
    }
}
