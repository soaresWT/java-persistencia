package com.trabalho02.trabalho2.Controller;

import com.trabalho02.trabalho2.DAO.AtorDAO;
import com.trabalho02.trabalho2.DAO.FilmeDAO;
import com.trabalho02.trabalho2.entity.Ator;
import com.trabalho02.trabalho2.entity.Filme;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.trabalho02.trabalho2")
public class Crud implements CommandLineRunner {

  @Autowired
  FilmeDAO filmeDAO;

  @Autowired
  AtorDAO atorDAO;

  Ator ator;
  Filme filme;
  List<Ator> atores;
  List<Filme> filmes;
  SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");

  public static void main(String[] args) {
    SpringApplicationBuilder builder = new SpringApplicationBuilder(Crud.class);
    builder.headless(false).run(args);
  }

  @Override
  public void run(String... args) throws Exception {
    String op = null;
    do {
      op =
        JOptionPane.showInputDialog(
          null,
          "'1' - Inserir Ator \n" +
          "'2' - Inserir Disciplina\n" +
          "'3' - Associacao Aluno - Disciplina\n" +
          "'4' - Atualizar Aluno\n" +
          "'5' - Atualizar Disciplina\n" +
          "'6' - Deletar Aluno\n" +
          "'7' - Deletar Disciplina\n" +
          "'8' - Buscar Aluno (nome) \n" +
          "'9' - Alunos de uma determinada disciplina(codigo)\n" +
          "'10' - Aluno e a quantidade de disciplina\n" +
          "'11' - Matricula, nome e email do Aluno\n" +
          "'12' - Students after a date(estudantes que nasceram depois de uma data)\n" +
          "'13' - sair da execução\n",
          "Menu",
          JOptionPane.QUESTION_MESSAGE
        );
      if (op.equalsIgnoreCase("1")) {
        String Nome = JOptionPane.showInputDialog(null, "Nome");
        String data = JOptionPane.showInputDialog(null, "date");
        inserirAtor(Nome, data);
      }
    } while (!op.equals("13"));
  }

  public void inserirAtor(String nome, String data) throws Exception {
    Ator a = new Ator();
    a.setNome(nome);
    Date dataa = formato.parse(data);
    a.setNascimento(dataa);
    atorDAO.save(a);
    JOptionPane.showMessageDialog(null, "Adicionado!");
  }
}
