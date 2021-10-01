package com.casotarifa;

public class CasoTarifa {

    public int descuentoObtenido(int var){
        if(var == 1){
            return var;
        }
        return var;
    }

    public double calculoTarifaFinal(int cliente, double precio) {
        if(cliente == 0){
            return (precio + (precio * 0.19));
        }else{
            return ((precio - 0.10 * precio) + (precio * 0.19));
        }
    }
}
