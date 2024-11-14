package desafios;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Criar um programa que peça um número e exiba a tabuada desse número usando for

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        System.out.print("Digite um número para ver a tabuada: "); // Solicita ao usuário que insira um número
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");  // Exibe a tabuada do número fornecido
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;  // Calcula o resultado da multiplicação
            System.out.println(numero + " x " + i + " = " + resultado);  // Exibe a linha da tabuada
        }
        // Fecha o scanner
        scanner.close();
    }
}
