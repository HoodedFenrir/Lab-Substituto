// Definición de las clases para cada tipo de monstruo
class MonstruoComun extends Monstruo {
    public MonstruoComun(String nombre) {
        super(nombre);
    }

    @Override
    public void realizarAccionBasica() {
        System.out.println(nombre + " muerde");
    }
}