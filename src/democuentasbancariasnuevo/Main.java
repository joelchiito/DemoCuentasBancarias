/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democuentasbancariasnuevo;

import java.util.Scanner;
import modelo.CuentaBasica;

/**
 *
 * @author hp245
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        CuentaBasica miCuentaB = new CuentaBasica (16470287, "Joel");
        
        miCuentaB.depositar(1000.0);
        System.out.println("El saldo actual de la cuenta 16470287 es $" + miCuentaB.getSaldo());
        
        miCuentaB.depositar(1500.0);
        System.out.println("El saldo actual de la cuenta 16470287 es $" + miCuentaB.getSaldo());
        
        miCuentaB.retirar (200.0);
        System.out.println("El saldo actual de la cuenta 16470287 es $" + miCuentaB.getSaldo());
        
        miCuentaB.depositar (300.0);
         System.out.println("El saldo actual de la cuenta 16470287 es $" + miCuentaB.getSaldo());
         
        miCuentaB.retirar (1000.0);
        System.out.println("El saldo actual de la cuenta 16470287 es $" + miCuentaB.getSaldo());
    }
    
}
