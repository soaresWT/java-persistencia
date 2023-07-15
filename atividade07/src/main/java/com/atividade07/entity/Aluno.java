package com.atividade07.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
public class Aluno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int alunoid;

  private String nome;
  private String email;
  private String telefone;
  private String matricula;
  private String cpf;

  public Aluno() {}

  public Aluno(
    String nome,
    String email,
    String telefone,
    String matricula,
    String cpf
  ) {
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
    this.matricula = matricula;
    this.cpf = cpf;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "alunoid")
  public Integer getId() {
    return alunoid;
  }

  public void setId(Integer id) {
    this.alunoid = id;
  }

  @Column(name = "nome")
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  @Column(name = "email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name = "telefone")
  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  @Column(name = "matricula")
  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  @Column(name = "cpf")
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return (
      "Aluno [id=" +
      alunoid +
      ", nome=" +
      nome +
      ", email=" +
      email +
      ", telefone=" +
      telefone +
      ", matricula=" +
      matricula +
      ", cpf=" +
      cpf +
      "]"
    );
  }
}
