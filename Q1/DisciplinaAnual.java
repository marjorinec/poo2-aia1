public class DisciplinaAnual extends Disciplina {
  double nota3;
  double nota4;
  double nota5;
  double nota6;

  public DisciplinaAnual() {
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
    double notaFinal = ((nota1 + nota2 + nota3 + nota4 + nota5) / 5.0 * 0.6) + (nota6 * 0.4);

    return notaFinal;
  }

  String toString() { //Questão 2
    String nomeStr = "Nome: " + getNome();
    String periodoStr = "Período: " + getPeriodo();
    String nota1Str = "Nota 1: " + getNota1();
    String nota2Str = "Nota 2: " + getNota2();
    String nota3Str = "Nota 3: " + nota3;
    String nota4Str = "Nota 4: " + nota4;
    String nota5Str = "Nota 5: " + nota5;
    String nota6Str = "Nota 6: " + nota6;

    String infos = nomeStr + ", " + periodoStr + ", " + nota1Str + ", " + nota2Str + ", " + nota3Str + ", " + nota4Str + ", " + nota5Str + ", " + nota6Str;


    return infos;
  }
}