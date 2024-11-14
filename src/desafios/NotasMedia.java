package desafios;

public class NotasMedia {
    public static void main(String[] args) {
        // Declarando e inicializando um array de notas
        double[] notas = {7.5, 8.0, 9.2, 6.8, 7.0};

        // Variável para somar todas as notas
        double soma = 0.0;

        // Loop para somar todas as notas do array
        for (double nota : notas) {
            soma += nota;
        }

        // Calculando a média dividindo a soma pelo número de notas
        double media = soma / notas.length;

        // Exibindo a média no console
        System.out.println("A média das notas é: " + media);
    }
}

/*
ForEach - Componentes da Sintaxe

for (TipoElemento variável: coleção) {
 // bloco de código a ser executado
}

TipoElemento:  O tipo de dados dos elementos dentro da coleção. No exemplo das notas, cada elemento era do tipo double.
Variável:  Uma variável temporária que representa o elemento atual da coleção em cada iteração.
Ela é atribuída a cada elemento da coleção em cada passo do loop.
Coleção:  O array ou lista que você deseja percorrer.
*/