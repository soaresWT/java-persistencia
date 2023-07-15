package com.trabalho02.trabalho2.entity;

import java.util.*;
import javax.persistence.*;
import lombok.*;

@NamedQueries(
  {
    @NamedQuery(
      name = "findPorId",
      query = "SELECT F FROM filme F WHERE F.id_filme = :id_filme"
    ),
  }
)
@Entity
@Table(name = "filme")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Filme {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_filme;

  @Column(name = "titulo")
  String titulo;

  @Temporal(javax.persistence.TemporalType.DATE)
  private Date lancamento;

  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinTable(
    name = "filme_ator",
    joinColumns = @JoinColumn(name = "id_ator"),
    inverseJoinColumns = @JoinColumn(name = "id_filme")
  )
  private List<Ator> atores;

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb
      .append("ID DO FILME [")
      .append(id_filme)
      .append("]")
      .append("\n TITULO DO FILME [")
      .append(titulo)
      .append("]")
      .append("\n DATA DA LANCAMENTO DO FILME [")
      .append(lancamento.toString())
      .append("]");
    return sb.toString();
  }
}
