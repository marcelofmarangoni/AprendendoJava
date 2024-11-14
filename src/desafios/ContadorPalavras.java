package desafios;

import java.util.Scanner;

public class ContadorPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita uma frase ao usuário
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Divide a frase em palavras com base nos espaços e conta o número de palavras
        String[] palavras = frase.trim().split("\\s+");
        int numeroPalavras = palavras.length;

        // Exibe o resultado
        System.out.println("Número de palavras na frase: " + numeroPalavras);

        scanner.close();
    }
}
