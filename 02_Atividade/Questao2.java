import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.*;

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

  static void escrever(ArrayList<String> text, String arquivo)
    throws IOException {
    OutputStream os = new FileOutputStream(arquivo, true);
    OutputStreamWriter osw = new OutputStreamWriter(os);
    BufferedWriter bw = new BufferedWriter(osw);
    for (String element : text) {
      bw.write(element);
      bw.newLine();
    }
    bw.close();
  }

  public static void main(String[] args) throws IOException {
    String primeiroArquivo = args[0];
    String segundoArquivo = args[1];
    String criarArquivo = args[2];

    ArrayList<String> texto1 = LerArquivo(primeiroArquivo);
    ArrayList<String> texto2 = LerArquivo(segundoArquivo);

    BufferedWriter saida = new BufferedWriter(new FileWriter(criarArquivo));

    escrever(texto1, criarArquivo);
    escrever(texto2, criarArquivo);

    saida.close();
  }
}
