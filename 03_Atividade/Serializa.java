package serializacao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

//esta versao serializa uma list de objetos gatos...

public class Serializa {

  public static void main(String[] args) {
    ArrayList<Gato> gatos = new ArrayList<Gato>();
    Scanner ler = new Scanner(System.in);
    for (int i = 0; i < 2; i++) {
      Gato gato = new Gato();
      gato.setCorPelo(ler.next());
      gato.setIdade(ler.nextInt());
      gato.setNome(ler.next());
      gato.setVidas(ler.nextInt());
      gato.setPeso(ler.nextInt());
      gatos.add(gato);
    }
    ler.close();
    try {
      FileOutputStream fileOut = new FileOutputStream("gatoList.ser");
      ObjectOutputStream out = new ObjectOutputStream(fileOut);
      out.writeObject(gatos);
      out.close();
      fileOut.close();
      System.out.printf("Serializado");
    } catch (IOException i) {
      i.printStackTrace();
    }
  }
}
