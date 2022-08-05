import java.util.Scanner;

public class numprog {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        for (int number = scan.nextInt(); number > 0; number -= 1){
            if (number % 2 == 0)
                System.out.println(number);
        }
    }
}
