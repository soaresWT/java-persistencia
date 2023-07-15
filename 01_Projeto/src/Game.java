public class Game {

  private String nome = "";
  private String descricao = "";
  private double valor = 0;
  private String mult = "";
  private int nota = 0;

  Game() {}

  Game(String nome, String descricao, double valor, String mult, int nota) {
    this.nome = nome;
    this.descricao = descricao;
    this.valor = valor;
    this.mult = mult;
    this.nota = nota;
  }

  public String getDescricao() {
    return descricao;
  }

  public String getNome() {
    return nome;
  }

  public int getNota() {
    return nota;
  }

  public double getValor() {
    return valor;
  }

  public String getmult() {
    return mult;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setmult(String mult) {
    this.mult = mult;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setNota(int nota) {
    this.nota = nota;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  @Override
  public String toString() {
    return (
      "o jogo " +
      nome +
      ", e um " +
      descricao +
      ",  com uma avaliação de " +
      nota +
      ",e " +
      mult +
      ", e multiplayer " +
      "esta custando apenas " +
      valor +
      " reais."
    );
  }
}
