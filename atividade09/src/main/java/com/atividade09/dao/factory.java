package com.atividade09.dao;

import java.sql.*;

public class factory {

  public static Connection getConnection() throws SQLException {
    try {
      Class.forName("org.postgresql.Driver");
      return DriverManager.getConnection(
        "jdbc:postgresql://localhost/aluno",
        "postgres",
        "123"
      );
    } catch (ClassNotFoundException e) {
      throw new SQLException(e.getMessage());
    }
  }
}
