package minggu6.tugas;
public class Windows extends Laptop{
    public String fitur;
    public Windows() {
    }

    public Windows(String merk, int kecProsesor, int sizeMemory, 
                   String jnsProsesor, String jnsBatrei, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur = fitur;
    }
    public void tampilWindows() {
        tampilLaptop();
        System.out.println("fitur               = "+fitur);
    }
    
}
