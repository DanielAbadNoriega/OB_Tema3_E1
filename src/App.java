public class App {
    public static void main(String[] args) throws Exception {

        /* Primera parte */
        suma(1, 2, 3);

        /* Segunda parte */
        Coche miCoche = new Coche();

        miCoche.sumaPuerta();

        System.out.println("Mi coche tiene : " + miCoche.puertas + " puertas.");
    }

    public static void suma(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("La solucion es: " + result);
    }
}

class Coche {
    int puertas = 0;

    public int sumaPuerta() {
        return this.puertas++;
    }
}