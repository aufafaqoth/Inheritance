public class manager extends pegawai {
    private double gajiPokok, total, tunjangan;
    private String divisi;

    public manager(){
        super.pegawai(0, 0, null, null, null);
        gajiPokok = gajiPokok;
        tunjangan = tunjangan;
        divisi = divisi;
    }
    public void setManager(int NIP, String nama, String alamat, int thnKerja, String jabatan, double gajiPokok, String divisi){
        super.NIP = NIP;
        super.nama = nama;
        super.alamat = alamat;
        super.thnKerja = thnKerja;
        super.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.divisi = divisi;
    }
    
    public double tunjangan(int x){
        x = 2022 - super.thnKerja;
        if ( x >= 5 ) {
            this.tunjangan = gajiPokok * 10 / 100; 
        }else if ( x >= 3 ){
            this.tunjangan = gajiPokok * 5 / 100;
        }
        return this.tunjangan;
    }
    public void setGajiPokok(int thnKerja){
        tunjangan(0);
        total = gajiPokok + this.tunjangan;
    }
    public void cetakManager(){
        System.out.println("Data Sales");
        System.out.println("NIP : " + NIP);
        System.out.println("Tahun Kerja : " + thnKerja);
        System.out.println("Nama : " + nama);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Alamat : " + alamat);
        System.out.println("Gaji Pokok : Rp. " + gajiPokok);
        System.out.println("Divisi : " + divisi);
        System.out.println("Tunjangan Jabatan : Rp. " + tunjangan);
        System.out.println("Total Gaji : Rp. " + total);
    }
}

