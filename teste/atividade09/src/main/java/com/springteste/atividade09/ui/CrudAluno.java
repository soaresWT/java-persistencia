package com.springteste.atividade09.ui;

import com.springteste.atividade09.dao.AlunoDAO;
import com.springteste.atividade09.entity.Aluno;
import java.util.List;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.springteste.atividade09")
public class CrudAluno implements CommandLineRunner {

  @Autowired
  private AlunoDAO alunos;

  public static void obterAluno(Aluno aluno) {
    String nome = JOptionPane.showInputDialog("nome:", aluno.getNome());
    String matricula = JOptionPane.showInputDialog(
      "matricula:",
      aluno.getMatricula()
    );
    String telefone = JOptionPane.showInputDialog(
      "telefone:",
      aluno.getTelefone()
    );
    String email = JOptionPane.showInputDialog("email:", aluno.getEmail());
    String cpf = JOptionPane.showInputDialog("cpf:", aluno.getCpf());
    aluno.setCpf(cpf);
    aluno.setEmail(email);
    aluno.setMatricula(matricula);
    aluno.setNome(nome);
    aluno.setTelefone(telefone);
  }

  public static void listaAlunos(List<Aluno> Alunos) {
    StringBuilder listagem = new StringBuilder();
    for (Aluno aln : Alunos) {
      listagem.append(aln).append("\n");
    }
    JOptionPane.showMessageDialog(
      null,
      listagem.length() == 0 ? "Nenhum Aluno encontrado" : listagem
    );
  }

  public static void listaAluno(Aluno aln) {
    JOptionPane.showMessageDialog(
      null,
      aln == null ? "Nenhum Aluno encontrado" : aln
    );
  }

  @Override
  public void run(String... args) throws Exception {
    String menu =
      "Escolha uma opção:\n1 - Inserir\n2 - Atualizar por CPF\n3 - Remover por CPF\n4 - Exibir por CPF\n5 - Exibir por id\n6 - Exibir todos\n7 - Exibir todos que contem determinado nome\n8 - Sair";
    char opcao;
    do {
      Aluno aluno;
      // String cpf;
      opcao = JOptionPane.showInputDialog(menu).charAt(0);
      switch (opcao) {
        case '1':
          aluno = new Aluno();
          obterAluno(aluno);
          alunos.save(aluno);
      }
    } while (opcao != '8');
  }
}
