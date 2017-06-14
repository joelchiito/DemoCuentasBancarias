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
        
        System.out.println("Bienvenido a su cajero automatico *w*");
        System.out.println("¿Desea abrir una cuenta?");
        System.out.println("El mínimo para abrir una cuenta es de $50.00");
        System.out.println("¿Con cuantó desea abrir su cuenta?: $50.00");
        miCuentaB.depositar(50.0);
        System.out.println("Su número de cuenta es: 16470287");
        System.out.println("                                                  ");
        System.out.println("Bienvenido a su cajero automatico *w*");
        System.out.println("¿Desea Depositar o Retirar?");
        System.out.println("Depositar");
        System.out.println("Depositar: $1,000.00");
        miCuentaB.depositar(1000.0);
        System.out.println("El saldo actual de la cuenta 16470287 es $" + miCuentaB.getSaldo());
        System.out.println("                                                  ");
        System.out.println("Bienvenido a su cajero automatico *w*");
        System.out.println("¿Desea Depositar o Retirar?");
        System.out.println("Depositar");
        System.out.println("Depositar: $1,500.00");
        miCuentaB.depositar(1500.0);
        System.out.println("El saldo actual de la cuenta 16470287 es $" + miCuentaB.getSaldo());
        System.out.println("                                                  ");
        System.out.println("Bienvenido a su cajero automatico *w*");
        System.out.println("¿Desea Depositar o Retirar?");
        System.out.println("Retirar");
        System.out.println("Retirar: $200.00");
        miCuentaB.retirar (200.0);
        System.out.println("El saldo actual de la cuenta 16470287 es $" + miCuentaB.getSaldo());
        System.out.println("                                                  ");
        System.out.println("Bienvenido a su cajero automatico *w*");
        System.out.println("¿Desea Depositar o Retirar?");
        System.out.println("Depositar");
        System.out.println("Depositar: $300.00");
        miCuentaB.depositar (300.0);
        System.out.println("El saldo actual de la cuenta 16470287 es $" + miCuentaB.getSaldo());
        System.out.println("                                                  ");
        System.out.println("Bienvenido a su cajero automatico *w*");
        System.out.println("¿Desea Depositar o Retirar?");
        System.out.println("Retirar"); 
        System.out.println("Retirar: $1,000.00");
        miCuentaB.retirar (1000.0);
        System.out.println("El saldo actual de la cuenta 16470287 es $" + miCuentaB.getSaldo());
    }
    
}
