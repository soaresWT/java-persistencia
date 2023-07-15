import com.aspose.cells.JsonLayoutOptions;
import com.aspose.cells.JsonUtility;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Desereliaza {

  public static void convert_csv(String arg) throws Exception {
    JsonNode jsonTree = new ObjectMapper().readTree(new File(arg));
    String inputjson = jsonTree.toString();
    System.out.println(inputjson);

    Workbook workbook = new Workbook();

    Worksheet worksheet = workbook.getWorksheets().get(0);

    JsonLayoutOptions layoutOptions = new JsonLayoutOptions();
    layoutOptions.setArrayAsTable(true);

    JsonUtility.importData(
      inputjson,
      worksheet.getCells(),
      0,
      0,
      layoutOptions
    );
    System.out.println(inputjson);

    try {
      workbook.save("output.csv", SaveFormat.CSV);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void convert_xml(String arg)
    throws StreamReadException, DatabindException, IOException {
    ObjectMapper objectMapper = new ObjectMapper();

    JsonNode node = objectMapper.readValue(new File(arg), JsonNode.class);
    ArrayList<JsonNode> list = new ArrayList<JsonNode>();
    list.add(node);

    XmlMapper xmlMapper = new XmlMapper();
    xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
    xmlMapper.writeValue(new File("output.xml"), list);
  }

  public static void main(String[] args) throws Exception {
    convert_csv(args[0]);
    convert_xml(args[0]);
  }
}
