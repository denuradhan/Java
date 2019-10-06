package Minggu3;
public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();
        
        motor.nyalakanmesin();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.tambahKecepatan();
        motor.printStatus();
        
        motor.matikanMesin();
        motor.printStatus();
    }
}
