/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author jordan
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String x = "";
        int rest = 0;
        int reverseado = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = 999; j >= 100; j--) {
                rest = i * j;
                reverseado = reverse(rest);

                //System.out.println(reverseado);
                //System.out.println(rest);
                if (reverseado == rest) {
                    System.out.println(reverseado);
                    break;
                }

            }
            if (reverseado == rest) {
                //  System.out.println(reverseado);
                break;
            }

        }

    }

    public static int reverse(int n) {
        int result = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            result = result * 10 + rem;
        }
        return result;
    }
}
