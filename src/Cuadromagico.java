// Author: Jose Reyes
import java.util.*;

public class Cuadromagico {

    public static void main(String[] args) {
        while (true){
            try{
                Scanner scn = new Scanner(System.in);
                System.out.print("\nIngrese el tamano N impar de su matriz (NxN): ");
                int N = scn.nextInt();
                int num = 1, i_temp = 0, j_temp = N/2, i=0, j;
                int[][] cuadro = new int[N][N];
                j = j_temp;
                while(num<=N*N){
                    if(cuadro[i][j]==0){
                        cuadro[i][j] = num;
                    } else {
                        i = i_temp+1;
                        j = j_temp;
                        cuadro[i][j] = num;
                    }
                    i_temp = i;
                    j_temp = j;
                    num++;
                    j++;
                    i--;
                    if (i<0){
                        i = N - 1;
                    }
                    if (j==N){
                        j = 0;
                    }
                }

                System.out.println("\nSu cuadro magico " +N+"x"+N+" es:");
                for (i=0; i<N; i++){
                    for (j=0; j<N; j++){
                        System.out.print(cuadro[i][j] + "\t" );
                    }
                    System.out.println(" ");
                }

                break;
            } catch(Exception e){
                System.out.println("El numero debe ser IMPAR");
            }
        }
    }
}
