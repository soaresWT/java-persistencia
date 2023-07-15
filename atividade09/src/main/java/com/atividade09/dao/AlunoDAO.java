package com.atividade09.dao;

import com.atividade09.entity.Aluno;

public interface AlunoDAO {
  public void save(Aluno aluno);

  public void list();

  public void delete(int id);

  public void findById(int id);
}
