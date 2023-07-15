public class Cidade {

  private String nome;
  private double area;
  private int idade;

  Cidade() {}

  Cidade(String nome, double d, int idade) {
    this.nome = nome;
    this.area = d;
    this.idade = idade;
  }

  public double getArea() {
    return area;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public void setArea(float area) {
    this.area = area;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return nome + ", tem " + area + " km de area e " + idade + " Anos";
  }
}
