package Kuis1;

/**
 *
 * @author Denuradhan
 */
public class Machine {
    int speed, increaseSpeed, reduceSpeed, maxspeed;
    boolean engine;
    
    public Machine(int increaseSpeed, int decreaseSpeed) {
        this.speed = 0;
        this.maxspeed = 430;
        this.engine = false;
        this.increaseSpeed = increaseSpeed;
        this.reduceSpeed = decreaseSpeed;
    }
    
    public void increaseSpeed() {
        speed+=increaseSpeed;
        if (speed>maxspeed) {
            System.out.println("Maximum Speed is "+getMax()+" Km/Hr");
            speed = maxspeed;
        }
    }
    
    public void reduceSpeed() {
        speed-=reduceSpeed;
        if (speed<0) {
            System.out.println("Minimum Speed is 0 km/Hr");
            speed = 0;
        }
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int getMaxSpeed() {
        return increaseSpeed;
    }
    
    public int getMinSpeed() {
        return reduceSpeed;
    }
    
    public boolean isEngine() {
        return engine;
    }  

    public int getMax() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }   
}
