package minggu6.tugas;
public class Laptop extends Komputer{
    public String jnsBatrei;

    public Laptop() {
    }

    public Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei = jnsBatrei;
    }
    public void tampilLaptop() {
        tampilData();
        System.out.println("Jenis Batrei        = "+jnsBatrei);
    }
}
