package TUGASJS4;
public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen("Angga", 123, 30);
        dosen.initMahasiswa("denny", 123);
        dosen.initMahasiswa("dharma", 345);
        dosen.initMahasiswa("rashit", 789);
        dosen.initMatakuliah("PBO", "KB2");
        dosen.Info();
    }
}
