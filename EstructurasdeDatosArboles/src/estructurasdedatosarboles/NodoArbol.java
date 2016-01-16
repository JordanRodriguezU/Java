/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatosarboles;

/**
 *
 * @author jordan
 */
public class NodoArbol {
    int dato;
    String nombre;
    NodoArbol hijoDerecho,hijoIzquierdo;

    public NodoArbol(int dato, String nombre) {
        this.dato = dato;
        this.nombre = nombre;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }
    
    @Override
    public String toString(){
        return nombre+" Con el dato "+dato;
    }
    
    
}
