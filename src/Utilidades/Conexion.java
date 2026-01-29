package Utilidades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //INTRODUCIR LOS DATOS DE LA BASE DE DATOS ALOJADA EN XAMPP
    private static final String URL = "jdbc:mysql://localhost:3306/Inventario_Juegos";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    //METODO PARA OBTENER LA CONEXIÓN
    public static Connection obtenerConcexion(){
        try{
            return DriverManager.getConnection(URL,USER,PASSWORD);
        }catch(SQLException e){
            System.out.println("❌ Error de conexión: " + e.getMessage());
            return null;
        }
    }
}
