package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Utilidades.Conexion;

public class VideojuegoDAO {

    //METODO PARA REGISTRAR VIDEOJUEGOS EN LA BASE DE DATOS
    public void registrarVideojuego(Videojuego juego){

        //SENTENCIA SQL PARA ALMACENAR LOS DATOS DEL VIDEOJUEGO EN LA TABLA QUE SE ALOJA EN LA BASE DE DATOS
        String sql = "INSERT INTO Inventario (nombre, clasificacion, plataforma, puntuacion, precio, cantidad) VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection nuevaConexion = Conexion.obtenerConcexion();
            PreparedStatement ps = nuevaConexion.prepareStatement(sql)){
            {
                //LOS PS LLENAN LOS ´?´ EN ORDEN DEL INSERT
                ps.setString(1, juego.getNombre());
                ps.setString(2, juego.getClasificacion());
                ps.setString(3, juego.getPlataforma());
                ps.setDouble(4, juego.getPuntuacion());
                ps.setDouble(5, juego.getPrecio());
                ps.setInt(6, juego.getCantidad());

                //SE EJECUTA LA ORDEN EL INSERT EN MYSQL
                ps.executeUpdate();
                System.out.println("✅ ¡Guardado en la base de datos con éxito!");
            }
        }catch(SQLException e){
            System.out.println("❌ Error al registrar: " + e.getMessage());
        }
    }


}
