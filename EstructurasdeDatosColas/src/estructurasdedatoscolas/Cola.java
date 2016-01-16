/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatoscolas;

/**
 *
 * @author jordan
 */
public class Cola {

    private NodoCola inicio, fin;
    private int tamano;

    public Cola() {
        inicio=fin=null;
        tamano=0;
    }
    
    public boolean estaVacia(){
        return inicio==null;
    }
    
    public void Insertar(int ele){
        NodoCola nuevo=new NodoCola(ele);
        if (estaVacia()) {
            inicio=nuevo;
        }else{
            fin.siguiente=nuevo;
        }
        fin=nuevo;
        tamano++;
    }
    
    public int Quitar(){
        int aux=inicio.dato;
        inicio=inicio.siguiente;
        tamano--;
        return aux;
    }
    
    public int InicioCola(){
        return inicio.dato;
    }
    public int TamanoCola(){
        return tamano;
    }
    
}
