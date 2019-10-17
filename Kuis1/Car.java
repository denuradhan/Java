package Kuis1;

/**
 *
 * @author Denuradhan
 */
public class Car {
    String carName;
    Machine machine;
    public Car(String carName, Machine machine) {
        this.carName = carName;
        this.machine = machine;
    }
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }
}
