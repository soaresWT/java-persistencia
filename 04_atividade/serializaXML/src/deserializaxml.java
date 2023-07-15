// 3. Crie uma classe java de nome Desserializa
// para ler / desserializar os objetos Serializados
// na Questão 2 e exibi-los também através do uso da
// bilbioteca Jackson (XML Serialization and
// Deserialization with Jackson | Baeldung).
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;

public class deserializaxml {

  public static void main(String[] args) throws Exception {
    XmlMapper xm = new XmlMapper();
    Gato gato = new Gato();

    File file1 = new File("gatosEsmeralda.xml");
    gato = xm.readValue(file1, Gato.class);
    System.out.println(gato);

    File file2 = new File("gatoschico.xml");
    gato = xm.readValue(file2, Gato.class);
    System.out.println(gato);

    File file3 = new File("gatosFloco.xml");
    gato = xm.readValue(file3, Gato.class);
    System.out.println(gato);
  }
}
