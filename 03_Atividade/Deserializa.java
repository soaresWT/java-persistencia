package serializacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

//busca o arraylist com os objetos tipo gato, a warning do compilador java, pois a estrutura list é
//serializavel, mas temos que garantir que os objetos que a list contenham tambem sejam, neste caso
//sabemos com certeza que ambos sao
public class Deserializa {

  public static void main(String[] args) {
    ArrayList<Gato> gatos = new ArrayList<Gato>();
    try {
      FileInputStream fileIn = new FileInputStream("gatoList.ser");
      ObjectInputStream in = new ObjectInputStream(fileIn);
      gatos = (ArrayList<Gato>) in.readObject();
      in.close();
      fileIn.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    System.out.println(gatos);
  }
}
