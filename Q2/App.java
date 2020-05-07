/* Faça uma aplicação que carregue um vetor com dados das diferentes disciplinas e ao final
liste todos os dados do vetor juntamente com as respectivas avaliações. Reescreva o método
toString em cada classe para listar as propriedades das disciplinas. Tratar possíveis erros de
entrada de dados enviando a mensagem “Entrada de dados Inválida!” e encerrando a aplicação
com System.exit(0). */

/* Adicione um recurso que permita que um array de objetos de um tipo Disciplina possa ser
ordenado pelo método Arrays.sort() com base na avaliação (Dica: Torne a Disciplina
Comparable).
Adicionado o recurso, altere o programa acima para este exiba o array antes da ordenação
e após a ordenação. */

import java.util.Scanner;

public class App{
  public static void main(String[] args) {
    int qtdDisciplinas;
    Disciplina[] disciplinas;
    String auxDisciplina;

    System.out.println("Quantas disciplinas terão dados adicionados?");
    qtdDisciplinas = scan.nextInt();

    disciplinas = new Disciplina[qtdDisciplinas];

    for (int qtd = 0; qtd < qtdDisciplinas; qtd++) {
      System.out.printf("Digite os dados da %d° disciplina", qtd+1);
        try {
          auxDisciplina = scan.next();
        } catch (InputMismatchException e) {
          System.out.println("Entrada de dados Inválida!");
          System.exit(0);
        }
        
        disciplinas[qtd] = new Disciplina(auxDisciplina);
      }
      
      System.out.println(disciplinas.toString());
      Array.sort(disciplinas);
      System.out.println(disciplinas.toString());
  }
}