import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*Ex.
         * p = 941	g = 627	a = 347	b = 781	-> 470
         *
         * p = 211	g =  57 a = 121 b = 142 -> 182
         */
        BigInteger p, g, a, b;

        System.out.println("Diffie Hellman Method\n");
        System.out.print("Common prime = ");
        p = sc.nextBigInteger();
        System.out.print("Primitive root = ");
        g = sc.nextBigInteger();
        System.out.print("Alice's number = ");
        a = sc.nextBigInteger();
        System.out.print("Bob's number = ");
        b = sc.nextBigInteger();

        Data data = new Data(p, g, a, b);
        Key key = new Key();
        Exchange module = new Exchange();

        key.setKey(module.exec(data));

        System.out.println("\nThe private key = " + key.getKey());

        sc.close();

    }

}
