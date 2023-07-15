import java.io.*;
import java.util.ArrayList;

public class Questao1 {

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
    String Arquivo = args[0];
    String subsString = args[1];
    ArrayList<String> texto = LerArquivo(Arquivo);

    for (int element = 0; element < (int) texto.size(); element++) {
      if (texto.get(element).toLowerCase().contains(subsString.toLowerCase())) {
        System.out.println(texto.get(element));
      }
    }
  }
}
