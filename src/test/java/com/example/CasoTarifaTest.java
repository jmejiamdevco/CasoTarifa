package com.example;

import com.casotarifa.CasoTarifa;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.util.Random;


public class CasoTarifaTest {
    static CasoTarifa casoTarifa;

    @BeforeAll
    public static void beforeAll() {
        casoTarifa = new CasoTarifa();
    }
    @Test
    public void TestDescuentoObtenido() {
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
        Random miNumero = new Random();
        int numero = miNumero.nextInt(2);
        if(numero == 1){
            assertEquals(3270, casoTarifa.calculoTarifaFinal(1, 3000), 0);
        }else {
            assertEquals(3570, casoTarifa.calculoTarifaFinal(0,  3000), 0);
        }
    }
}
