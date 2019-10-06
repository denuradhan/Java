package JS4.tugas;

public class Service {
    private int tambahLike = 0, tambahFollow = 0;

    public Service() {
    }

    public Service(int tambahLike, int tambahFollow) {
        this.tambahLike = tambahLike;
        this.tambahFollow = tambahFollow;
    }

    public int getTambahLike() {
        return tambahLike;
    }

    public void setTambahLike(int tambahLike) {
        this.tambahLike = tambahLike;
    }

    public int getTambahFollow() {
        return tambahFollow;
    }

    public void setTambahFollow(int tambahFollow) {
        this.tambahFollow = tambahFollow;
    }
    
    public void info(){
        if(tambahLike != 0){
            System.out.println("Tambah Likes\t: " + tambahLike);
        }
        if(tambahFollow != 0){
            System.out.println("Tambah Followers: " + tambahFollow);
        }
        System.out.println("Total Bayar\t: Rp." + totalBayar());
    }
    
    public int hitungLike(){
        return tambahLike * 100;
    }
    
    public int hitungFollow(){
        return tambahFollow * 1000;
    }
    
    public int totalBayar(){
        return hitungLike() + hitungFollow();
    }
}