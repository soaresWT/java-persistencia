package serializacao;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.*;

//recebe por argumentos os arquivos a serem deserializados
public class deserializav2 {

  public static void main(String[] args) {
    ArrayList<Gato> gatos = new ArrayList<Gato>();
    Gato gato = new Gato();
    for (String elementos : args) {
      try {
        FileInputStream fileIn = new FileInputStream(elementos);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        gato = (Gato) in.readObject();
        in.close();
        fileIn.close();
        gatos.add(gato);
      } catch (Exception ex) {
        ex.printStackTrace();
      }
    }
    System.out.println(gatos);
  }
}
