public class sales extends pegawai {
    private double gajiPokok, total, bonus;
    private int pelanggan;

    public sales(){
        super.pegawai(0, 0, null, null, null);
        gajiPokok = gajiPokok;
        bonus = bonus;
        pelanggan = pelanggan;
    }
    public void setSales(int NIP, String nama, String alamat, int thnKerja, String jabatan, double gajiPokok, int pelanggan){
        super.NIP = NIP;
        super.nama = nama;
        super.alamat = alamat;
        super.thnKerja = thnKerja;
        super.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.pelanggan = pelanggan;
    }
    public void setGajiPokok(double gajiPokok, int pelanggan){
        gajiPokok = gajiPokok;
        pelanggan = pelanggan;
        total = gajiPokok + (bonus*pelanggan);
    }

    public void setGajiPokok(int pelanggan){
        gajiPokok = 3000000;
        pelanggan = pelanggan;
        total = gajiPokok + (50000*pelanggan);
    }
    public void cetakSales(){
        System.out.println("Data Sales");
        System.out.println("NIP : " + NIP);
        System.out.println("Tahun Kerja : " + thnKerja);
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Alamat : " + alamat);
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("Pegawai yang direkrut : " + pelanggan + " orang");
        System.out.println("Total Gaji : Rp. " + total);
    }
}
