import java.util.Scanner;

public class numprogmassiv {
    public static void main (String[] args){
        int[] mass = new int[101];
        mass[0] = 0;
        for (int i = 0; i< mass.length; i++){
            mass[i] = i;
            if (i % 2 != 0)
                System.out.println(mass[i]);
        }
    }
}
