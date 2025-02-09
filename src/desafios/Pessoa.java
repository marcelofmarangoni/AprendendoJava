package desafios;

public class Pessoa {
    // Atributos da classe (sem encapsulamento para simplificação)
    public String nome;
    public int idade;


    // Construtor para inicializar os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
            }

    // Método para exibir as informações da pessoa
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana", 25);
        pessoa.exibirInformacoes();
    }
}
/*
Explicação das simplificações
Atributos públicos: nome e idade agora são públicos, permitindo acesso direto (sem get e set).
Método exibirInformacoes(): continua exibindo as informações.
*/
