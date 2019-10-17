package Kuis1;

/**
 *
 * @author Denuradhan
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<MotorCycle> arrayMotorCycle = new ArrayList<MotorCycle>();
    static MotorCycle selected;
    static String car;
    public static void main(String[] args) {
        arrayMotorCycle.add(new MotorCycle("Honda", new Machine(10, 5)));
        arrayMotorCycle.add(new MotorCycle("Yamaha", new Machine(15, 10)));
        arrayMotorCycle.add(new MotorCycle("Suzuki", new Machine(25, 15)));
        arrayMotorCycle.add(new MotorCycle("Ducati", new Machine(50, 30)));
        arrayMotorCycle.get(2).getMachine().maxspeed = 200;
        System.out.println(arrayMotorCycle.get(0).getMachine().maxspeed);
        selectMotorCycle();
        while (true) {            
            menu();
        }
    }
    public static void addArray(String motorCycleName, int increaseSpeed, int reduceSpeed) {
        arrayMotorCycle.add(new MotorCycle(motorCycleName, new Machine(increaseSpeed, reduceSpeed)));
    }
    public static void rmArray(int index) {
        arrayMotorCycle.remove(index);
    }
    
    public static void selectMotorCycle() {
        System.out.println("========== Select Motor Cycle ==========");
        for (int i = 0; i < arrayMotorCycle.size(); i++) {
            System.out.println((i+1)+". "+arrayMotorCycle.get(i).getMotorCyclyName());
            if (i==arrayMotorCycle.size()-1) {
                System.out.println((i+2)+". Add New Motor Cycle ");
                System.out.println((i+3)+". Remove Motor Cycle ");
            }
        }
        System.out.println("================================");
        System.out.print("Input (number) >> ");
        int input = sc.nextInt();
        if (input-1==arrayMotorCycle.size()) {
            System.out.print("Input Motor Cycle Name : ");
            String carName = sc.next();
            System.out.print("Speed Increaser : ");
            int increaser = sc.nextInt();
            System.out.print("Speed Decreaser : ");
            int decreaser = sc.nextInt();
            addArray(carName, increaser, decreaser);
            selectMotorCycle();
        }else if (input-1<arrayMotorCycle.size()&&input-1>=0) {
            selected = arrayMotorCycle.get(input-1);
        }else if(input-1==arrayMotorCycle.size()+1){
            for (int i = 0; i < arrayMotorCycle.size(); i++) {
                System.out.println((i+1)+". "+arrayMotorCycle.get(i).getMotorCyclyName());
                if (i==arrayMotorCycle.size()-1) {
                    System.out.println((i+2)+". cancel ");
                }
            }
            System.out.print("Input (number) >> " );
            int input2 = sc.nextInt();
            if (input2-1<arrayMotorCycle.size()&&input2-1>=0) {
                rmArray(input2-1);
                System.out.println("Motor Cycle Removed");
                selectMotorCycle();
            }else if(input2-1==arrayMotorCycle.size()){
                System.out.println("Canceled");
                selectMotorCycle();
            }else{
                System.out.println("Input False");
                selectMotorCycle();
            }
        }else{
            System.out.println("Input False");
        }
    }
    public static void menu() {
        System.out.println("========== "+selected.getMotorCyclyName()+" ==========");
        System.out.println("1. Motor Engine       => "+selected.getMachine().engine);
        System.out.println("   Current Speed    => "+selected.getMachine().speed);
        System.out.println("2. Add More Speed");
        System.out.println("3. Reduce Speed");
        System.out.println("4. Select Motor Cycle");
        System.out.println("5. Quit");
        System.out.println("===========================================");
        System.out.print("Input (Number) >> ");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                selected.getMachine().engine = !selected.getMachine().engine;
                if (selected.getMachine().engine == false) {
                    selected.getMachine().speed = 0;
                }
                break;
            case 2:
                if (selected.getMachine().engine) {
                    selected.getMachine().increaseSpeed();
                }else{
                    System.out.println("===========================================");
                    System.out.println("Start Engine First");
                }
                break;
            case 3:
                if (selected.getMachine().engine) {
                    System.out.println("===========================================");
                    selected.getMachine().reduceSpeed();
                }else{
                    System.out.println("Start Engine First");
                }                
                break;
            case 4:
                selectMotorCycle();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Input False");;
        }
    }
}
