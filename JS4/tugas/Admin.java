package JS4.tugas;

public class Admin {
    private int id;
    private String nama, phone;

    public Admin() {
    }

    public Admin(int id, String nama, String phone) {
        this.id = id;
        this.nama = nama;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void info(){
        System.out.println("ID Admin\t: " + id);
        System.out.println("Nama Admin\t: " + nama);
        System.out.println("Phone\t\t: " + phone);
    }
}
