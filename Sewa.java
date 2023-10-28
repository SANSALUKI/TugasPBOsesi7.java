import java.util.Scanner;

class Sewa {
    private int hargaSewa;
    private int jumlahJamSewa;

    public void pilihanJenisSewa() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilihan Jenis Penyewaan:");
        System.out.println("1. Rias Wajah (Biasa / Make Up Artis)");
        System.out.println("2. Baju Pengantin(Adat / International)");
        System.out.println("3. Aksesoris (Anak / Dewasa)");
        System.out.println("---------------------o0o--------------------");
        System.out.print("Pilihan anda : ");
        int pilihan = input.nextInt();
        System.out.println("---------------------o0o--------------------");
        if (pilihan == 1) {
            System.out.println("============= MENU RIAS WAJAH ============");
            System.out.println("1. Rias Wajah Biasa Rp. 100.000;");
            System.out.println("2. Rias Wajah (Make Up Artis) Rp. 250.000;");
            System.out.println("---------------------o0o--------------------");
            System.out.print("Pilihan anda : ");
            pilihan = input.nextInt();
            System.out.println("---------------------o0o--------------------");
            if (pilihan == 1) {
                hargaSewa = 100000;
            } else {
                hargaSewa = 250000;
            }
        } else if (pilihan == 2) {
            System.out.println("============= MENU BAJU PENGANTIN ============");
            System.out.println("1. Baju Pengantin Adat Rp. 150.000;");
            System.out.println("2. aju Pengantin International Rp. 350.000;");
            System.out.println("---------------------o0o--------------------");
            System.out.print("Pilihan anda : ");
            pilihan = input.nextInt();
            System.out.println("---------------------o0o--------------------");
            if (pilihan == 1) {
                hargaSewa = 150000;
            } else {
                hargaSewa = 350000;
            }
        } else if (pilihan == 3) {
            System.out.println("============= MENU AKSESORIS ============");
            System.out.println("1. Aksesoris Anak Rp. 20.000;");
            System.out.println("2. Aksesoris Dewasa Rp. 50.000;");
            System.out.println("---------------------o0o--------------------");
            System.out.print("Pilihan anda : ");
            pilihan = input.nextInt();
            System.out.println("---------------------o0o--------------------");
            if (pilihan == 1) {
                hargaSewa = 20000;
            } else {
                hargaSewa = 50000;
            }
        }
        System.out.print("Jumlah jam sewa : ");
        jumlahJamSewa = input.nextInt();
        System.out.println("Data Tersimpan");
        System.out.println("Harga sebesar : " + hargaSewa * jumlahJamSewa);
        System.out.println("---------------------o0o--------------------");
    }

    public int hargaSewa() {
        return hargaSewa * jumlahJamSewa;
    }
}
