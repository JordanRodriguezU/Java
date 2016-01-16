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
public class Algoritmos {

    //Metodo Burbuja version 2
    public void Burbuja2(int[] Arreglo) {
        int temporal = 0;
        int pasadas = 0;
        for (int i = 1; i < Arreglo.length; i++) {
            for (int j = 0; j < Arreglo.length - 1; j++) {
                if (Arreglo[j] > Arreglo[j + 1]) {
                    temporal = Arreglo[j];
                    Arreglo[j] = Arreglo[j + 1];
                    Arreglo[j + 1] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Burbuja 2 Termino en " + pasadas);
    }

    //metodo burbuja version 1
    public void Burbuja1(int[] Arreglo) {
        int temporal = 0;
        int pasadas = 0;
        for (int i = 0; i < Arreglo.length; i++) {
            for (int j = i + 1; j < Arreglo.length; j++) {
                if (Arreglo[i] > Arreglo[j]) {
                    temporal = Arreglo[i];
                    Arreglo[i] = Arreglo[j];
                    Arreglo[j] = temporal;
                }
                pasadas++;
            }
        }
        System.out.println("Burbuja 1 Termino en " + pasadas);
    }

    public void Radix(int[] Arreglo) {
        int x, i, j;
        for (x = Integer.SIZE - 1; x >= 0; x--) {
            int[] auxiliar = new int[Arreglo.length];
            j = 0;
            for (i = 0; i < Arreglo.length; i++) {
                boolean mover = Arreglo[i] << x >= 0;
                if (x == 0 ? !mover : mover) {
                    auxiliar[j] = Arreglo[i];
                    j++;
                } else {
                    Arreglo[i - j] = Arreglo[i];
                }
            }
            for (i = j; i < auxiliar.length; i++) {
                auxiliar[i] = Arreglo[i - j];
            }
            Arreglo = auxiliar;
        }
        System.out.println("Ordenamiento con Radix");
        MostrarArreglo(Arreglo);
    }

    public void MostrarArreglo(int[] Arreglo) {
        for (int i = 0; i < Arreglo.length; i++) {
            System.out.print("[" + Arreglo[i] + "]");
        }
        System.out.println();
    }
    public void Quick(int[]Arreglo,int primero,int ultimo){
        int i,j,pivote,auxiliar;
        i=primero;
        j=ultimo;
        pivote=Arreglo[(primero+ultimo)/2];
        do {
            while (Arreglo[i]<pivote) {                
                i++;
            }
            while (Arreglo[j]>pivote) {                
                j--;
            }
            if (i<=j) {
                auxiliar=Arreglo[i];
                Arreglo[i]=Arreglo[j];
                Arreglo[j]=auxiliar;
                i++;
                j--;
            }
        } while (i<=j);
        if (primero<j) {
            Quick(Arreglo, primero, j);
        }
        if (i<ultimo) {
            Quick(Arreglo, i, ultimo);
        }
        MostrarArreglo(Arreglo);
    }
}
