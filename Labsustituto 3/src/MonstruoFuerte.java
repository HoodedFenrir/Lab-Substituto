class MonstruoFuerte extends Monstruo {
    private int golpesRestantes;

    public MonstruoFuerte(String nombre, int golpesRestantes) {
        super(nombre);
        this.golpesRestantes = golpesRestantes;
    }

    public int getGolpesRestantes() {
        return golpesRestantes;
    }


    @Override
    public void realizarAccionBasica() {
        if (golpesRestantes > 0) {
            System.out.println(nombre + " golpea");
            golpesRestantes--;
        } else {
            System.out.println(nombre + " muerde");
        }
    }
}