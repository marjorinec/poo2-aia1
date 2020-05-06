public class Disciplina {
  String nome;
  int periodo;
  double nota1;
  double nota2;

  double avaliacao() {
    double notaFinal = (nota1+nota2)/2.0;
    
    return notaFinal;
  }
}