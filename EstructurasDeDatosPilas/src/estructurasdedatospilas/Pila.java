/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatospilas;

/**
 *
 * @author jordan
 */
public class Pila {
    private NodoPila Cima;
    private int tamano;

    public Pila() {
        Cima=null;
        tamano=0;
    }
    
    public boolean estaVacia(){
        return Cima==null;
    }
    public void Empujar(int ele){
        NodoPila nuevo=new NodoPila(ele);
        nuevo.siguiente=Cima;
        Cima=nuevo;
        tamano++;
    }
    public int Sacar(){
        int aux=Cima.dato;
        Cima=Cima.siguiente;
        tamano--;
        return aux;
    }
    public int Cima(){
        return Cima.dato;
    }
    public int Tamanopila(){
        return tamano;
    }
    public void Limpiar(){
        while (!estaVacia()) {            
            Sacar();
        }
    }
}
