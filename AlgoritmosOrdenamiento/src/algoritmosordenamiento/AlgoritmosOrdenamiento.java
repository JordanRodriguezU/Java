/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosordenamiento;

/**
 *
 * @author jordan
 */
public class AlgoritmosOrdenamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Algoritmos algoritmos=new Algoritmos();
        int[]arreglo= new int[9];
        arreglo[0]=32;
        arreglo[1]=356;
        arreglo[2]=3;
        arreglo[3]=1;
        arreglo[4]=45;
        arreglo[5]=47;
        arreglo[6]=50;
        arreglo[7]=100;
        arreglo[8]=10;
        
        algoritmos.Burbuja1(arreglo);
        algoritmos.MostrarArreglo(arreglo);
        
        arreglo[0]=32;
        arreglo[1]=356;
        arreglo[2]=3;
        arreglo[3]=1;
        arreglo[4]=45;
        arreglo[5]=47;
        arreglo[6]=50;
        arreglo[7]=100;
        arreglo[8]=10;
        algoritmos.Burbuja2(arreglo);
        algoritmos.MostrarArreglo(arreglo);
        algoritmos.Radix(arreglo);
        System.out.println("Ordenamiento con Quick");
        int vector1[]={5,2,1,8,3,9,7};
        algoritmos.Quick(vector1, 0, vector1.length-1);
        //algoritmos.MostrarArreglo(arreglo);
        
    }
    
}
