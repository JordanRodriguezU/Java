/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaSimpleEnlazada;

/**
 *
 * @author jordan
 */
public class Nodo {

    public int Dato;
    public Nodo Siguiente;//Puntero enlaze
    // constructor para insertar al final
    public Nodo(int Dato) {
        this.Dato = Dato;
        this.Siguiente=null;
    }
    //Contructor para insertar al Inicio
    public Nodo(int Dato, Nodo Siguiente) {
        this.Dato = Dato;
        this.Siguiente = Siguiente;
    }

}
