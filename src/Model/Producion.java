package Model;

import Utilidades.InputManager;
import Utilidades.MenuManager;
import java.util.HashMap;


public class Producion implements Metodos{

    //inicializar lista
    HashMap<String,Videojuego> inventario = new HashMap<>();
    //crear objeto
    InputManager entrada = new InputManager();
    MenuManager menu = new MenuManager();
    //ESTE OBJETO PASA TANTO EL MAPA COMO LA ENTRADA CREADA AL EDITOR DE INVENTRIO
    EditorInventario editor = new EditorInventario(inventario,entrada,menu);

    @Override
    public void agregarJuego() {
        //INICIALIZACIÓN DE VARIABLES
        String nombre;
        String clasificacion;
        String plataforma;
        double puntuacion;
        double precio;
        int cantidad;

        //REGISTRO DE LOS DATOS DEL JUEGO
        menu.registrarJuego();
        menu.pedirNombre();
        nombre = entrada.validarString();
        menu.pedirClasificacion();
        clasificacion = entrada.validarString();
        menu.pedirPlataforma();
        plataforma = entrada.validarString();
        menu.pedirPuntuacion();
        puntuacion = entrada.validarDouble();
        menu.pedirPrecio();
        precio = entrada.validarDouble();
        menu.stock();
        cantidad = entrada.validarInt();

        //SE AGREGA EL VIDEOJUEGO AL INVENTARIO.
        inventario.put(nombre.toLowerCase(),new Videojuego(nombre,clasificacion,plataforma,puntuacion,precio,cantidad));
    }

    @Override
    public void consultarJuego() {
        //CONSULTA DE JUEGO
        String juegoConsulta;
        menu.consultarJuego();
        menu.pedirNombre();
        juegoConsulta = entrada.validarString().toLowerCase();

        if(inventario.containsKey(juegoConsulta)){
            Videojuego encontrado = inventario.get(juegoConsulta);
            menu.juegoEncontrado(encontrado);
        }else{
            System.out.println("No se encontró ningún juego con ese nombre.");
        }

    }

    @Override
    public void editarJuego() {
        //INICIALIZACIÓN DE VARIABLES
        int opcion;
        boolean bandera = false;

        //MOSTRAR MENÚS
        menu.editarJuego();
        menu.pedirNombre();
        //ENTRADA PARA ESCRIBIR EL JUEGO A EDITAR
        String editarJuego = entrada.validarString().toLowerCase();

        //CICLO PARA BUSCAR EL JUEGO
        if(inventario.containsKey(editarJuego)){
            Videojuego juego = inventario.get(editarJuego);

            do{
                menu.editando(juego);
                menu.editarDatos();
                opcion = entrada.validarInt();

                //SWITCH PARA PODER EDITAR CADA DATO
                switch (opcion) {
                    case 1 :
                        editor.editarClasificacion(juego);
                        break;
                    case 2 :
                        editor.editarPlataforma(juego);
                        break;
                    case 3 :
                        editor.editarPuntuacion(juego);
                        break;
                    case 4 :
                        editor.editarPrecio(juego);
                        break;
                    case 5 :
                        editor.editarCantidad(juego);
                        break;
                    case 6 :
                        bandera = true;
                        break;
                    default:
                        break;
                }
            }while(!bandera);
        }

    }

    @Override
    public void eliminarJuego() {
        menu.eliminarJuego();
        menu.pedirNombre();
        String eliminarJuego = entrada.validarString().toLowerCase();

        if(inventario.remove(eliminarJuego) != null){
            inventario.remove(eliminarJuego);
            menu.eliminadoExito();
        }else{
            menu.eliminadoError();
        }

    }

    @Override
    public void mostrarInventario() {
        menu.mostrarInventario();
        for (Videojuego videojuego: inventario.values()) {
            System.out.println("\n");
            menu.juegoEncontrado(videojuego);
        }
    }
}
