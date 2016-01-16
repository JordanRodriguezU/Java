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
public class SmallestIntegerFinder {

    public static int findSmallestInt(int[] args) {

        for (int i = 0; i < args.length; i++) {
            boolean validar=true;
            for (int j = 0; j < args.length; j++) {
                if (validar) {
                    if (args[i]>args[j]) {
                        validar=false;
                    }else {
                        if ((j+1)==args.length) {
                            return args[i];
                        }
                    }
                }
            }
        }
        return 0;
    }
}
