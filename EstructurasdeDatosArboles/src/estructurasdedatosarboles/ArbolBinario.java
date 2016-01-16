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
public class ArbolBinario {

    NodoArbol raiz;

    public ArbolBinario() {
        this.raiz = null;
    }

    public void Insertar(int d, String nom) {
        NodoArbol nuevo = new NodoArbol(d, nom);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoArbol auxiliar = raiz;
            NodoArbol padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }
                }
            }
        }
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public void InOrden(NodoArbol r) {
        if (r != null) {
            InOrden(r.hijoIzquierdo);
            System.out.print(r.dato+",");
            InOrden(r.hijoDerecho);
        }
    }

    public void PreOrden(NodoArbol r) {
        if (r != null) {
            System.out.print(r.dato+",");
            InOrden(r.hijoIzquierdo);
            InOrden(r.hijoDerecho);
        }
    }
    
    public NodoArbol Buscar(int dato){
        
        NodoArbol auxiliar=raiz;
        while (auxiliar.dato!=dato) {            
            if (dato<auxiliar.dato) {
                auxiliar=auxiliar.hijoIzquierdo;
            }else{
                auxiliar=auxiliar.hijoDerecho;
            }
            if (auxiliar==null) {
                return null;
            }
        }
        return auxiliar;
    }
    
    public boolean Eliminar(int dato){
        NodoArbol auxiliar=raiz;
        NodoArbol padre=raiz;
        boolean esHijoIzquierdo=true;
        while (auxiliar.dato!=dato) {            
            padre=auxiliar;
            if (dato<auxiliar.dato) {
                esHijoIzquierdo=true;
                auxiliar=auxiliar.hijoIzquierdo;
            }else{
                esHijoIzquierdo=false;
                auxiliar=auxiliar.hijoDerecho;
            }
            if (auxiliar==null) {
                return false;
            }
        }
        
        if (auxiliar.hijoIzquierdo==null&&auxiliar.hijoDerecho==null) {
            if (auxiliar==raiz) {
                raiz=null;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo=null;
            }else{
                padre.hijoDerecho=null;
            }
            
            
        }else if(auxiliar.hijoDerecho==null){
            if (auxiliar==raiz) {
                raiz=auxiliar.hijoIzquierdo;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo=auxiliar.hijoIzquierdo;
            }else{
                padre.hijoDerecho=auxiliar.hijoIzquierdo;
            }
        }else if(auxiliar.hijoIzquierdo==null){
            if (auxiliar==raiz) {
                raiz=auxiliar.hijoDerecho;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo=auxiliar.hijoDerecho;
            }else{
                padre.hijoDerecho=auxiliar.hijoIzquierdo;
                
            }
        }else{
            NodoArbol Reemplazo=ObtenerReemplazo(auxiliar);
            if (auxiliar==raiz) {
                raiz=Reemplazo;
            }else if(esHijoIzquierdo){
                padre.hijoIzquierdo=Reemplazo;
            }else{
                padre.hijoDerecho=Reemplazo;
            }
            Reemplazo.hijoIzquierdo=auxiliar.hijoIzquierdo;
        }
        return true;
    }

    private NodoArbol ObtenerReemplazo(NodoArbol NodoReeemp) {
        NodoArbol ReemplazarPadre=NodoReeemp;
        NodoArbol Reemplazo=NodoReeemp;
        NodoArbol auxiliar=NodoReeemp.hijoDerecho;
        while (auxiliar!=null) {            
            ReemplazarPadre=Reemplazo;
            Reemplazo=auxiliar;
            auxiliar=auxiliar.hijoIzquierdo;
        }
        if (Reemplazo!=NodoReeemp.hijoDerecho) {
            ReemplazarPadre.hijoIzquierdo=Reemplazo.hijoDerecho;
            Reemplazo.hijoDerecho=NodoReeemp.hijoDerecho;
        }
        System.out.println("El nodo Reemplazo es "+Reemplazo.toString());
        return Reemplazo;
    }

}
