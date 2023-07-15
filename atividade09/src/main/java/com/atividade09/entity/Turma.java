package com.atividade09.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "turma")
public class Turma {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int turmaid;

  String periodo;
  String disciplina;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "alunoturmaid")
  int alunoturmaid;

  public Turma() {}

  public Turma(int id, String periodo, String disciplina) {
    this.turmaid = id;
    this.periodo = periodo;
    this.disciplina = disciplina;
  }

  public void setId(int id) {
    this.turmaid = id;
  }

  public int getId() {
    return this.turmaid;
  }

  public void setDisciplina(String Disciplina) {
    this.disciplina = Disciplina;
  }

  public String getDisciplina() {
    return this.disciplina;
  }

  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }

  public String getPeriodo() {
    return this.periodo;
  }
}
