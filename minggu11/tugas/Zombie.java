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
abstract class Zombie implements Destroyable{
    protected int health, level;
    
    abstract void heal(); 
    
    @Override
    public void destroyed() {
        
    }
    
    public String getZombieInfo(){
        return "\n\tLevel  : " + level +
               "\n\tHealth : " + health;
    }
}
