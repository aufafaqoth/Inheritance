public class App {
    public static void main(String[] args) throws Exception {
        satpam T = new satpam();
        sales S = new sales();
        manager M = new manager();

        T.setSatpam(042, "Rendra","Jl. Itik 15",2000,"Kepala", 300000,5);
        T.setGajiPokok(5);
        S.setSales(185, "Wibisana","Jl. Ayam 78",2006, "Supervisor", 500000,10);
        S.setGajiPokok(5);
        M.setManager(005, "Adi", "Jl. Angsa 56" , 1999, "Asisten", 1500000, "Keuangan");
        M.setGajiPokok(1999);

        System.out.println("\n\n==DISPLAY DATA KARYAWAN==");

        T.cetakSatpam();
        S.cetakSales();
        M.cetakManager(); 
    }
}
