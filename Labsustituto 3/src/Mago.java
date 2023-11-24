// Definición de las clases para cada tipo de personaje
class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre, "Varita mágica");
    }

    @Override
    public void realizarAccionBasica() {
        System.out.println(nombre + " ataca con su varita mágica");
    }

    @Override
    public void realizarAccionEspecial() {
        System.out.println(nombre + " lanza un hechizo!");
    }
}