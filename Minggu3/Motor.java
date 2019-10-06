package Minggu3;
public class Motor {
    private int kecepatan = 90;
    private boolean kontakOn = false;
    
    public void nyalakanmesin() {
        kontakOn = true;
    }
    public void matikanMesin() {
        kontakOn = false;
        kecepatan = 0;
    }
    public void tambahKecepatan(){
        if (kontakOn==true) {
            if (kecepatan>=100) {
                kecepatan=100;
            }else{
                kecepatan+=5;
            }
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin Off! \n");
        }
        
    }
    public void kurangiKecepatan(){
        if (kontakOn==true) {
            kecepatan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena mesin Off! \n");
        }
    }
    public void printStatus(){
        if (kontakOn==true) {
            System.out.println("Kontak On");
        }
        else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+ kecepatan+"\n");
    }
    
}
