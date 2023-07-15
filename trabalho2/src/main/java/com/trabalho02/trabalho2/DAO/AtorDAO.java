package com.trabalho02.trabalho2.DAO;

import com.trabalho02.trabalho2.entity.Ator;
import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AtorDAO extends JpaRepository<Ator, Integer> {
  @Query("SELECT A FROM ator A WHERE A.nascimento = :data")
  public List<Ator> findByDate(Date data);

  @Override
  public void deleteById(Integer id);

  public Ator findFirstByname(String str);

  public Ator findFirstById(Integer inte);
}
