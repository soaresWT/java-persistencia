package com.springteste.atividade09.dao;

import com.springteste.atividade09.entity.TurmaAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaAlunoDAO extends JpaRepository<TurmaAluno, Integer> {}
