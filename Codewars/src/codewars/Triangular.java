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
public class Triangular {

    public static int triangular(int n) {
        int num=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j >= 0; j--) {
                num++;
            }
        }

        return num;
    }

}
