package com.springteste.atividade09.dao;

import com.springteste.atividade09.entity.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaDAO extends JpaRepository<Turma, Integer> {}
