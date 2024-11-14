package desafios;

import java.sql.SQLOutput;

public class ForWhile {
    public static void main(String[] args) {

        System.out.println("Laço For");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contador: " + i);
        }
        System.out.println("-------------");

        System.out.println("Laço while");
        int count = 1;

        while (count <= 5) {
            System.out.println("Contagem: " + count);
            count++;
        }
    }
}
