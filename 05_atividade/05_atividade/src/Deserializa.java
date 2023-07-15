import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Deserializa {

  public static void main(String[] args) throws IOException {
    ObjectMapper objectMapper = new ObjectMapper();

    Cidade cd = objectMapper.readValue(new File("toronto.json"), Cidade.class);
    System.out.println(cd);

    cd =    per.readValue(new File("santa-catarina.json"), Cidade.class);
    System.out.println(cd);

    cd = objectMapper.readValue(new File("choro.json"), Cidade.class);
    System.out.println(cd);

    cd = objectMapper.readValue(new File("blumenal.json"), Cidade.class);
    System.out.println(cd);
  }
}
