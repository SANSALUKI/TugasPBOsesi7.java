import java.util.Scanner;

class Perawatan {
    private int hargaPerawatan;
    private int jumlahOrang;

    public void pilihanJenisPerawatan() {
        Scanner input = new Scanner(System.in);
        System.out.println("* Jenis Perawatan *");
        System.out.println("1. Facial Wajah");
        System.out.println("2. Masker");
        System.out.println("3. Potong Rambut");
        System.out.println("---------------------o0o--------------------");
        System.out.print("Pilihan anda : ");
        int pilihan = input.nextInt();
        System.out.println("---------------------o0o--------------------");
        if (pilihan == 1) {
            System.out.println("============= MENU FACIAL WAJAH ============");
            System.out.println("1. Facial Biasa Rp. 50.000;");
            System.out.println("2. Facial Emas Rp. 100.000;");
            System.out.println("---------------------o0o--------------------");
            System.out.print("Pilihan anda : ");
            pilihan = input.nextInt();
            System.out.println("---------------------o0o--------------------");
            if (pilihan == 1) {
                hargaPerawatan = 50000;
            } else {
                hargaPerawatan = 100000;
            }
        } else if (pilihan == 2) {
            System.out.println("============== MENU MASKER ===============");
            System.out.println("1. Masker Buah Rp. 40.000;");
            System.out.println("2. Facial Lumpur Rp. 75.000;");
            System.out.println("---------------------o0o--------------------");
            System.out.print("Pilihan anda : ");
            pilihan = input.nextInt();
            System.out.println("---------------------o0o--------------------");
            if (pilihan == 1) {
                hargaPerawatan = 40000;
            } else {
                hargaPerawatan = 75000;
            }
        } else if (pilihan == 3) {
            System.out.println("============ MENU POTONG RAMBUT ============");
            System.out.println("1. Tidak Keramas Rp. 20.000;");
            System.out.println("2. Keramas Rp. 35.000;");
            System.out.println("---------------------o0o--------------------");
            System.out.print("Pilihan anda : ");
            pilihan = input.nextInt();
            System.out.println("---------------------o0o--------------------");
            if (pilihan == 1) {
                hargaPerawatan = 20000;
            } else {
                hargaPerawatan = 35000;
            }
        }
        System.out.print("Jumlah orang: ");
        jumlahOrang = input.nextInt();
        System.out.println("Data Tersimpan");
        System.out.println("Harga sebesar : " + hargaPerawatan * jumlahOrang);
        System.out.println("---------------------o0o--------------------");
    }

    public int hargaPerawatan() {
        return hargaPerawatan * jumlahOrang;
    }
}
