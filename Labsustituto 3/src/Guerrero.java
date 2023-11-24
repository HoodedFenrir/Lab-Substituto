class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre, "Espada");
    }

    @Override
    public void realizarAccionBasica() {
        System.out.println(nombre + " ataca con su espada");
    }

    @Override
    public void realizarAccionEspecial() {
        System.out.println(nombre + " aventando a sus enemigos!");
    }
}