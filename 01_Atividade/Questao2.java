import java.io.*;
import java.util.ArrayList;

public class Questao2 {

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

  static void EscreverArquivo(String arquivo, ArrayList<String> text)
    throws IOException {
    OutputStream os = new FileOutputStream(arquivo);
    OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
    BufferedWriter bw = new BufferedWriter(osw);
    for (int i = 0; i < text.size(); i++) {
      bw.write(text.get(i));
      bw.newLine();
    }
    bw.close();
  }

  public static void main(String[] args) throws IOException {
    String ArquivoOrigem = args[0];
    String ArquivoDestino = args[1];
    ArrayList<String> texto = new ArrayList<String>();
    texto = LerArquivo(ArquivoOrigem);
    EscreverArquivo(ArquivoDestino, texto);
  }
}
