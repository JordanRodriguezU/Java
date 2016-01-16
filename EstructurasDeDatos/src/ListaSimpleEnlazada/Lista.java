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
public class Lista {
    protected Nodo Inicio,Fin;

    public Lista() {
        this.Inicio = null;
        this.Fin = null;
    }
    //metodo para agregar al Inicio
    public void AgregarInicio(int elemento){
        //Crear al Nodo
        Inicio=new Nodo(elemento, Inicio);
        if (Fin==null) {
            Fin=Inicio;
        }
    }
    //Metodo para insertar al final
    public void AgregarFinal(int dato){
        if(!EstaVacia()){
            Fin.Siguiente=new Nodo(dato);
            Fin=Fin.Siguiente;
        }else{
            Inicio=Fin=new Nodo(dato);
        }
    }
    //lista Vacia
    public boolean EstaVacia(){
        if (Inicio==null) {
            return true;
        }else{
            return false;
        }
    }
    //mostrar datos
    public void MostarLista(){
        Nodo Recorrer=Inicio;
        while(Recorrer!=null){
            System.out.println(Recorrer.Dato+" ");
            Recorrer=Recorrer.Siguiente;
        }
    }
    
    public int EliminarInicio(){
        int Elemento=Inicio.Dato;
        if (Inicio==Fin) {
            Inicio=Fin=null;
        }else{
            Inicio=Inicio.Siguiente;
        }
        return Elemento;
    }
    //Metodo eliminar al final
    public int borrarFinal(){
        int Elemento=Fin.Dato;
        if (Inicio==Fin) {
            Inicio=Fin=null;
        }else{
            Nodo temp=Inicio;
            while (temp.Siguiente!=Fin) {                
                temp=temp.Siguiente;
            }
            Fin=temp;
            Fin.Siguiente=null;
        }
        return Elemento;
    }
    //metodo para eliminar nodo especifico
    public void eliminar(int elemento){
        if (!EstaVacia()) {
            if (Inicio==Fin&&elemento==Inicio.Dato) {
                Inicio=Fin=null;
            }else if(elemento==Inicio.Dato){
                Inicio=Inicio.Siguiente;
            }else{
                Nodo anterior,temporal;
                anterior=Inicio;
                temporal=Inicio.Siguiente;
                while (temporal!=null&&elemento!=temporal.Dato) {                    
                    anterior=anterior.Siguiente;
                    temporal=temporal.Siguiente;
                }
                if (temporal!=null) {
                    anterior.Siguiente=temporal.Siguiente;
                    if (temporal==Fin) {
                        Fin=anterior;
                    }
                }
            }
        }
    }
    public boolean Buscar(int dato){
        Nodo Temp=Inicio;
        while (Temp!=null&&Temp.Dato!=dato) {            
            Temp=Temp.Siguiente;
        }
        return Temp!=null;
    }
}
