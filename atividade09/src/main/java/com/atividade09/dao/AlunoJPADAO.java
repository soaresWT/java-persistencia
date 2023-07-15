package com.atividade07.dao;

import com.atividade07.entity.Aluno;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;

public class AlunoJPADAO implements AlunoDAO {

  public void save(Aluno aluno) {
    EntityManager em = Persistence
      .createEntityManagerFactory("dev")
      .createEntityManager();

    EntityTransaction tx = em.getTransaction();

    try {
      tx.begin();
      em.persist(aluno);
      tx.commit();
    } catch (Exception e) {
      tx.rollback();
      e.printStackTrace();
    } finally {
      em.close();
    }
  }

  public void list() {
    CriteriaBuilder cb = Persistence
      .createEntityManagerFactory("dev")
      .getCriteriaBuilder();
    CriteriaQuery<Aluno> cq = cb.createQuery(Aluno.class);
    Root<Aluno> rootEntry = cq.from(Aluno.class);
    CriteriaQuery<Aluno> all = cq.select(rootEntry);
    TypedQuery<Aluno> allQuery = Persistence
      .createEntityManagerFactory("dev")
      .createEntityManager()
      .createQuery(all);
    List<Aluno> alns = allQuery.getResultList();
    for (Aluno aluno : alns) {
      System.out.println(aluno);
    }
  }

  public void delete(int id) {
    EntityManager manager = Persistence
      .createEntityManagerFactory("dev")
      .createEntityManager();
    Aluno aln = manager.find(Aluno.class, id);
    System.out.println(aln);

    manager.getTransaction().begin();
    manager.remove(aln);
    manager.getTransaction().commit();
  }

  public void findById(int id) {
    EntityManager manager = Persistence
      .createEntityManagerFactory("dev")
      .createEntityManager();
    Aluno aln = manager.find(Aluno.class, id);
    System.out.println(aln);
  }
}
