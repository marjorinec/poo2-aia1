public class DisciplinaTrimestral extends Disciplina {
  
  public DisciplinaTrimestral() {
    super();
  }

  public double getNota1() {
    return nota1;
  }

  public double setNota1() {
    this.nota1 = nota1;
  }

  public double getNota2() {
    return nota2;
  }

  public double setNota2() {
    this.nota2 = nota2;
  }

  public String getNome() {
    return nome;
  }

  public double setNome() {
    this.nome = nome;
  }

  public int getPeriodo() {
    return periodo;
  }

  public double setPeriodo() {
    this.periodo = periodo;
  }


  double avaliacao() {
    double nota1 = getNota1();
    double nota2 = getNota2();
    double notaFinal = nota1*0.4 + nota2*0.6;

    return notaFinal;
  }

  String toString() { //Questão 2
    String nomeStr = "Nome: " + getNome();
    String periodoStr = "Período: " + getPeriodo();
    String nota1Str = "Nota 1: " + getNota1();
    String nota2Str = "Nota 2: " + getNota2();

    String infos = nomeStr + ", " + periodoStr + ", " + nota1Str + ", " + nota2Str;

    return infos;
  }
}