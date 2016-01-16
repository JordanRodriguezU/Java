/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatoslistasdobles;

/**
 *
 * @author jordan
 */
public class NodoDoble {
public int Dato;
NodoDoble Siguiente,Anterior;
public NodoDoble(int el)
{
    this(el,null,null);
}

    public NodoDoble(int Dato, NodoDoble Siguiente, NodoDoble Anterior) {
        this.Dato = Dato;
        this.Siguiente = Siguiente;
        this.Anterior = Anterior;
    }

}
