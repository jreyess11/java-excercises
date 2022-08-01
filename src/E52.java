import java.util.*;

public class E52 {


    /*
     * Función para hacer arreglos con nums al azar de 0 a 10, recibiendo un arreglo
     * tipo int[] y retornándolo.
     */

    public static int[] hacerArreglos(int[] l) {
        int random = 0;
        for (int i = 0; i < 20; i++) {
            Random random1 = new Random();
            random = random1.nextInt(11);
            l[i] = random;
        }
        return l;
    }

    public static void main(String[] args) {

        //Declaración e inicilaización de variables.

        int ceros = 0, cont = 0;
        int[] vector = new int[20];

        System.out.println("===SEPTIMO EJERCICIO===");

        //Se llama a la función para hacer el arreglo random.

        hacerArreglos(vector);
        System.out.println("El vector antes es: " + Arrays.toString(vector));



        while (cont < ceros) {
            for (int i = 0; i < 20; i++) {
                if (vector[i] == 0) {
                    for (int j = i; j < 20; j++) {
                        if ((j + 1) < 20) {
                            vector[j] = vector[j + 1];
                            vector[j + 1] = 0;
                        }
                    }
                }
            }
            cont++;
        }

        System.out.println("El nuevo vector es: " + Arrays.toString(vector));
    }
}