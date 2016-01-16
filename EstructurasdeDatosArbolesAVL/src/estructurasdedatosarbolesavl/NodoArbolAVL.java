/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatosarbolesavl;

/**
 *
 * @author jordan
 */
public class NodoArbolAVL {
    int Dato,Fe;
    NodoArbolAVL hijoIzquierdo,hijoDerecho;

    public NodoArbolAVL(int Dato) {
        this.Dato = Dato;
        this.Fe = 0;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    
}
