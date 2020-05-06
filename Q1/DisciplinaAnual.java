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
}