package com.trabalho02.trabalho2.entity;

import java.util.*;
import javax.persistence.*;
import lombok.*;

@Entity
@Table(name = "ator")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Ator {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_ator;

  @Column(name = "nome")
  private String nome;

  @Temporal(javax.persistence.TemporalType.DATE)
  private Date nascimento;

  @ManyToMany(mappedBy = "ator", fetch = FetchType.EAGER)
  private List<Filme> filmes;
}
