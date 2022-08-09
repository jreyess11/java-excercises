import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.IntStream;

//author Jose Reyes
public class E10 {

    public static int tarifa(int num){
        int COP = 0;
        if (25 < num && num <= 300){
            COP = + 1500 * num;
        }
        if (300 < num && num <= 500){
            COP = + 2500 * num;
        }
        return COP;
    }

    public static void main(String[] args) {

        int N, total = 0, i = 0;
        DecimalFormat df = new DecimalFormat("#,###.##");
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de bultos: ");
        N=scn.nextInt();
        List<Integer> controlpeso = new LinkedList<>();
        int controlprecio = 0;

        while (total < N){
            System.out.print("Ingrese el peso del bulto " + (i+1) + ": ");
            int peso = scn.nextInt();

            if (peso > 0){
                if (peso <= 500){
                    controlpeso.add(peso);
                    if (controlpeso.stream().reduce(Integer::sum).get()<=1000){
                        int C = tarifa(peso);
                        controlprecio += C;
                        i++;
                        total +=1;
                    } else {
                        controlpeso.remove(i);
                        System.out.print("\nLo sentimos, este bulto excede el tamano maximo de carga (18.000 kg).\n" +
                                "Por el momento su peso es " + controlpeso.stream().reduce(Integer::sum).get() + " kg." +
                                "\nOprima 1 si desea agregar otro bulto de menor tamano o 0 para terminar la lista: ");
                        int des = scn.nextInt();
                        if (des==0){
                            total = N;
                        } else {
                            System.out.println();
                        }
                    }
                } else {
                    System.out.println("Recuerde que un bulto no puede exceder los 500 kg");
                }
            } else {
                System.out.println("Por favor ingrese un peso valido.");
            }
        }

        double promedio = controlpeso.stream().reduce(Integer::sum).get() / controlpeso.size();
        double U = controlprecio/4337;
        System.out.println("\nEl peso final de la carga es "+ controlpeso.stream().reduce(Integer::sum).get() + " kg, con un total de " + controlpeso.size() +" bultos.");
        System.out.println("El peso del bulto mas pesado es " + Collections.max(controlpeso) + " kg y del menor es " + Collections.min(controlpeso) + " kg.");
        System.out.println("El peso promedio de los bultos es "+ df.format(promedio)+" kg.");
        System.out.println("El precio final de la carga es COP $"+ df.format(controlprecio) +" // USD $"+ df.format(U));


    }
}
