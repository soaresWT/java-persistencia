import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Serializa {

  public static void main(String[] args) throws IOException {
    Cidade c1 = new Cidade("Blumenal", 43.2, 10);
    Cidade c2 = new Cidade("toronto", 20.0, 19);
    Cidade c3 = new Cidade("santa-catarina", 10, 10);
    Cidade c4 = new Cidade("choro", 10, 10);

    ArrayList<Cidade> cidades = new ArrayList<Cidade>();

    cidades.add(c1);
    cidades.add(c2);
    cidades.add(c3);
    cidades.add(c4);

    ObjectMapper objectMapper = new ObjectMapper()
    .enable(SerializationFeature.INDENT_OUTPUT);
    for (Cidade element : cidades) {
      objectMapper.writeValue(new File(element.getNome() + ".json"), element);
    }
  }
}
