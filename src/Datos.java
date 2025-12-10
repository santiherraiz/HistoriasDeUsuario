public class Datos {
    private int id;
    private String titulo;
    private Estado estado;
    private static int contador = 0;

    public Datos(String titulo, Estado estado) {
        this.id = contador++;
        this.titulo = titulo;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
