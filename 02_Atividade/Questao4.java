import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Properties;

public class Questao4 {

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

  public static void main(String[] args) {
    Properties prop = new Properties();
    try {
      prop.load(new FileInputStream("config.properties"));

      ArrayList<String> texto = LerArquivo(prop.getProperty("arquivo"));
      int Inicial = Integer.parseInt(prop.getProperty("linha_inicial"));
      int ultima = Integer.parseInt(prop.getProperty("linha_final"));

      for (int i = Inicial; i <= ultima; i++) {
        if (texto.get(i) != null) System.out.println(texto.get(i));
      }
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }
}
