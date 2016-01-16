/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatoslistasdobles;

import javax.swing.JOptionPane;

/**
 *
 * @author jordan
 */
public class ListaDoble {

    private NodoDoble inicio, fin;

    public ListaDoble() {
        inicio = fin = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void Agregarfinal(int dato) {
        if (!estaVacia()) {
            fin = new NodoDoble(dato, null, fin);
            fin.Anterior.Siguiente = fin;
        } else {
            inicio = fin = new NodoDoble(dato);
        }
    }

    public void Agregarinicio(int dato) {
        if (!estaVacia()) {
            fin = new NodoDoble(dato, inicio, null);
            inicio.Siguiente.Anterior = inicio;
        } else {
            inicio = fin = new NodoDoble(dato);
        }
    }

    public void Mostrarlista() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble aux = inicio;
            while (aux != null) {
                datos += "[" + aux.Dato + "]<=>";
                aux = aux.Siguiente;
            }
            JOptionPane.showMessageDialog(null, datos);
        }
    }

    public void MostrarAlreves() {
        if (!estaVacia()) {
            String datos = "<=>";
            NodoDoble aux = fin;
            while (aux != null) {
                datos += "[" + aux.Dato + "]<=>";
                aux = aux.Anterior;
            }
            JOptionPane.showMessageDialog(null, datos);
        }
    }
    public int EliminarInicio(){
        int elemento=inicio.Dato;
        if (inicio==fin) {
            inicio=fin=null;
        }else{
            inicio=inicio.Siguiente;
            inicio.Anterior=null;
        }
        return elemento;
    }
    public int EliminarFinal(){
            int elemento=fin.Dato;
        if (inicio==fin) {
            inicio=fin=null;
        }else{
            fin=fin.Anterior;
            fin.Siguiente=null;
        }
        return elemento;    
    }
}
