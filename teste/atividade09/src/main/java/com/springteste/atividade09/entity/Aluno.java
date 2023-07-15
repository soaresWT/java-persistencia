package com.springteste.atividade09.entity;

import java.util.List;
import javax.persistence.*;
import lombok.*;

@NamedQueries(
  {
    @NamedQuery(
      name = "alunoPorId",
      query = "select a from Cliente a where a.alunoid= :alunoid"
    ),
  }
)
@Entity
@Table(name = "aluno")
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(exclude = "turmas")
public class Aluno {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Getter
  @Setter
  private Integer alunoid;

  @NonNull
  @Getter
  @Setter
  private String cpf;

  @Getter
  @Setter
  private String nome;

  @Getter
  @Setter
  private String email;

  @Getter
  @Setter
  private String telefone;

  @Getter
  @Setter
  private String matricula;

  @OneToMany(mappedBy = "cliente")
  @Getter
  @Setter
  private List<TurmaAluno> turmas;
}
