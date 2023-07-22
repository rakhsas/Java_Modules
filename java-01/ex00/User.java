import java.util.UUID;

public class User {
    BigInteger generateId() {
        UUID i = UUID.randomUUID();
        System.out.println(i);
        return new BigInteger(i, 16);
    }
    public static void main (String []args)
    {
        User u1 = new User();
        u1.generateId();
        return 0;
    }
}