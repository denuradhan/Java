package minggu6.percobaan5;
public class Manager extends Karyawan{
    public int tunjangan;
    public Manager() {
    }
    public void tampilDataManager() {
        super.tampilDataKaryawan();
        System.out.println("Tunjangan       = "+tunjangan);
        System.out.println("total Gaji      = "+(super.gaji+tunjangan));
    }
}
