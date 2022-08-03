import java.util.*;

public class Cuadromagico {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese el tamano N impar de su matriz (NxN): ");
        int N = scn.nextInt();
        int num = 1, it = 0, jt = N/2, i=0, j;

        int[][] cuadro = new int[N][N];

        j = jt;
        while (num<=N*N){
            if (cuadro[i][j]==0){
                cuadro[i][j]=num;
            } else {
                i = it+1;
                j = jt;
                cuadro[i][j]=num;
            }
            it=i;
            jt=j;
            num++;
            j++;
            i--;

            if (i<0){
                i=i+N;
            }
            if (j==N){
                j=0;
            }

        }

        for (i=0; i<N; i++){
            for (j=0; j<N; j++){
                System.out.print(cuadro[i][j] + "\t" );
            }
            System.out.println();
        }
    }
}
