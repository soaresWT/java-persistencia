package serializacao;

// esta versao serializa individualmente os objetos gatos...
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

public class serializav2 {

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
    for (int i = 0; i < gatos.size(); i++) {
      try {
        FileOutputStream fileOut = new FileOutputStream(
          "gatoSerializado" + Integer.toString(i) + ".ser"
        );
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(gatos.get(i));
        out.close();
        fileOut.close();
        System.out.printf("Serializado");
      } catch (IOException p) {
        p.printStackTrace();
      }
    }
  }
}
