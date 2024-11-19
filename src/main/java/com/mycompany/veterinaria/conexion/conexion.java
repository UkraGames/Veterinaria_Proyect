package com.mycompany.veterinaria.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private static final String url = "jdbc:mysql://localhost";
    private static final String userName = "root";
    private static final String password = "";
    protected static Connection conn = null;
   
    public static Connection getConnection(){
        try {
            conn = DriverManager.getConnection(url, userName, password);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al conectar" + e.getMessage());
        }
        return conn;
    }
}   