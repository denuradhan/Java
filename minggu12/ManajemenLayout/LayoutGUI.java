/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu12.ManajemenLayout;

/**
 *
 * @author Denuradhan
 */
import javax.swing.JFrame;
public class LayoutGUI {
    public static void main(String[] args) {
        JFrame border = new Border();
        border.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        border.setVisible(true);
        
        JFrame grid = new Grid();
        grid.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        grid.setVisible(true);
        
        JFrame box = new Box();
        box.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        box.setVisible(true);
    }
}
