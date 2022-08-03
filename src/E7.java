import java.util.*;

//author Jose Reyes
public class E7 {

    public static Integer[] remover (Integer[] arr, int i){
        List<Integer> temp = new ArrayList<Integer>(Arrays.asList(arr));
        temp.remove(i);
        return temp.toArray(new Integer[0]);
    }


    public static void main(String[] args) {

        Random rnd = new Random();
        Integer[] A = new Integer[20];
        Integer[] temp = new Integer[20];
        int cont = 0;

        for (int i=0; i<20; i++){
            int x = rnd.nextInt(-1,10)+1;
            A[i]=x;
        }

        System.out.println("El primer vector es: " + Arrays.toString(A));
        System.out.println("\nORDENANDO");

        for(int j=19;j>-1;j--){
            if (A[j]==0){
                A=remover(A,j);
                cont++;
            }
        }
        System.arraycopy(A,0,temp,0,20-cont);
        Arrays.fill(temp,20-cont,temp.length,0);
        A=temp;
        System.out.println("El nuevo vector (ceros al final) es: " + Arrays.toString(A));
    }
}
