import java.util.Scanner;

public class Program {

    public int sumNumber(int number)
    {
        int sum = 0;
        for (int n = 0; number > 0; n++) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
    public boolean isPrime(int number)
    {
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String []args) {
        Program p1 = new Program();
        int count = 0;
        while (true)
        {
            Scanner Sc = new Scanner(System.in);
            System.out.print("->");
            int number = Sc.nextInt();
            if (number == 42)
            {
                System.out.println("Count of coffee-request : " + count);
                break;
            } else {
                number = p1.sumNumber(number);
                if (p1.isPrime(number))
                    count ++;
            }
        }
    }
}