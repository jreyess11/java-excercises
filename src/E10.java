import java.util.*;

//author Jose Reyes
public class E10 {

    public static void main(String[] args) {

        int cant, N;
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el tamano de su arreglo: ");
        cant=scn.nextInt();
        int[] arr = new int[cant];

        for (int i=0; i<cant; i++){
            int x = rnd.nextInt(50)+1;
            arr[i]=x;
        }

        System.out.println(Arrays.toString(arr));
        System.out.print("Ingrese el numero a buscar en el arreglo: ");
        N=scn.nextInt();

        if (Arrays.stream(arr).anyMatch(i -> i==N)){
            System.out.println("El numero " + N + " SI esta en el arreglo");
        } else {
            System.out.println("El numero " + N + " NO esta en el arreglo");
        }
    }
}
