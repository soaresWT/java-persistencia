package com.springteste.atividade09.dao;

import com.springteste.atividade09.entity.Aluno;
import java.util.List;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoDAO extends JpaRepository<Aluno, Integer> {
  public Aluno findFirstByCpf(String cpf);

  @Query("select c from aluno c where c.cpf = :cpf")
  public Aluno buscaPrimeiroPorCpf(String cpf);

  // A consulta nomeada "AlunoInciadoPorNome" está definida na classe Aluno
  @Query(name = "AlunoPorCpf")
  public Aluno buscaPorCpfViaConsultaNomeada(String cpf);

  // Os métodos findByNomeStartingWith e buscaPorNomeIniciadoPor fazem exatamente a mesma coisa
  public List<Aluno> findByNomeStartingWith(String str);

  @Query("select c from Aluno c where c.nome like :nome%")
  public List<Aluno> buscaPorNomeIniciadoPor(String nome);
}
