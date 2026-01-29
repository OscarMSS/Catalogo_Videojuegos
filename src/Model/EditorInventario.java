package Model;
import Utilidades.InputManager;
import Utilidades.MenuManager;

import java.util.Map;

public class EditorInventario implements Edicion{
    //HACEMOS UNA INYECCIÓN POR CONSTRUCTOR
    private Map<String, Videojuego> inventario;
    private InputManager entrada;
    private MenuManager menu;


    // ESTÉ CONSTRUCTOR RECIBE EL MAPA YA CREADO EN PRODUCCIÓN
    public EditorInventario(Map<String, Videojuego> inventario, InputManager entrada, MenuManager menu) {
        this.inventario = inventario;
        this.entrada = entrada;
        this.menu = menu;
    }

    @Override
    public void editarClasificacion(Videojuego juego) {
        menu.pedirClasificacion();
        String nuevaClasificacion = entrada.validarString();
        juego.setClasificacion(nuevaClasificacion);
    }

    @Override
    public void editarPlataforma(Videojuego juego) {
        menu.pedirPlataforma();
        String nuevaPlataforma = entrada.validarString();
        juego.setPlataforma(nuevaPlataforma);
    }

    @Override
    public void editarPuntuacion(Videojuego juego) {
        menu.pedirPuntuacion();
        double nuevaPuntuacion = entrada.validarDouble();
        juego.setPuntuacion(nuevaPuntuacion);
    }

    @Override
    public void editarPrecio(Videojuego juego) {
        menu.pedirPrecio();
        double nuevoPrecio = entrada.validarDouble();
        juego.setPrecio(nuevoPrecio);
    }


    @Override
    public void editarCantidad(Videojuego juego) {
        menu.stock();
        int nuevoStock = entrada.validarInt();
        juego.setPrecio(nuevoStock);
    }
}
