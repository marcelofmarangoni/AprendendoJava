package desafios;

public class CondicionaisAninhadas {
    public static void main(String[] args) {
        // Condicionais aninhadas são condicionais dentro de condicionais
        int score = 76;

        if (score >= 90) {
            System.out.println("Nota: A");
        } else if (score >= 80) {
            System.out.println("Nota: B");
        } else if (score >= 70) {
            System.out.println("Nota: C");
        } else {
            System.out.println("Nota: D ou F");
        }
    }
}
