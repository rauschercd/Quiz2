import java.util.Scanner;

public class SimpleCipher {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String message;
        int x = 0;
        int shiftamount;
        int asciiValue;
        char chr;

        System.out.println("Enter your message to be encoded: ");
        message = scan.nextLine();

        System.out.println("Enter shift amount: ");
        shiftamount = scan.nextInt();

        while(x < message.length()) {
            chr = message.charAt(x);
            
            asciiValue = (int) chr;
            asciiValue = asciiValue + shiftamount;

            if(asciiValue > 122) {
                asciiValue = asciiValue - 26;
            }

            char convertback = (char) asciiValue;

            System.out.print(convertback);

            x++;
        }
    }
}