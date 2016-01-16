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
public class Fibonacci {

    public static long countOddPentaFib(long n) {
        // your code
        long ret=0;
        long n1=0,n2=1,n3=0;
        for (int i = 1; i <= n; i++) {
            n3=n1+n2;
            if (n3%2!=0) {
                ret++;
            }
            n1=n2;
            n2=n3;
            
        }
        return ret;
    }
}
