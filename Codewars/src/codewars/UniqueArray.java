/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author jordan
 */
public class UniqueArray {

    public static int[] unique(int[] integers) {

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < integers.length; i++) {
            for (int j = 0; j < integers.length; j++) {
                if (j != i) {
                    if (integers[i] == integers[j]) {
                        integers[j] = -1;
                    }
                }
            }

        }
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] != -1) {
                list.add(String.valueOf(integers[i]));
            }
        }
        int[] enteros=new int[list.size()];
        int i =0;
        Iterator item = list.iterator();
        while (item.hasNext()) {
            enteros[i]=Integer.parseInt(item.next().toString());
            // System.out.println(item.next());
            i++;
        }
    
    return enteros;
    }

}
