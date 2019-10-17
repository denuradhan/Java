/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu8;

/**
 *
 * @author Denuradhan
 */
public class Rectangle extends Shape{
    int length, width;
    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public String toString() {
        String tmp = "area : ";
        tmp += Integer.toString(width*length);
        return tmp;
    }
    
}
