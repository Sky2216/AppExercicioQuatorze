/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appexercicioquatorze;

import java.util.Scanner;

/**
 *
 * @author HOME
 */
public class AppExercicioQuatorze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    double salarioMinimo,quilowatt,ReaisQuilowatt,ReaisResidencia,ReaisDesconto,Residencia,Desconto;
               
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Digite o salario minimo: ");
        salarioMinimo = teclado.nextDouble();
        System.out.println("Digite a quantidade de quilowatts que foram gastos na residencia: ");
        quilowatt = teclado.nextDouble();
        ReaisQuilowatt = salarioMinimo / quilowatt;
       
        System.out.println("Digite a quantidade de reais gastos pela residencia: ");
        Residencia = teclado.nextDouble();
        ReaisResidencia = Residencia / quilowatt;
        
        System.out.println("O novo valor pago por essa residencia pelo desconto de: ");
        Desconto = teclado.nextDouble();
        ReaisDesconto = Residencia / 0.15;
    
        System.out.println("O valor pelos quilowatts gastos na residencia foram de: "+ReaisQuilowatt);
        System.out.println("O valor gastos pela residencia foram de: "+ReaisResidencia);
        System.out.println("O valor gasto pela residencia com desconto foram de:"+ReaisDesconto);
    
    
    
    
    }
    
}
