package desafios;

import java.util.Random;
import java.util.Scanner;

public class AdivinhaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Gera um número aleatório entre 1 e 10
        Random random = new Random();
        int numeroCorreto = random.nextInt(10) + 1;  // Gera um número entre 1 e 10

        int palpite = 0; // Inicializa o palpite do usuário

        // Loop para repetir enquanto o usuário não acertar
        while (palpite != numeroCorreto) {
            System.out.print("Adivinhe um número entre 1 e 10: ");
            palpite = scanner.nextInt();

            // Verifica se o palpite está correto
            if (palpite == numeroCorreto) {
                System.out.println("Parabéns! Você acertou o número.");
            } else {
                System.out.println("Tente novamente!");
            }
        }

        // Fecha o scanner
        scanner.close();
    }
}
