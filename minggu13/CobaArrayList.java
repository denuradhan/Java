/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ardan
 */
public class CobaArrayList {
    public static void main(String[] args) {
        List mListCountry = new ArrayList();
        mListCountry.add("Indonesia");
        mListCountry.add("France");
        mListCountry.add("German");
        System.out.println(mListCountry);
        System.out.println("Country List");
        Iterator mIterator = mListCountry.iterator();
//        System.out.format("List index 0 = %s\n", mListCountry.get(0));
//        System.out.format("List index 2 = %s\n", mListCountry.get(2));
        while(mIterator.hasNext()){
            Object element = mIterator.next();
            System.out.format("%s ",element);
        }
    }
}
