/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatospilas;

import javax.swing.JOptionPane;

/**
 *
 * @author jordan
 */
public class EstructurasDeDatosPilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Pila pilita=new Pila();
        int opt = 0, elemento;
        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Empujar\n"
                    + "2.Sacar\n3.Cima\n"
                    + "4.Tamaño\n"
                    + "5.Limpiar\n"
                    + "6.Salir"));
            switch (opt) {
                case 1: {
                    elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa El Elemento"));
                    pilita.Empujar(elemento);
                    break;
                }
                case 2: {
                    JOptionPane.showMessageDialog(null, "Has extraido el "+pilita.Sacar());
                    break;
                }
                case 3: {
                    JOptionPane.showMessageDialog(null, "La cima es "+pilita.Cima());

                    break;
                }
                case 4: {
                    JOptionPane.showMessageDialog(null, "El tamaño de la Pila es "+pilita.Tamanopila());
                    break;
                }
                case 5: {
                    pilita.Limpiar();
                    break;
                }
            }
        } while (opt != 6);
    }

}
