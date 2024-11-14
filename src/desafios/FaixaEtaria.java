package desafios;

import java.util.Scanner;

public class FaixaEtaria {
    public static void main(String[] args) {
        // Crie um programa que peça a idade do usuário e exiba uma mensagem
        // exibir conforme a faixa etária (criança, adolescente, adulto).

        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada do usuário

        System.out.print("Digite sua idade: "); // Solicita ao usuário que insira a idade
        int idade = scanner.nextInt();

        // Verifica a faixa etária e exibe a mensagem correspondente
        if (idade >= 0 && idade <= 12) {
            System.out.println("Você é uma criança.");
        } else if (idade >= 13 && idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade >= 18) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Idade inválida. Por favor, insira uma idade válida.");
        }
        // Fecha o scanner
        scanner.close();
    }
}
