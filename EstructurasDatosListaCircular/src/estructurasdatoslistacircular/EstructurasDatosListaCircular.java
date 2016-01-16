/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdatoslistacircular;

import javax.swing.JOptionPane;

/**
 *
 * @author jordan
 */
public class EstructurasDatosListaCircular {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaLC listita = new ListaLC();
        int opt = 0, elemento;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Agregar a la lista\n"
                    + "2.Mostrar\n3.Eliminar\n4.Salir"));
            switch (opt) {
                case 1: {
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa El Elemento"));
                    listita.Insertar(elemento);
                    break;
                }
                case 2: {
                    listita.Mostrar();
                    break;
                }
                case 3: {
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa El Elemento a Eliminar"));

                    listita.Eliminar(elemento);
                    break;
                }
            }
        } while (opt != 4);
    }

}
