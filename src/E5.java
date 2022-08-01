import java.util.*;

//author Jose Reyes
public class E5 {

    public static void main(String[] args) {

        Random rnd = new Random();
        Integer[] azar = new Integer[20];

        for (int i=0; i<20; i++){
            int x = rnd.nextInt(14, 86)+1;
            azar[i]=x;
        }
        System.out.println("El primer vector generado es: " + Arrays.toString(azar));
        Arrays.sort(azar, Collections.reverseOrder());
        System.out.println("El vector ordenado (descendente) es: " + Arrays.toString(azar));
    }
}
