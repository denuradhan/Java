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
public class Triangle extends Shape{
    int base, height;

    @Override
    public double getArea() {
        return 0.5*(base*height);
    }

    @Override
    public String toString() {
        String tmp = "area : ";
        tmp += Double.toString(0.5*(base*height));
        return tmp;
    }
}
