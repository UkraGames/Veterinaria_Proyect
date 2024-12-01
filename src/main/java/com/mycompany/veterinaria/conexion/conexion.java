package com.mycompany.veterinaria.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {

    /**
     *
     */
    protected static Connection conn;
    private static final String URL = "jdbc:mysql://localhost:3306/veterinaria";
    private static final String USER = "root";
    private static final String PASS = "";
   
    public void getConnection() throws ClassNotFoundException {
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar" + e.getMessage());
        }
    }
    public void Close() throws SQLException{
        if (conn != null){
            if (!conn.isClosed()){
                conn.close();
            }
        }
    }
}   