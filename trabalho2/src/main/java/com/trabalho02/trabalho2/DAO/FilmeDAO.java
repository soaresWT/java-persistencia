package com.trabalho02.trabalho2.DAO;

import com.trabalho02.trabalho2.entity.Filme;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeDAO extends JpaRepository<Filme, Integer> {
  @Query("SELECT COUNT(f) FROM filme f")
  public Integer countFilme();

  public void deleteById(Integer id);

  @Query("SELECT A FROM ator A WHERE A.nome LIKE %:str%")
  public List<Filme> findByName(String name);

  @Query(name = "findPorId")
  public Filme buscaPrimeiraFILME(Integer id);
}
