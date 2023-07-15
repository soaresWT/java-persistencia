import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class sha1 {

  public static void create_sha1(File file)
    throws NoSuchAlgorithmException, IOException {
    MessageDigest sha1 = MessageDigest.getInstance("SHA1");
    FileInputStream fis = new FileInputStream(file);

    byte[] data = new byte[1024];
    int read = 0;
    while ((read = fis.read(data)) != -1) {
      sha1.update(data, 0, read);
    }
    byte[] hashBytes = sha1.digest();
    StringBuffer sb = new StringBuffer();

    for (int i = 0; i < hashBytes.length; i++) {
      sb.append(
        Integer.toString((hashBytes[i] & 0xff) + 0x100, 16).substring(1)
      );
    }
    String fileHash = sb.toString();
    System.out.println(fileHash);
    fis.close();
  }

  public static void main(String[] args) throws Exception {
    File file = new File(args[0]);
    create_sha1(file);
  }
}
