package Utilidades;
import Model.Videojuego;

public class MenuManager {

    // constructor de la clase
    public MenuManager() {
    }

    //METODO PARA MISTRAR EL MENÚ
    public void mostrarMenu(){
        System.out.println("\n");
        System.out.println("============================= Menú de Registro Game Store =============================");
        System.out.println("1.Registrar un Videojuego.");
        System.out.println("2.Consultar un titulo registrado.");
        System.out.println("3.Editar un titulo registrado.");
        System.out.println("4.Eliminar un titulo registrado.");
        System.out.println("5.Mostrar Inventaro completo.");
        System.out.println("6.Salir.");

        System.out.println("\nElija una opción: ");
    }

    public void editando(Videojuego videojuego){
        System.out.println("Editanto: "+videojuego.getNombre());
    }


    public void eliminadoExito(){
        System.out.println("✅ El videojuego ha sido eliminado del sistema.");
    }

    public void eliminadoError(){
        System.out.println("❌ No se encontró el juego.");
    }

    public void juegoEncontrado(Videojuego videojuego) {
        System.out.println("=== Juego encontrado ===");
        System.out.println("Nombre: " + videojuego.getNombre());
        System.out.println("Clasificación: " + videojuego.getClasificacion());
        System.out.println("Plataforma: " + videojuego.getPlataforma());
        System.out.println("Puntuación: " + videojuego.getPuntuacion());
        System.out.println("Precio: $" + videojuego.getPrecio());
        System.out.println("Cantidad en stock: " + videojuego.getCantidad());
    }

    public void registrarJuego(){
        System.out.println("============================= Registrar un Videojuego =============================");
    }

    public void pedirNombre(){
        System.out.println("Ingrese el nombre del Videojuego: ");
    }

    public void pedirClasificacion(){
        System.out.println("Ingrese la clasificación del Videojuego: ");
    }

    public void pedirPlataforma(){
        System.out.println("Ingrese la plataforma a la que pertenece el Videojuego: ");
    }

    public void pedirPuntuacion(){
        System.out.println("Ingrese la puntuación del Videojuego: ");
    }

    public void pedirPrecio(){
        System.out.println("Ingrese el preció del Videojuego: ");
    }

    public void stock(){
        System.out.println("Ingrese el stock disponible del Videojuego: ");
    }


    public void consultarJuego(){
        System.out.println("============================= Consultar un Videojuego =============================");
    }

    public void editarJuego(){
        System.out.println("============================= Editar un Videojuego =============================");
    }

    public void eliminarJuego(){
        System.out.println("============================= Eliminar un Videojuego =============================");
    }

    public void mostrarInventario(){
        System.out.println("============================= Inventario =============================");
    }

    public void editarDatos(){
        System.out.println("========== Menú de Edición ==========");
        System.out.println("1. Editar Nombre.");
        System.out.println("2. Editar Clasificación.");
        System.out.println("3. Editar Plataforma.");
        System.out.println("4. Editar Puntuación.");
        System.out.println("5. Editar Precio.");
        System.out.println("6. Editar Cantidad.");
        System.out.println("7. Cancelar.");
        System.out.println("\nElija una Opción: ");
    }

}
