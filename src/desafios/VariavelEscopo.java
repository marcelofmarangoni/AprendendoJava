package desafios;

public class VariavelEscopo {

    // Variável global (ou variável de instância) da classe
    static int globalVariable = 5;

    public static void main(String[] args) {
        System.out.println("Valor de globalVariable antes do método: " + globalVariable);

        // Chamando o método que altera a variável global
        alterarVariavelGlobal();

        System.out.println("Valor de globalVariable após o método: " + globalVariable);
    }

    // Método que altera o valor da variável global
    public static void alterarVariavelGlobal() {
        globalVariable = 15;
        System.out.println("Valor de globalVariable dentro do método: " + globalVariable);
    }
}
