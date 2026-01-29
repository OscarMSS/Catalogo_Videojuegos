package Model;

public class Videojuego {
    //ATRIBUTOS DE LA CLASE
    String nombre;
    String clasificacion;
    String plataforma;
    double puntuacion;
    double precio;
    int cantidad;

    //constructor de la clase
    public Videojuego(String nombre, String clasificacion, String plataforma, double puntuacion, double precio,int cantidad) {
        this.nombre = nombre;
        this.clasificacion = clasificacion;
        this.plataforma = plataforma;
        this.puntuacion = puntuacion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    //sección de getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
