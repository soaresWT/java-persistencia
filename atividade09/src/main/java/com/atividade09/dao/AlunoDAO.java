package main.java.com.atividade09.dao;

import com.atividade07.entity.Aluno;

public interface AlunoDAO {
  public void save(Aluno aluno);

  public void list();

  public void delete(int id);

  public void findById(int id);
}
