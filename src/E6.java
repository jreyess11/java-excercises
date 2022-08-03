import java.util.*;

//author Jose Reyes
public class E6 {

    public static Integer[] remover (Integer[] arr, int i){
        List<Integer> temp = new ArrayList<Integer>(Arrays.asList(arr));
        temp.remove(i);
        return temp.toArray(new Integer[0]);
    }

    public static void main(String[] args) {

        Random rnd = new Random();
        Integer[] A = new Integer[10];
        Integer[] B = new Integer[10];
        Integer[] C = new Integer[10];

        for (int i=0; i<10; i++){
            int x1 = rnd.nextInt(199, 1000)+1;
            int x2 = rnd.nextInt(199, 1000)+1;
            A[i]=x1;
            B[i]=x2;
        }
        System.arraycopy(A,0,C,0,A.length);
        System.out.println("El vector A es: " + Arrays.toString(A));
        System.out.println("El vector B es: " + Arrays.toString(B));

        for (int j=9; j>-1;j--){
            if (B[j]%2==0){
                A[j]=B[j];
            } else {
                A=remover(A,j);
            }
        }
        for (int j=9; j>-1;j--){
            if (C[j]%2==0){
                B=remover(B,j);
            } else {
                B[j]=C[j];
            }
        }
        System.out.println("\nORDENANDO");
        System.out.println("El nuevo vector A es: " + Arrays.toString(A));
        System.out.println("El nuevo vector B es: " + Arrays.toString(B));
    }
}
