class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre, "Arco y flechas");
    }

    @Override
    public void realizarAccionBasica() {
        System.out.println(nombre + " dispara flechas con su arco");
    }

    @Override
    public void realizarAccionEspecial() {
        System.out.println(nombre + " realiza un tiro certero!");
    }
}