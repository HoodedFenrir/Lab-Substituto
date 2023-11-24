import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Hola gamer, bienvenido a League of legends!");
        System.out.print("Antes de comenzar la aventura, ingresa el nombre de tu personaje: ");
        String nombrePersonaje = scn.nextLine();

        System.out.println("Elige el tipo de personaje: \n1. Mago\n2. Guerrero\n3. Arquero");

        int opcion = scn.nextInt();
        Personaje personaje = null;

        switch (opcion) {
            case 1:
                personaje = new Mago(nombrePersonaje);
                break;
            case 2:
                personaje = new Guerrero(nombrePersonaje);
                break;
            case 3:
                personaje = new Arquero(nombrePersonaje);
                break;
            default:
                System.out.println("Opción no válida. Seleccionando Mago por defecto.");
                personaje = new Mago(nombrePersonaje);
                break;
        }

        System.out.println("Has elegido a " + personaje.nombre + " el " + personaje.getClass().getSimpleName());

        for (int i = 0; i < 5; i++) {
            int tipoMonstruo = random.nextInt(2); // 0: MonstruoComun, 1: MonstruoFuerte
            Monstruo monstruo = null;

            if (tipoMonstruo == 0) {
                monstruo = new MonstruoComun("Slime " + (i + 1));
            } else {
                monstruo = new MonstruoFuerte("Rey Slime " + (i + 1), random.nextInt(3) + 1);
            }

            System.out.println("Te encuentras con: " + monstruo.nombre);

            boolean turnodeJugador = true;
            while (true) {
                if (turnodeJugador) {
                    System.out.println("Elige tu acción:\n1. Ataque básico\n2. Ataque especial");
                    int opcionAccion = scn.nextInt();

                    if (opcionAccion == 1) {
                        personaje.realizarAccionBasica();
                    } else if (opcionAccion == 2) {
                        personaje.realizarAccionEspecial();
                    } else {
                        System.out.println("Opción no válida. Tendrás que hacer ataque básico ('0_0).");
                        personaje.realizarAccionBasica();
                    }
                } else {
                    monstruo.realizarAccionBasica();
                }

                turnodeJugador = !turnodeJugador;

                if (monstruo instanceof MonstruoFuerte) {
                    MonstruoFuerte monstruoFuerte = (MonstruoFuerte) monstruo;
                    if (monstruoFuerte.getGolpesRestantes() <= 0) {
                        System.out.println(monstruo.nombre + " ha sido derrotado!");
                        break;
                    }
                }

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println(); 
        }

        System.out.println("¡Fin del juego!");

        scn.close();
    }
}
