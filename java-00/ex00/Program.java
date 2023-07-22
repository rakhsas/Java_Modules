public class Program {
    public static void main(String[] args){
        int i = 479598;
        int sum = 0;
        for (int n = 0; i > 0; n++) {
            sum += i % 10;
            i /= 10;
        }
        System.out.println(sum);
    }
}
