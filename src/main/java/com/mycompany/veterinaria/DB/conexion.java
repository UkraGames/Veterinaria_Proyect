package com.mycompany.veterinaria.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    /**
     *
     */
    protected Connection conn;
    private static final String URL = "jdbc:mysql://localhost:3306/veterinaria";
    private static final String USER = "root";
    private static final String PASS = "";
   
    /**
     *
     */
    public void getConnection() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.out.println("Error al conectar" + e.getMessage());
        }
    }

    /**
     *
     * @throws SQLException
     */
    public void Close() throws SQLException {
    if (conn == null) {
        return;
    }
    if (conn.isClosed()) {
    } else {
        conn.close();
    }
}
}   