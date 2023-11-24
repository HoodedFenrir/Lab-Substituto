// Definición de la clase Personaje
abstract class Personaje implements AccionBasica {
    protected String nombre;
    protected String arma;

    public Personaje(String nombre, String arma) {
        this.nombre = nombre;
        this.arma = arma;
    }

    public abstract void realizarAccionEspecial();
}