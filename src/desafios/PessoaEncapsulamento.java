package desafios;

public class PessoaEncapsulamento {

    // Atributos da classe
    private String nome;
    private int idade;

    // Construtor para inicializar os atributos
    public PessoaEncapsulamento(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para exibir as informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    // Métodos getters e setters (opcionais)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana", 25);
        pessoa.exibirInformacoes();
    }

}

/*
Explicação do código

Atributos: nome e idade representam os dados da pessoa.
Construtor: Pessoa(String nome, int idade) inicializa os atributos nome e idade ao criar uma nova instância da classe.
Método exibirInformacoes(): exibe o valor dos atributos nome e idade no console.
Main: cria uma instância de Pessoa e chama exibirInformacoes() para mostrar os dados.
 */
