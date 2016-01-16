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
public class BackWardsPrime {

    public static String backwardsPrime(long start, long end) {
        String concat="";
        for (long i = start; i <= end; i++) {

            int cont=0;
            for (long j = 1; j <= i; j++) {
                if (i%j==0) {
                   cont++; 
                }
    
            }
            if (cont==2) {
                
                StringBuffer st=new StringBuffer(String.valueOf(i));
                String number=st.reverse().toString();
                int derbez=Integer.parseInt(number);
                if(derbez!=i){
                int cont2=0;
                for (int j = 1; j <= derbez; j++) {
                    if (derbez%j==0) {
                        cont2++;
                    }
                }
                if (cont2==2) {
                    concat=concat+" "+i;
                    
                }
            }
            }
        }
        
        
        return concat;
    }
}
