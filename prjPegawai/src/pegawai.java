public class pegawai {
    
    protected int NIP, thnKerja;
    protected String nama, alamat, jabatan;

    public void pegawai(int NIP, int thnKerja, String nama, String alamat, String jabatan ){
        NIP = NIP;
        thnKerja = thnKerja;
        nama = nama;
        alamat = alamat;
        jabatan = jabatan;
    }
    public void setNIP(int NIP){
        this.NIP = NIP;
    }
    public void setThnKerja(int thnKerja){
        this.thnKerja = thnKerja;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setJabatan(String jabatan){
        this.jabatan = jabatan;
    }
    public int getNIP(){
        return NIP;
    }
    public int getThnKerja(){
        return thnKerja;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getJabatan(){
        return jabatan;
    }
    public void cetakPegawai(){
        System.out.println("Data Karyawan");
        System.out.println("NIP : " + getNIP());
        System.out.println("Tahun Kerja : " + getThnKerja());
        System.out.println("Nama : " + getNama());
        System.out.println("Jabatan : " + getJabatan());
        System.out.println("Alamat : " + getAlamat());
    }
}
