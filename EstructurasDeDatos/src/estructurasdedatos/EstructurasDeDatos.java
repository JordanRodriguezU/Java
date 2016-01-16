/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

import javax.swing.JOptionPane;
import ListaSimpleEnlazada.Lista;

/**
 *
 * @author jordan
 */
public class EstructurasDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        Esfera esferita = new Esfera(4);
//        System.out.println("Radio:" + esferita.getRadio());
//        System.out.println("Diametro:" + esferita.GetDiametro());
//
//        System.out.println("Circunferencia:" + esferita.GetCircunferecia());
//        System.out.println("Area:" + esferita.GetArea());
//                System.out.println("Volumen:" + esferita.GetVolumen());
        
        int opcion;
        Lista listita=new Lista();
        
        do {            
            opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"1.Agregar Elementos\n2.Mostrar Elementos\n3.Agregar al Final"
                    + "\n4.Borrar Inicio\n5.Borrar Final\n6.Eliminar un Elemento\n7.Buscar"));
            switch(opcion)
            {
                case 1:{
                    int elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dato a Insertar"));
                    listita.AgregarInicio(elemento);
                    break;
                }
                case 2:{
                    listita.MostarLista();
                    break;
                }
                case 3:{
                    int elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dato a Insertar"));

                    listita.AgregarFinal(elemento);
                    break;
                }
                case 4:{
                    System.out.println("El elemento "+listita.EliminarInicio()+" Fue eliminado!");
                    break;
                }
                case 5:{
                    System.out.println("El elemento "+listita.borrarFinal()+" Fue eliminado!");
                    break;
                }
                case 6:{
                    int elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dato a eliminar"));
                    listita.eliminar(elemento);
                }
                case 7:{
                     int elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el dato a buscar"));
                     System.out.println(listita.Buscar(elemento));
                }
                
            }
            
        } while (opcion<8);


    }

}
