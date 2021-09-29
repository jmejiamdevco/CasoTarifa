package com.example;

import com.example.CasoTarifa.CasoTarifa;
import org.junit.Test;
import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CasoTarifaTest {
    @Test
    public void TestDescuentoObtenido() {
        CasoTarifa casoTarifa = new CasoTarifa();
        Random miNumero = new Random();
        int numero = miNumero.nextInt(2);

        if (numero == 1) {
            assertEquals(1, casoTarifa.descuentoObtenido(numero));
        }else{
            assertEquals(0, casoTarifa.descuentoObtenido(numero));
        }
    }

    @Test
    public void TestCalcularTarifa(){
        CasoTarifa casoTarifa = new CasoTarifa();
        Random miNumero = new Random();
        int numero = miNumero.nextInt(2);
        if(numero == 1){
            assertEquals(3270, casoTarifa.calculoTarifaFinal(1, 3000), 0);
        }else {
            assertEquals(3570, casoTarifa.calculoTarifaFinal(0,  3000), 0);
        }
    }
}
