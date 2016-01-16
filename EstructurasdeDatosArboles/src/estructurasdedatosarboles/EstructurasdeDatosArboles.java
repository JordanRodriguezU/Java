/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatosarboles;

import javax.swing.JOptionPane;

/**
 *
 * @author jordan
 */
public class EstructurasdeDatosArboles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario Arbolito = new ArbolBinario();
        int opt = 0, elemento;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Insertar\n"
                    + "2.Mostrar inOrden\n"
                    + "3.Mostrar preOrden\n"
                    + "4.Buscar un nodo el Arbol\n"
                    + "5.Eliminar\n"
                    + "6.Salir"));
            switch (opt) {
                case 1: {
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa El Elemento"));
                    String nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del Nodo");
                    Arbolito.Insertar(elemento, nombre);
                    break;
                }
                case 2: {
                    if (!Arbolito.estaVacio()) {
                        System.out.println();
                        Arbolito.InOrden(Arbolito.raiz);
                    } else {
                        JOptionPane.showMessageDialog(null, "El Arbol esta Vacio");
                    }
                    break;
                }
                case 3: {
                    if (!Arbolito.estaVacio()) {
                        System.out.println();
                        Arbolito.PreOrden(Arbolito.raiz);
                    } else {
                        JOptionPane.showMessageDialog(null, "El Arbol esta Vacio");
                    }
                    break;
                }
                case 4: {
                    if (!Arbolito.estaVacio()) {
                        int busqueda = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el numero a Buscar"));
                        if (Arbolito.Buscar(busqueda) == null) {
                            JOptionPane.showMessageDialog(null, "Elemento no Encontrado");
                        } else {
                            JOptionPane.showMessageDialog(null, "Elemento Encontrado!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El Arbol esta Vacio");
                    }

                    break;
                }
                case 5: {
                    if (!Arbolito.estaVacio()) {
                        int eliminar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el elemento a Eliminar"));
                        if (Arbolito.Eliminar(eliminar) == false) {
                            JOptionPane.showMessageDialog(null, "Elemento no Encontrado");
                        } else {
                            JOptionPane.showMessageDialog(null, "Elemento Eliminado!");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El Arbol esta Vacio");
                    }

                    break;
                }
            }
        } while (opt != 6);
    }

}
