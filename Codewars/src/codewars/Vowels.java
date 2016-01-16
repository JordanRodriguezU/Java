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
public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Vowels.validar(str.charAt(i))) {
              vowelsCount++;
            }
        }
        return vowelsCount;
    }

    public static boolean validar(char x) {
        char[] vocales = new char[10];
        vocales[0] = 'a';
        vocales[1] = 'A';
        vocales[2] = 'e';
        vocales[3] = 'E';
        vocales[4] = 'i';
        vocales[5] = 'I';
        vocales[6] = 'o';
        vocales[7] = 'O';
        vocales[8] = 'u';
        vocales[9] = 'U';
        
        for (int i = 0; i < 10; i++) {
            if (vocales[i]==x) {
                return true;
            }
        }
        return false;
    }

}
