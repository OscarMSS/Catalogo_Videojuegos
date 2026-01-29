package Model;
import Utilidades.InputManager;
import Utilidades.MenuManager;


public class App {
    //metodo constructor de la clase

    public App() {
    }


    // creación de objetos
    InputManager entrada = new InputManager();
    MenuManager menu = new MenuManager();
    Producion metodo = new Producion();

    public void iniciarApp(){
        //Inicualización de variables
        int opcion;
        boolean bandera = false;

        do{
            menu.mostrarMenu();
            opcion = entrada.validarInt();
            switch(opcion){
                case 1 :
                    metodo.agregarJuego();
                    break;
                case 2 :
                    metodo.consultarJuego();
                    break;
                case 3 :
                    metodo.editarJuego();
                    break;
                case 4 :
                    metodo.eliminarJuego();
                    break;
                case 5 :
                    metodo.mostrarInventario();
                    break;
                case 6 :
                    bandera = true;
                    break;
                default:
                    bandera = true;
                    break;
            }
        }while(!bandera);


    }

}
