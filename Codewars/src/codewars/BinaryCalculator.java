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
public class BinaryCalculator {

    public static String calculate(final String n1, final String n2, final String o) {

        String cal = "";
        if (o.equals("add")) {
            for (int i = n1.length(); i > 0; i--) {

                int nu1 = Integer.parseInt(String.valueOf(n1.charAt(i - 1)));
                int nu2 = Integer.parseInt(String.valueOf(n2.charAt(i - 1)));
                if (nu1 == 1 && nu2 == 1) {
                    cal = "10"+cal;
                }

            }
        }
        if (o.equals("subtract")) {
            for (int i = n1.length(); i > 0; i--) {

                int nu1 = Integer.parseInt(String.valueOf(n1.charAt(i - 1)));
                int nu2 = Integer.parseInt(String.valueOf(n2.charAt(i - 1)));
                if (nu1 == 1 && nu2 == 1) {
                    cal = "0"+cal;
                }

            }
        }
        if (o.equals("multiply")) {
            for (int i = n1.length(); i > 0; i--) {

                int nu1 = Integer.parseInt(String.valueOf(n1.charAt(i - 1)));
                int nu2 = Integer.parseInt(String.valueOf(n2.charAt(i - 1)));
                if (nu1 == 1 && nu2 == 1) {
                    cal = "1"+cal;
                }
                else{
                    cal="0"+cal;
                }

            }
        }
        return cal;
    }
}
