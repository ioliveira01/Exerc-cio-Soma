/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exerciciosvariaveis2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
            int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
            int num2 = scanner.nextInt();

            int soma = num1 + num2;

        System.out.println("A soma de " + num1 + " + " + num2 + " é: " + soma);

        scanner.close();
    }
}
