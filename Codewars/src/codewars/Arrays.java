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
public class Arrays {

    public static int findSmallest(final int[] numbers, final String toReturn) {
        //TODO: Add solution here
        Boolean validar=true;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                    if (numbers[i]<=numbers[j]) {
                        if (j==numbers.length-1) {
                            if (toReturn.equals("value")) {
                                return numbers[i];
                            }else if(toReturn.equals("index")){
                                return i;
                            }
                        }
                    }
                    else{
                        i++;
                        j=0;
                        
                    }
                
            }
            
        }
        return 0;
    }
}
