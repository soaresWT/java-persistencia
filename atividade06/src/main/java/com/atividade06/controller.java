package com.atividade06;

import java.sql.*;
import java.util.Scanner;

public class controller {

  public static void insert_alunos(
    String cpf,
    String matricula,
    String nome,
    String email,
    String telefone
  )
    throws SQLException {
    Connection c = factory.getConnection();

    PreparedStatement ps = c.prepareStatement(
      "insert into aluno(cpf, email, matricula, nome, telefone) VALUES (?,?,?,?,?)"
    );
    ps.setString(1, cpf);
    ps.setString(2, email);
    ps.setString(3, matricula);
    ps.setString(4, nome);
    ps.setString(5, telefone);

    int rs = ps.executeUpdate();
    System.out.println(rs);
  }

  public static void list_alunos() throws SQLException {
    Connection c = factory.getConnection();

    PreparedStatement ps = c.prepareStatement("select * from aluno");

    ResultSet rs = ps.executeQuery();

    while (rs.next()) {
      String nome = rs.getString("nome");
      String telefone = rs.getString("telefone");
      String email = rs.getString("email");
      String matricula = rs.getString("matricula");
      String cpf = rs.getString("cpf");
      String id = rs.getString("alunoid");

      StringBuffer sb = new StringBuffer();
      sb.append("nome: ");
      sb.append(nome);
      sb.append(", telefone: ");
      sb.append(telefone);
      sb.append(", email: ");
      sb.append(email);
      sb.append(", matricula: ");
      sb.append(matricula);
      sb.append(", cpf: ");
      sb.append(cpf);
      sb.append(", id: ");
      sb.append(id);
      System.out.println(sb);
    }
  }

  public static void main(String[] args) throws SQLException {
    Scanner menu = new Scanner(System.in);
    while (true) {
      System.out.print("##----------<menu>-----------##\n\n");
      System.out.print("|-----------------------------|\n");
      System.out.print("| Opção 1 - Add aluno         |\n");
      System.out.print("| Opção 2 - list alunos       |\n");
      System.out.print("| Opção 3 - Sair              |\n");
      System.out.print("|-----------------------------|\n");
      System.out.println("Digite uma opção: ");

      int opcao = Integer.parseInt(menu.nextLine());

      if (opcao == 3) {
        System.out.print("\nAté logo!");
        break;
      }
      switch (opcao) {
        case 1:
          System.out.println("\ninformacoes: \n");
          String cpf = menu.nextLine();
          String matricula = menu.nextLine();
          String nome = menu.nextLine();
          String email = menu.nextLine();
          String telefone = menu.nextLine();
          insert_alunos(cpf, matricula, nome, email, telefone);
          break;
        case 2:
          list_alunos();
          break;
      }
    }
    menu.close();
  }
}
