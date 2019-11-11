/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu11.tugas;

/**
 *
 * @author Denuradhan
 */
public class JumpingZombie extends Zombie{
    
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }
    
    @Override
    public void heal() {
        switch(this.level){
            case 1:{
                this.health += this.health * 30 / 100;
                break;
            }
            
            case 2:{
                this.health += this.health * 40 / 100;
                break;
            }
            
            case 3:{
                this.health += this.health * 50 / 100;
                break;
            }
        }
    }
    
    @Override
    public void destroyed(){
        this.health -= this.health * 10 / 100;
    }
    
    @Override
    public String getZombieInfo(){
        return " -> Jumping Zombie's Info : " + super.getZombieInfo();
    }
    
}
