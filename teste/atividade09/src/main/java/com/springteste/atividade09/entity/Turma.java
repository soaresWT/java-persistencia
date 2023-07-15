package com.springteste.atividade09.entity;

import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "turma")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString
public class Turma {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  @Setter
  private int turmaid;

  @ManyToOne
  @NonNull
  @Getter
  @Setter
  private TurmaAluno turma_aluno;

  @Getter
  @Setter
  private String disciplina;

  @Getter
  @Setter
  private String periodo;
}
