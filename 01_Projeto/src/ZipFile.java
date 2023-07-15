import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    String sourceFile = scanner.nextLine();
    FileOutputStream fos = new FileOutputStream(sourceFile + ".zip");
    ZipOutputStream zipOut = new ZipOutputStream(fos);
    File fileToZip = new File(sourceFile);
    FileInputStream fis = new FileInputStream(fileToZip);
    ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
    zipOut.putNextEntry(zipEntry);
    byte[] bytes = new byte[1024];
    int length;
    while ((length = fis.read(bytes)) >= 0) {
      zipOut.write(bytes, 0, length);
    }
    scanner.close();
    zipOut.close();
    fis.close();
    fos.close();
  }
}
