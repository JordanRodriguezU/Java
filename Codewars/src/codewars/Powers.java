/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewars;

import java.math.BigInteger;

/**
 *
 * @author jordan
 */
public class Powers {

    public static BigInteger powers(int[] list) {
        int elememts=list.length;
        String resultado=String.valueOf((int)Math.pow(2, elememts));
        BigInteger b=BigInteger.valueOf(Integer.parseInt(resultado));
        return b;
    }

}
