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

public class Disciplina implements Comparable<Disciplina>{ //Questão 3
  String nome;
  int periodo;
  double nota1;
  double nota2;

  double avaliacao() {
    double notaFinal = (nota1+nota2)/2.0;
    
    return notaFinal;
  }

  String toString() { //Questão 2
    String nomeStr = "Nome: " + nome;
    String periodoStr = "Período: " + periodo;
    String nota1Str = "Nota 1: " + nota1;
    String nota2Str = "Nota 2: " + nota2;
    String infos = nomeStr + ", " + periodoStr + ", " + nota1Str + ", " + nota2Str;

    return infos;
  }

  public int compareTo(Disciplina d) {
    double av = avaliacao();
    double aval = d.avaliacao();
    if (av == aval) {
      return 0;
    } else if (av > aval) {
      return 1;
    } else {
      return -1;
    }
  }
}