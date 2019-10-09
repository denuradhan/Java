package Kuis1;

/**
 *
 * @author Denuradhan
 */
public class MotorCycle {
    String motorCyclyName;
    Machine machine;
    public MotorCycle(String motorCyclyName, Machine machine) {
        this.motorCyclyName = motorCyclyName;
        this.machine = machine;
    }

    public String getMotorCyclyName() {
        return motorCyclyName;
    }

    public void setMotorCyclyName(String motorCyclyName) {
        this.motorCyclyName = motorCyclyName;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }
    
}
