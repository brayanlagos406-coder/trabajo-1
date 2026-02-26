public class Libro {

    private String titulo;
    private String autor;
    private int cantidadDisponible;
    private boolean estado;

    // Constructor
    public Libro(String titulo, String autor, int cantidadDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDisponible = cantidadDisponible;
        this.estado = cantidadDisponible > 0;
    }

    // Getters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    // ---------------- MÉTODOS PROPIOS ----------------

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Cantidad disponible: " + cantidadDisponible);

        if (estado) {
            System.out.println("Estado: Disponible");
        } else {
            System.out.println("Estado: No disponible");
        }
    }

    public void agregarCopias(int cantidad) {
        if (cantidad > 0) {
            cantidadDisponible += cantidad;
            estado = true;
        }
    }

    public boolean consultarDisponibilidad() {
        return cantidadDisponible > 0;
    }

    public boolean prestarLibro(int cantidadSolicitada) {

        if (cantidadSolicitada <= 0) {
            return false;
        }

        if (cantidadDisponible >= cantidadSolicitada) {

            cantidadDisponible -= cantidadSolicitada;

            if (cantidadDisponible == 0) {
                estado = false;
            }

            return true;
        }

        return false;
    }
}