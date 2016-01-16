/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatoscolas;

import javax.swing.JOptionPane;

/**
 *
 * @author jordan
 */
public class EstructurasdeDatosColas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola colita=new Cola();
        int opt = 0, elemento;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Insertar\n"
                    + "2.Quitar\n3.Inicio Cola\n"
                    + "4.Tamaño\n"
                    + "5.Salir"));
            switch (opt) {
                case 1: {
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa El Elemento"));
                    colita.Insertar(elemento);
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "Has extraido el " + colita.Quitar());
                    break;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null, "El inicio es " + colita.InicioCola());

                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "El tamaño de la Cola es " + colita.TamanoCola());
                    break;
                }
            }
        } while (opt != 5);
    }

}
