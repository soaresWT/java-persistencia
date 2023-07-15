import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Questao {

  static ArrayList<String> LerArquivo(String nomeArquivo) throws IOException {
    ArrayList<String> linhas = new ArrayList<String>();
    InputStream is = new FileInputStream(nomeArquivo);
    InputStreamReader isr = new InputStreamReader(is, "UTF-8");
    try (BufferedReader br = new BufferedReader(isr)) {
      String s = br.readLine();
      while (s != null) {
        linhas.add(s);
        s = br.readLine();
      }
    }
    return linhas;
  }

  public static void main(String[] args) throws IOException {
    Scanner entrada = new Scanner(System.in);

    String Arquivo = "";

    while (Arquivo.isEmpty()) {
      System.out.println("Nenhum caminho digitado");
      Arquivo = entrada.nextLine();
    }

    ArrayList<String> Linhas = LerArquivo(Arquivo);
    String Numero = entrada.nextLine();

    int Inicial = 0;

    if (Numero.isEmpty()) {
      Inicial = 0;
    } else {
      Inicial = Integer.parseInt(Numero);
    }

    Numero = "";
    Numero = entrada.nextLine();

    int fn = 0;

    if (!Numero.isEmpty()) {
      fn = Integer.parseInt(Numero);
    } else {
      fn = (int) Linhas.size() - 1;
    }
    entrada.close();

    for (int i = Inicial; i <= fn; i++) {
      if (Linhas.get(i) != null) System.out.println(Linhas.get(i));
    }
  }
}
