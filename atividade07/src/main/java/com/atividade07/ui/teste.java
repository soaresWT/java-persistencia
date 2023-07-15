package com.atividade07.ui;

import com.atividade07.dao.AlunoDAO;
import com.atividade07.dao.AlunoJPADAO;
import com.atividade07.entity.Aluno;
import java.util.Scanner;

public class teste {

  public static void main(String[] args) {
    AlunoDAO alunoDAO = new AlunoJPADAO();
    Scanner scanner = new Scanner(System.in);
    String menu =
      "digite 1 para listar\ndigite 2 para inserir\ndigite 3 para apagar\ndigite 4 para pesquisar\ndigite 5 para sair";
    char opcao;
    do {
      System.out.println(menu);
      opcao = scanner.nextLine().charAt(0);
      switch (opcao) {
        case '1':
          alunoDAO.list();
          break;
        case '2':
          Aluno aln = new Aluno();
          System.out.println("nome");
          aln.setNome(scanner.nextLine());
          System.out.println("email");
          aln.setEmail(scanner.nextLine());
          System.out.println("telefone");
          aln.setTelefone(scanner.nextLine());
          System.out.println("matricula");
          aln.setMatricula(scanner.nextLine());
          System.out.println("cpf");
          aln.setCpf(scanner.nextLine());
          alunoDAO.save(aln);
          break;
        case '3':
          alunoDAO.delete(Integer.parseInt(scanner.nextLine()));
          break;
        case '4':
          System.out.println("digite id do aluno que quer procurar");
          alunoDAO.findById(Integer.parseInt(scanner.nextLine()));
          break;
      }
    } while (opcao != '5');
    System.out.println("Good bye!");
    scanner.close();
  }
}
