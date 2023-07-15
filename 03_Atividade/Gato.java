package serializacao;

public class Gato implements java.io.Serializable {

  private String nome;
  private String corPelo;
  private int idade;
  private int peso;
  private int vidas;

  public String getCorPelo() {
    return corPelo;
  }

  public int getIdade() {
    return idade;
  }

  public String getNome() {
    return nome;
  }

  public int getPeso() {
    return peso;
  }

  public int getVidas() {
    return vidas;
  }

  public void setCorPelo(String corPelo) {
    this.corPelo = corPelo;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public void setVidas(int vidas) {
    this.vidas = vidas;
  }

  @Override
  public String toString() {
    return (
      "\n O gato tem nome " +
      nome +
      ", Cor do pelo " +
      corPelo +
      ", idade " +
      idade +
      ", peso " +
      peso +
      " e restam " +
      vidas +
      " e tem peso " +
      peso +
      "\n"
    );
  }
}
