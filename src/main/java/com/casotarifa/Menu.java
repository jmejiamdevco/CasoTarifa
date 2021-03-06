package com.casotarifa;
import java.util.Scanner;
import java.util.Random;

public class Menu {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CasoTarifa casoTarifa = new CasoTarifa();
        int opcion;

        System.out.println("1. Comprar producto A precio:3000");
        System.out.println("2. Comprar producto B precio:2000");
        System.out.println("3. Comprar producto C precio:5000");
        System.out.println("4. salir");
        opcion = teclado.nextInt();

        int cliente = Random();
        int dsto =  casoTarifa.descuentoObtenido(cliente);;
        double tarifaFinal;
        switch (opcion){
            case 1:
                MostrarSiTieneDescuento(dsto);
                tarifaFinal = casoTarifa.calculoTarifaFinal(dsto, 3000);
                System.out.println(tarifaFinal);
                break;
            case 2:
                MostrarSiTieneDescuento(dsto);
                tarifaFinal =  casoTarifa.calculoTarifaFinal(dsto, 2000);
                System.out.println(tarifaFinal);
                break;
            case 3:
                MostrarSiTieneDescuento(dsto);
                tarifaFinal = casoTarifa.calculoTarifaFinal(dsto, 5000);
                System.out.println(tarifaFinal);
                break;
        }
    }
    public static void MostrarSiTieneDescuento(int dato){
        if(dato == 1 ){
            System.out.println("con descuento");
        }else{
            System.out.println("sin descuento");
        }
    }
    public static int Random(){
        Random miNumero = new Random();
        int numero = miNumero.nextInt(2);
        return numero;
    }
}
