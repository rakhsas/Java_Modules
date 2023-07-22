
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int iter = 1;
        System.out.print("->  ");
        int number = Sc.nextInt();
        if ( number < 2)
        {
            System.out.println("IllegalArgument");
            System.exit(257);
        }else {
            for (int i = 2; i <= Math.sqrt(number); i++)
            {
                iter++;
                if (number % i == 0)
                {
                    System.out.println("false " + (iter-1));
                    System.exit(-1);
                }
            }
        }
        System.out.println("true " + iter);
    }
}