public class satpam extends pegawai {
    private double gajiPokok, total, bonus;
    private int lembur;

    public satpam(){
        super.pegawai(0, 0, null, null, null);
        gajiPokok = gajiPokok;
        bonus = bonus;
        lembur = lembur;
    }
    public void setSatpam(int NIP, String nama, String alamat, int thnKerja, String jabatan, double gajiPokok, int lembur){
        super.NIP = NIP;
        super.nama = nama;
        super.alamat = alamat;
        super.thnKerja = thnKerja;
        super.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.lembur = lembur;
    }
    public void setGajiPokok(double gajiPokok, int lembur){
        gajiPokok = gajiPokok;
        lembur = lembur;
        total = gajiPokok + (bonus*lembur);
    }

    public void setGajiPokok(int lembur){
        gajiPokok = 2000000;
        lembur = lembur;
        total = gajiPokok + (10000*lembur);
    }
    public void cetakSatpam(){
        System.out.println("Data Satpam");
        System.out.println("NIP : " + NIP);
        System.out.println("Tahun Kerja : " + thnKerja);
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Alamat : " + alamat);
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("Jam Lembur : " + lembur + " jam");
        System.out.println("Total Gaji : Rp. " + total);

    }
}
