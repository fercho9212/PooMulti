/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ferne
 */
public class Empleado extends Persona {
    private String tipoContracto;
    private Double suledo;

    public String getTipoContracto() {
        return tipoContracto;
    }

    public void setTipoContracto(String tipoContracto) {
        this.tipoContracto = tipoContracto;
    }

    public Double getSuledo() {
        return suledo;
    }

    public void setSuledo(Double suledo) {
        this.suledo = suledo;
    }
    
    public void calcularSuledo(Double sueldoBase){
        if(this.getTipoContracto()=="C"){
            this.setSuledo(sueldoBase+350);
        }else{
            this.setSuledo(sueldoBase+750);
        }
    }
    
}
