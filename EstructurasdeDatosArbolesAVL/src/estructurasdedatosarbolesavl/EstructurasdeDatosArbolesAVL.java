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
public class EstructurasdeDatosArbolesAVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolAVL ArbolitoAVL=new ArbolAVL();
        ArbolitoAVL.Insertar(10);
        ArbolitoAVL.Insertar(5);
        ArbolitoAVL.Insertar(13);
        ArbolitoAVL.Insertar(1);
        ArbolitoAVL.Insertar(6);
        ArbolitoAVL.Insertar(17);
        ArbolitoAVL.Insertar(16);
        ArbolitoAVL.PreOrden(ArbolitoAVL.GetRaiz());
    }
    
}
