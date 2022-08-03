import java.util.*;

//author Jose Reyes
public class E9 {

    public static void main(String[] args) {

        int cant;
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el tamano de su arreglo: ");
        cant=scn.nextInt();
        int[] arr = new int[cant];

        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                if (i==4 || j==4){
                    patron[i][j]="o";
                } else {
                    patron[i][j]="-";
                }
            }
        }

        for (int i=0; i<9; i++){
            for (int j=0; j<9; j++){
                System.out.print(patron[i][j] + "  " );
            }
            System.out.println();
        }
    }
}
