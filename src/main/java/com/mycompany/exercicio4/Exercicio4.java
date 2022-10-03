package com.mycompany.exercicio4;

import java.util.Scanner;

/**
 *
 * @author Tyler
 */
public class Exercicio4 {

    public static void main(String[] args) {
        
//        Entrada das notas digitadas pelo usuário
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a primeira nota: ");
        double n1 = entrada.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double n2 = entrada.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double n3 = entrada.nextDouble();
        System.out.print("Digite a quarta nota: ");
        double n4 = entrada.nextDouble();
        entrada.close();

//        Calculo da média

    double media = (n1 + n2 + n3 + n4)/4;
    
    System.out.print("A média é: " + media);
    }
}
