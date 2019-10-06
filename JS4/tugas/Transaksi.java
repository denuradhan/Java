package JS4.tugas;

import java.util.Random;
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;

public class Transaksi {
    private int id = (int)(Math.random()*1000);
    private String tanggal;
    Random random = new Random();

    public Transaksi() {
    }

    public int getId() {
        return id;
    }
    
    public void infoTransaksi(){
        System.out.println("ID Transaksi\t: " + id);
        System.out.println("Tanggal Trasaksi: " + getTanggal());
    }
    
    private String getTanggal() {  
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");  
        Date date = new Date();  
        return dateFormat.format(date); 
    }
}