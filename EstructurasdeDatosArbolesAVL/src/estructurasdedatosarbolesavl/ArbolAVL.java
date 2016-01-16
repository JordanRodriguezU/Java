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
public class ArbolAVL {
    
    NodoArbolAVL raiz;
    
    public ArbolAVL() {
        raiz = null;
    }
    
    public NodoArbolAVL Buscar(int dato, NodoArbolAVL r) {
        if (raiz == null) {
            return null;
        } else if (r.Dato == dato) {
            return r;
        } else if (r.Dato < dato) {
            return Buscar(dato, r.hijoDerecho);
        } else {
            return Buscar(dato, r.hijoIzquierdo);
        }
    }
    
    public int ObtenerFE(NodoArbolAVL x) {
        if (x == null) {
            return -1;
        } else {
            return x.Fe;
        }
    }
    
    public NodoArbolAVL RotacionIzquierda(NodoArbolAVL c) {
        NodoArbolAVL auxiliar = c.hijoIzquierdo;
        c.hijoIzquierdo = auxiliar.hijoDerecho;
        auxiliar.hijoDerecho = c;
        c.Fe = Math.max(ObtenerFE(c.hijoIzquierdo), ObtenerFE(c.hijoDerecho)) + 1;
        auxiliar.Fe = Math.max(ObtenerFE(auxiliar.hijoIzquierdo), ObtenerFE(auxiliar.hijoDerecho)) + 1;
        return auxiliar;
    }
    
    public NodoArbolAVL RotacionDerecha(NodoArbolAVL c) {
        NodoArbolAVL auxiliar = c.hijoDerecho;
        c.hijoDerecho = auxiliar.hijoIzquierdo;
        auxiliar.hijoIzquierdo = c;
        c.Fe = Math.max(ObtenerFE(c.hijoIzquierdo), ObtenerFE(c.hijoDerecho)) + 1;
        auxiliar.Fe = Math.max(ObtenerFE(auxiliar.hijoIzquierdo), ObtenerFE(auxiliar.hijoDerecho)) + 1;
        return auxiliar;
    }
    
    public NodoArbolAVL RotacionDobleIzquierda(NodoArbolAVL c) {
        NodoArbolAVL temporal;
        c.hijoIzquierdo = RotacionDerecha(c.hijoIzquierdo);
        temporal = RotacionIzquierda(c);
        return temporal;
    }

    public NodoArbolAVL RotacionDobleDerecha(NodoArbolAVL c) {
        NodoArbolAVL temporal;
        c.hijoDerecho = RotacionIzquierda(c.hijoDerecho);
        temporal = RotacionDerecha(c);
        return temporal;
    }
    
    public NodoArbolAVL InsertarAVL(NodoArbolAVL nuevo, NodoArbolAVL subArbol) {
        NodoArbolAVL nuevoPadre = subArbol;
        if (nuevo.Dato < subArbol.Dato) {
            if (subArbol.hijoIzquierdo == null) {
                subArbol.hijoIzquierdo = nuevo;
            } else {
                subArbol.hijoIzquierdo = InsertarAVL(nuevo, subArbol.hijoIzquierdo);
                if ((ObtenerFE(subArbol.hijoIzquierdo) - ObtenerFE(subArbol.hijoDerecho)) == 2) {
                    if (nuevo.Dato < subArbol.hijoIzquierdo.Dato) {
                        nuevoPadre = RotacionIzquierda(subArbol);
                    } else {
                        nuevoPadre = RotacionDobleIzquierda(subArbol);
                        
                    }
                }
            }
        } else if (nuevo.Dato > subArbol.Dato) {
            if (subArbol.hijoDerecho == null) {
                subArbol.hijoDerecho = nuevo;
            } else {
                subArbol.hijoDerecho = InsertarAVL(nuevo, subArbol.hijoDerecho);
                if ((ObtenerFE(subArbol.hijoDerecho) - ObtenerFE(subArbol.hijoIzquierdo) == 2)) {
                    if (nuevo.Dato > subArbol.hijoDerecho.Dato) {
                        nuevoPadre = RotacionDerecha(subArbol);
                    } else {
                        nuevoPadre = RotacionDobleDerecha(subArbol);
                    }
                }
            }
        } else {
            System.out.println("Nodo Duplicado");
        }
        if ((subArbol.hijoIzquierdo == null) && (subArbol.hijoDerecho != null)) {            
            subArbol.Fe = subArbol.hijoDerecho.Fe + 1;
        } else if ((subArbol.hijoDerecho == null && subArbol.hijoIzquierdo != null)) {
            subArbol.Fe = subArbol.hijoIzquierdo.Fe + 1;
        } else {
            subArbol.Fe = Math.max(ObtenerFE(subArbol.hijoIzquierdo), ObtenerFE(subArbol.hijoDerecho)) + 1;
        }
        return nuevoPadre;
    }
    
    public void Insertar(int d){
        NodoArbolAVL nuevo=new NodoArbolAVL(d);
        if (raiz==null) {
            raiz=nuevo;
        }else{
            raiz=InsertarAVL(nuevo, raiz);
        }
    }
    
        public void InOrden(NodoArbolAVL r) {
        if (r != null) {
            InOrden(r.hijoIzquierdo);
            System.out.print(r.Dato+",");
            InOrden(r.hijoDerecho);
        }
    }

    public void PreOrden(NodoArbolAVL r) {
        if (r != null) {
            System.out.print(r.Dato+",");
            InOrden(r.hijoIzquierdo);
            InOrden(r.hijoDerecho);
        }
    }
    public void PostOrden(NodoArbolAVL r){
        if (r!=null) {
            PostOrden(r.hijoIzquierdo);
            PostOrden(r.hijoDerecho);
            System.out.print(r.Dato+",");
            
        }
    }
    public NodoArbolAVL GetRaiz(){
        return raiz;
    }
    
}
