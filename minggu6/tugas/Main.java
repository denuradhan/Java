package minggu6.tugas;
public class Main {
    public static void main(String[] args) {
        Mac mc = new Mac("MacBook Pro", 5, 2048, "intel", "batrei abc", "smadav");
        mc.tampilMac();
        System.out.println("-------------------------------------------------");
        Windows wd = new Windows("Asus VivoBook", 7, 2048, "Amd Ryzen 3", "PLTN", "everything is free");
        wd.tampilWindows();
        System.out.println("-------------------------------------------------");
        Pc pc = new Pc("ROG", 100, 1024000, "intel i99", 30);
        pc.tampilPc();
    }
}
