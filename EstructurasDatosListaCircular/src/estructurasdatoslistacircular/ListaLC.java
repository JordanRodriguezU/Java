/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatoslistacircular;

import javax.swing.JOptionPane;

/**
 *
 * @author jordan
 */
public class ListaLC {

    NodoLC ultimo;

    public ListaLC() {
        this.ultimo = null;
    }

    public boolean estaVacia() {
        return ultimo == null;
    }

    public ListaLC Insertar(int elemento) {
        NodoLC nuevo = new NodoLC(elemento);
        if (ultimo != null) {
            nuevo.siguiente = ultimo.siguiente;
            ultimo.siguiente = nuevo;
        } else {
            ultimo = nuevo;
        }
        return this;
    }

    public void Mostrar() {
        NodoLC aux = ultimo.siguiente;
        String cadena = "";
        do {
            cadena += "[" + aux.Dato + "]->";
            aux = aux.siguiente;
        } while (aux != ultimo.siguiente);
        JOptionPane.showMessageDialog(null, cadena);

    }

    public boolean Eliminar(int elemento) {
        NodoLC actual;
        boolean encontrado = false;
        actual = ultimo;
        while (actual.siguiente != ultimo && !encontrado) {
            encontrado = (actual.siguiente.Dato == elemento);
            if (!encontrado) {
                actual = actual.siguiente;
            }
        }
        encontrado = (actual.siguiente.Dato == elemento);
        if (encontrado) {
             NodoLC aux=actual.siguiente;
             if (ultimo==ultimo.siguiente) {
                ultimo=null;
            }else{
                 if (aux==ultimo) {
                     ultimo=actual;
                 }
                 actual.siguiente=aux.siguiente;
             }
             aux=null;
        }
        return encontrado==true;
    }
}
