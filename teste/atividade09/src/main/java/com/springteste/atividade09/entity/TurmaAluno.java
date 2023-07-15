package com.springteste.atividade09.entity;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.*;

@Entity
@Table(name = "alunoturma")
@NoArgsConstructor
@AllArgsConstructor
public class TurmaAluno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  @Setter
  private int id;

  @Getter
  @Setter
  private int faltas;

  @Getter
  @Setter
  private Float NotaFinal;

  @ManyToOne
  @Getter
  @Setter
  private Aluno aluno;

  @OneToMany(mappedBy = "alunoturma", cascade = CascadeType.ALL)
  @Getter
  @Setter
  private List<Turma> turmas;
}
