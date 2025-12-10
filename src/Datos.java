public class Datos {
    private int id;
    private String titulo;
    private boolean estado;


    public Datos(int id, String titulo, boolean estado) {
        this.id = id;
        this.titulo = titulo;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return id+","+titulo+","+estado;
    }
}
