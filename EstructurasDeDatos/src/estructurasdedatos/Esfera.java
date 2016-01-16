/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos;

/**
 *
 * @author jordan
 */
public class Esfera {

    private double Radio;

    public Esfera(double RadioInicio) {
        if (RadioInicio > 0) {
            this.Radio = RadioInicio;
        } else {
            this.Radio = 0;
        }
    }
    
    public double GetDiametro(){
        return Radio*2;
    }
    public double GetCircunferecia()
    {
        return Math.PI*GetDiametro();
    }
    public double GetArea(){
        return (4*Math.PI*Radio*Radio);
    }
    public double GetVolumen(){
        return (4*Math.PI*Math.pow(Radio, 3))/3;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }
    

}
