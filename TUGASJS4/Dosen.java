package TUGASJS4;
public class Dosen {
    private String nama;
    private int kode, temp=0, maxMahasiswa;
    private Mahasiswa mahasiswa[];
    private Matkul matkul;
    public Dosen(String nama, int kode, int jmlMahasiswa) {
        this.nama = nama;
        this.kode = kode;
        this.mahasiswa = new Mahasiswa[jmlMahasiswa];
        this.maxMahasiswa = jmlMahasiswa;
    }
    public void initMahasiswa(String nama, int absen) {
        if (temp>=maxMahasiswa) {
            System.out.println("Maaf Mahasiswa Penuh");
        }else{
            mahasiswa[temp]= new Mahasiswa(nama, absen);
            temp+=1;
        }     
    }
    public void initMatakuliah(String namaMatkul, String namaKelas){
        matkul = new Matkul(namaMatkul);
        matkul.setKelas(namaKelas);
    }
    public void Info() {
        System.out.println("========Dosen========");
        System.out.println("Nama Dosen  : "+nama);
        System.out.println("Kode Dosen  : "+kode);
        matkul.Info();
        System.out.println("======Mahasiswa======");
        for (int i = 0; i < temp; i++) {
            mahasiswa[i].Info();
        }
    }
    
}
    
