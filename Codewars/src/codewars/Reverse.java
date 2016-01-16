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
public class Reverse {

    public String reverse(String str) {

        int ultimo = str.length() - 1;
        return (ultimo >= 0) ? str.charAt(ultimo) + reverse(str.substring(0, ultimo)):"";
        
    }

}
