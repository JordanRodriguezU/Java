/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatoslistacircular;

/**
 *
 * @author jordan
 */
public class NodoLC {
    int Dato;
    NodoLC siguiente;
    public NodoLC(int d){
        Dato=d;
        siguiente=this;
    }    
}
