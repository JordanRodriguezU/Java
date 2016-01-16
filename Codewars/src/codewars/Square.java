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
public class Square {

    public static boolean isSquare(int n) {
        double raiz=Math.sqrt(Double.parseDouble(String.valueOf(n)));
        if (raiz-Math.floor(raiz)==0) {
            return true;
        }
        else{
            return false;
        }
    }
}
