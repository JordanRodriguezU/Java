/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

/**
 *
 * @author jordan
 */
public class Persist {

    public static int persistence(long n) {

        int pasadas=0;
        while ((n/10)!=0) {            
            String num= String.valueOf(n);
            double result=1;
            for (int i = 0; i < num.length(); i++) {
                result=result*Double.parseDouble(String.valueOf(num.charAt(i)))*1;
            }
            n=(long)result;
            pasadas++;
        }
        return pasadas;
    }
}
