// Definición de la clase Monstruo
abstract class Monstruo implements AccionBasica {
    protected String nombre;

    public Monstruo(String nombre) {
        this.nombre = nombre;
    }
}