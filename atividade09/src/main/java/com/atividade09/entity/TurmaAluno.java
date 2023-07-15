package com.atividade09.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "alunoturma")
public class TurmaAluno {

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "alunoid")
  int alunoid;

  @Id
  int alunoturmaid;

  @OneToMany(mappedBy = "TurmaAluno")
  List<Turma> turmas;

  public TurmaAluno() {}

  public TurmaAluno(int aluno, List<Turma> turmas) {
    this.alunoid = aluno;
    this.turmas = turmas;
  }

  public void setAluno(int aluno) {
    this.alunoid = aluno;
  }

  public int getAluno() {
    return alunoid;
  }

  public void setTurmas(List<Turma> turmas) {
    this.turmas = turmas;
  }

  public List<Turma> getTurmas() {
    return turmas;
  }

  public void setTurma(Turma turma) {
    this.turmas.add(turma);
  }
}
