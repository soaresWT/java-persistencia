// 1. Crie uma classe Java de entidade. Exemplo: Filme (id, titulo, sinopse, diretor).
// - OBS: A classe não precisa implementar a interface java.io.Serializable.
public class Gato {

  private String nome;
  private int idade;

  public Gato() {}

  Gato(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  @Override
  public String toString() {
    return "{ O nome do gato e: " + nome + " e ele tem: " + idade + " anos }";
  }
}
