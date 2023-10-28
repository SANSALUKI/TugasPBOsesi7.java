public class Transaksi {
    int poli;
    int doktear;
    String ket;

    void viewpoli() {
        System.out.println("NAMA POLI");
        System.out.println("1. GIGI");
        System.out.println("2. ANAK");
        System.out.println("3. UMUM");
    }

    public String getPoli() {
        String hasil = null;

        if (this.poli == 1) {
            hasil = "GIGI";
        } else if (this.poli == 2) {
            hasil = "ANAK";
        } else if (this.poli == 3) {
            hasil = "UMUM";
        }

        return hasil;
    }

    public void setPoli(int poli) {
        this.poli = poli;
    }
    public void setDokter(int dokter) {
        this.doktear = dokter;
    }
    public void setKeterangan(String ket){
        this.ket = ket;
    }
    public String getKet() {
        return ket;
    }
    void viewdoktear() {
        System.out.println("Nama Dokter");
        System.out.println("1. drg. Ahmad Afandi");
        System.out.println("2. dr. Aris Wicaksono, Sp.A.");
        System.out.println("3. dr. Alfis Putri");
    }

    public String getDoktear() {
        String hasil = "";

        if (this.doktear == 1) {
            hasil = "drg. Ahmad Afandi";
        } else if (this.doktear == 2) {
            hasil = "dr. Aris Wicaksono, Sp.A.";
        } else if (this.doktear == 3) {
            hasil = "dr. Alfis Putri";
        }

        return hasil;
    }

}   
