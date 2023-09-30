package br.ulbra.aula1;

/**
 * @author Jeferson Leon
 */
public class ProjetoAula1 {

    public static void main(String[] args) {
        //Declaração de variáveis
        String nome;
        int anoNascimento, anoAtual, idade;

        //Faça as entradas de dados
        nome = "Jeferson Faleiro Leon";
        anoNascimento = 1990;
        anoAtual = 2023;
        //Resolva o problema - Processamento
        idade = anoAtual - anoNascimento;
        System.out.println(nome + " sua idade é " + idade + " anos");

    }

}
