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
   
    public void getConnection() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar" + e.getMessage());
        }
    }
    public void Close() throws SQLException {
    if (conn == null) {
        System.out.println("La conexión ya es nula, no se puede cerrar.");
        return;
    }
    if (conn.isClosed()) {
        System.out.println("La conexión ya estaba cerrada.");
    } else {
        System.out.println("Cerrando la conexión...");
        conn.close();
        System.out.println("Conexión cerrada correctamente.");
    }
}
}   