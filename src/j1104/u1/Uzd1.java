package j1104.u1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Uzd1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in=new Scanner(new File("1104_1.txt"));
        int n=in.nextInt();
        int[] mas=new int[n];
        for (int i=0; i<n; i++){
            mas[i]=in.nextInt();
        }

        int suma=0;
        int min=mas[0];
        int max=mas[0];
        for (int i=0; i<n; i++){
            suma+=mas[i];

            if (min>mas[i])
                min=mas[i];

            if (max<mas[i])
                max=mas[i];
        }

        System.out.println("Mažiausias skaičius: "+min);
        System.out.println("Didžiausias skaičius: "+max);
        System.out.printf("Suma: %d, Vidurkis: %5.2f  \n",suma, (double)suma/n);

        for (int i=0; i<n; i++){
            System.out.print(mas[i]+" ");
        }
    }
}
