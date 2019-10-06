package JS4.tugas;

public class Pembeli {
    private int likesA, followA;
    private String nama, phone, ig;
    private Admin adm;
    private Service srv;
    private Transaksi trs;
    
    public Pembeli() {
    }
    
    public Admin getAdm() {
        return adm;
    }
    
    public void setAdm(Admin adm) {
        this.adm = adm;
    }
    
    public Service getSrv() {
        return srv;
    }
    
    public void setSrv(Service srv) {
        this.srv = srv;
    }
    
    public Transaksi getTrs() {
        return trs;
    }
    
    public void setTrs(Transaksi trs) {
        this.trs = trs;
    }
    
    public int getLikesA() {
        return likesA;
    }
    
    public void setLikesA(int likesA) {
        this.likesA = likesA;
    }
    
    public int getFollowA() {
        return followA;
    }
    
    public void setFollowA(int followA) {
        this.followA = followA;
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
    
    public String getIg() {
        return ig;
    }
    
    public void setIg(String ig) {
        this.ig = ig;
    }
    
    public void info(){
        System.out.println("Nama\t\t: " + nama);
        System.out.println("IG\t\t: " + ig);
        System.out.println("Phone\t\t: " + phone);
    }
}