package minggu4;
public class Processor {
    private String merk;
    private double cache;
    public Processor() {
        this.merk = "ASUS";
        this.cache = 10;
    }
    public Processor(String merk, double cache) {
        this.merk = merk;
        this.cache = cache;
    }
    public String getMerk() {
        return merk;
    }
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public double getCache() {
        return cache;
    }
    public void setCache(double cache) {
        this.cache = cache;
    }
    public void Info() {
        System.out.println("Merk Processor = "+merk);
        System.out.println("Cache Memory = "+cache);
    }
}
