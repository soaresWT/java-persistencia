import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Serializa {

  public static void main(String[] args)
    throws StreamWriteException, DatabindException, IOException {
    ArrayList<Game> games = new ArrayList<Game>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("informe quantos jogos serao cadastrados:");
    int qtd = scanner.nextInt();
    while (qtd >= 1) {
      Game game = new Game();
      scanner.nextLine();

      System.out.println("Inserir Nome do jogo: ");
      game.setNome(scanner.nextLine());

      System.out.println("Inserir Descricao do jogo: ");
      game.setDescricao(scanner.nextLine());

      System.out.println("Jogo multiplayer, sim ou nao : ");
      game.setmult(scanner.nextLine().toLowerCase());

      System.out.println("Porfavor insira uma nota entre 0 e 10");
      System.out.println("Nota do jogo : ");
      game.setNota(scanner.nextInt());

      System.out.println("Valor do jogo : ");
      game.setValor(scanner.nextDouble());
      games.add(game);
      qtd = qtd - 1;
    }
    scanner.close();

    System.out.println(games);

    ObjectMapper objectMapper = new ObjectMapper()
    .enable(SerializationFeature.INDENT_OUTPUT);
    scanner.close();

    objectMapper.writeValue(new File("games.json"), games);
  }
}
