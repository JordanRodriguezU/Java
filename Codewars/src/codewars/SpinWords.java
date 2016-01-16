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
public class SpinWords {

    public String spinWords(String sentence) {
        String conc="";
        String[]palabras=sentence.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length()>=5) {
                conc=conc+" ";
                StringBuffer st=new StringBuffer(palabras[i]);
                conc=conc+st.reverse().toString();
            }
            else{
                conc=conc+" "+palabras[i];
            }
        }
        return conc;
    }

}
