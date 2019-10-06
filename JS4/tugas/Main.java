package JS4.tugas;

import java.util.Scanner;

public class Main {
    static Scanner scInt = new Scanner(System.in);
    static Scanner scString = new Scanner(System.in);
    
    static Pembeli p = new Pembeli();
    static Admin a;
    static Service s = new Service();
    static Transaksi t = new Transaksi();
    
    public static void main(String[] args) {
        System.out.println("=======Jual & Beli Follorwes=======");
        System.out.println("$$ 1 Like/100  & 1 Followers/1000 $$");
        System.out.println("Input Data Diri");
        dataPembeli();
        a = new Admin(1234, "John", "0342-1234");
        dataService();
        p.setAdm(a);
        detailTransaksi();
    }
        
    public static void dataPembeli(){
        System.out.print("Nama\t: ");
        p.setNama(scString.nextLine());
        System.out.print("Phone\t: ");
        p.setPhone(scString.next());
        System.out.print("IG\t: ");
        p.setIg(scString.next());
        System.out.print("Jumlah Like\t: ");
        p.setLikesA(scInt.nextInt());
        System.out.print("Jumlah Followers: ");
        p.setFollowA(scInt.nextInt());
    }
    
    public static void dataService(){
        System.out.println("\nSilahkan Pilih Service : ");
        System.out.println("1. Tambah Like");
        System.out.println("2. Tambah Followers");
        System.out.println("3. Tambah Like&Followers");
        System.out.print("Pilihan : ");
        int pil = scInt.nextInt();
        switch (pil) {
            case 1:
                System.out.print("Like (+) : ");
                s.setTambahLike(scInt.nextInt());
                break;
            case 2:
                System.out.print("Followers (+) :");
                s.setTambahFollow(scInt.nextInt());
                break;
            case 3:
                System.out.print("Like (+)      :");
                int like = scInt.nextInt();
                System.out.print("Followers (+) :");
                int foll = scInt.nextInt();
                s = new Service(like, foll);
                break;
            default:
                System.out.println("Inputan Salah!");
                break;
        }
        p.setSrv(s);
    }
    
    public static void detailTransaksi(){
        System.out.println("\n\n--Detail Transaksi--");
        System.out.println("<Pembeli>");
        p.info();
        System.out.println("Likes\t\t: " + (p.getLikesA()) + " >> " + (p.getLikesA() + s.getTambahLike()));
        System.out.println("Followers\t: " + (p.getFollowA()) + " >> " + (p.getFollowA() + s.getTambahFollow()));
        System.out.println("<Admin>");
        a.info();
        System.out.println("<Service>");
        s.info();
        System.out.println("");
        System.out.println("<Transaksi>");
        t.infoTransaksi();
    }
}
