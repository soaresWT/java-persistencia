// 2. Crie uma classe Java de nome Serializa para
// instanciar objetos da classe definida na Questão 1
// ]e adicionar esses objetos em uma Lista. Depois,
// percorrer a lista e Serializar os objetos em
// disco/ssd. Serialize usando XML através da biblioteca
// Jackson (XML Serialization and Deserialization with Jackson | Baeldung).
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class serializaxml {

  public static void main(String[] args)
    throws StreamWriteException, DatabindException, IOException {
    Gato g1 = new Gato("Floco", 6);
    Gato g2 = new Gato("Esmeralda", 4);
    Gato g3 = new Gato("chico", 10);
    ArrayList<Gato> gatos = new ArrayList<Gato>();
    gatos.add(g1);
    gatos.add(g2);
    gatos.add(g3);

    for (Gato element : gatos) {
      File f = new File("gatos" + element.getNome() + ".xml");
      XmlMapper xm = new XmlMapper();
      xm.enable(SerializationFeature.INDENT_OUTPUT);
      xm.writeValue(f, element);
    }
  }
}
