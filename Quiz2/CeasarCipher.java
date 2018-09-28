import java.util.Scanner;

public class CeasarCipher {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int codewordascii;
        int conversion;
        int newchr;
        int newascii;
        int messageascii;
        int x = 0;
        String message;
        String codeword;
        char chr;
        char chr2;
        char convertback;

        System.out.println("Enter your message to be encoded: ");
        message = scan.nextLine();

        System.out.println("Enter a word to encode your message with");
        codeword = scan.nextLine();

        for(int i = 0; i <= message.length() -1; i++) {                
            chr = message.charAt(i);
            messageascii = (int) chr;
            if(x < codeword.length()) {                                   
                chr2 = codeword.charAt(x);                              
                codewordascii = (int) chr2;      
                conversion = codewordascii - 96;                         
                newascii = messageascii + conversion;
                if(newascii > 122) {
                    newascii = newascii - 26;
                }
                convertback = (char) newascii;
                System.out.print(convertback);
                x++;                                                       
            }                                                               
            if(x >= codeword.length()) {                                    
                x = 0;                                                      
            }               
        }
    }
}