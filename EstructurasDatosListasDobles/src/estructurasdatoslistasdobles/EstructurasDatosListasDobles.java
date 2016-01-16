/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatoslistasdobles;

import javax.swing.JOptionPane;

/**
 *
 * @author jordan
 */
public class EstructurasDatosListasDobles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble listita = new ListaDoble();
        int opt = 0, elemento;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar Inicio\n"
                    + "2.Agregar Al Final\n3.Mostrar Lista Inicio Fin\n"
                    + "4.Mostrar la lista Inicio Fin\n"
                    + "5.Eliminar Inicio\n"
                    + "6.Eliminar Final"));
            switch (opt) {
                case 1: {
                    elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa El Elemento"));
                    listita.Agregarinicio(elemento);
                    break;
                }
                case 2: {
                    elemento=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa El Elemento"));
                    listita.Agregarfinal(elemento);
                    break;
                }
                case 3: {
                    listita.Mostrarlista();

                    break;
                }
                case 4: {
                    listita.MostrarAlreves();
                    break;
                }
                case 5:{
                    JOptionPane.showMessageDialog(null, "El elemento eliminado es "+listita.EliminarInicio());
                    break;
                }
                case 6:{
                    JOptionPane.showMessageDialog(null, "El elemento eliminado fue "+listita.EliminarFinal());
                }
            }
        } while (opt != 7);
    }

}
